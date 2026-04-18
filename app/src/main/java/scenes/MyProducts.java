package scenes;

import controllers.Controller;
import entities.products.Product;
import entities.products.ProductCategory;
import entities.products.ProductState;
import entities.products.ProductStatus;
import javafx.concurrent.Task;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import session.UserSession;

import java.util.List;

public class MyProducts extends AppScene {

    public MyProducts(Controller controller) {
        super(controller);
    }

    @Override
    public void setScene() {


        TilePane content = new TilePane();
        root.setCenter(content);

        VBox side = new VBox();
        Button newProduct = new Button("New Product");
        side.getChildren().add(newProduct);
        newProduct.setOnAction(e -> {

            VBox form = new VBox();

            Label lblTitle = new Label("Title");
            TextField tfTitle = new TextField();
            tfTitle.setPromptText("Title");
            tfTitle.getStyleClass().add("text-field");

            Label lblDescription = new Label("Description");
            TextField tfDescription = new TextField();
            tfTitle.setPromptText("Description");
            tfTitle.getStyleClass().add("text-field");

            Label lblState = new Label("State");
            ChoiceBox<String> stateChoice = new ChoiceBox<>();
            stateChoice.getItems().addAll(ProductState.toStringArray());
            stateChoice.getStyleClass().add("text-field");

            Label lblCategory = new Label("Category");
            ChoiceBox<String> categoryChoice = new ChoiceBox<>();
            categoryChoice.getStyleClass().add("text-field");
            categoryChoice.getItems().addAll(ProductCategory.toStringArray());

            Label lblPrice = new Label("Price");
            TextField tfPrice = new TextField();
            tfPrice.setPromptText("Price");
            tfPrice.getStyleClass().add("text-field");

            form.getChildren().setAll(
                    lblTitle, tfTitle,
                    lblDescription, tfDescription,
                    lblState, stateChoice,
                    lblCategory, categoryChoice,
                    lblPrice, tfPrice
            );

            Button save = new Button("Save");
            save.setOnAction(event -> {
                System.out.println("save button clicked : userSessionId" +
                        UserSession.getInstance().getUser().getId());
                String title = tfTitle.getText().trim();
                String description = tfDescription.getText().trim();
                String state = stateChoice.getValue();
                String category = categoryChoice.getValue();
                int announcer_id = UserSession.getInstance().getUser().getId();
                double price = Double.parseDouble(tfPrice.getText().trim());

                controller.getEntityController().addProduct(
                        new Product(
                                -1, title, description,
                                ProductState.getProductState(state),
                                ProductCategory.getProductCategory(category),
                                ProductStatus.ACTIVE, announcer_id, price),
                        controller);
                controller.getSceneController().changeScene(SceneName.MY_PRODUCTS, controller);
            });

            form.getChildren().add(save);
            form.setAlignment(Pos.CENTER);
            form.setSpacing(10);
            root.setCenter(form);
        });


        VBox header = new VBox();
        root.setTop(header);

        root.setLeft(side);

        HBox titleBox = new HBox();
        header.getChildren().addAll(navBar, titleBox);


        Text pageTitle = new Text("My products");
        pageTitle.getStyleClass().add("title");

        titleBox.getChildren().add(pageTitle);
        titleBox.setAlignment(Pos.CENTER);

        int id = UserSession.getInstance().getUser().getId();

        Task<List<Product>> getProductsByAnnoucerId = new Task<>() {
            @Override
            protected List<Product> call() throws Exception {
                return controller.getEntityController().getProductsByAnnouncerId(id);
            }
        };

        getProductsByAnnoucerId.setOnSucceeded(e -> {
            List<Product> products = getProductsByAnnoucerId.getValue();

            ScrollPane sp = controller.getEntityController().getGraphicBuilder().allProducts(products, controller, false);
            sp.setFitToHeight(true);
            sp.setFitToWidth(true);
            content.getChildren().add(sp);
            content.setAlignment(Pos.CENTER);
        });
        getProductsByAnnoucerId.setOnFailed(e -> {
            getProductsByAnnoucerId.getException().printStackTrace();
            content.getChildren().setAll(new Text("Erreur lors du chargement des produits"));
        });

        new Thread(getProductsByAnnoucerId).start();
    }
}
