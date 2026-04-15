package scenes;

import controllers.Controller;
import entities.products.Product;
import entities.products.ProductCategory;
import entities.products.ProductState;
import javafx.concurrent.Task;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.List;

public class BuyProducts extends AppScene {

    public BuyProducts(Controller controller) {
        super(controller);
    }

    @Override
    public void setScene() {
        double minValue, maxValue;
        VBox header = new VBox();
        HBox titleBox = new HBox();;
        header.getChildren().addAll(navBar, titleBox);

        Text pageTitle = new Text("Acheter des produits");
        pageTitle.getStyleClass().add("title");

        titleBox.getChildren().add(pageTitle);
        titleBox.setAlignment(Pos.CENTER);

        VBox content = new VBox();
        root.setTop(header);
        root.setCenter(content);

        ProgressIndicator spinner = new ProgressIndicator();
        content.getChildren().add(spinner);

        VBox addProducts = new VBox();

        Label lblTitle = new Label("Ttitle");
        TextField txtTitle = new TextField();

        Label lblDescription = new Label("Description");
        TextField txtDescription = new TextField();

        Label lblState = new Label("State");
        ChoiceBox<String> stateChoice = new ChoiceBox<>();
        stateChoice.getItems().addAll(
                ProductState.values().toString()
        );

        Label lblCategory = new Label("Category");
        ChoiceBox<String> categoryChoice = new ChoiceBox<>();
        categoryChoice.getItems().addAll(
                ProductCategory.values().toString()
        );

        Label lblPrice = new Label("Price");


        Button newProduct = new Button("New Product");
        newProduct.setOnAction(e -> {

        });

        Task<List<Product>> getProducts = new Task<>() {
            @Override
            protected List<Product> call() throws Exception {
                return controller.getEntityController().getAllProducts();
            }
        };
        getProducts.setOnSucceeded(e -> {
            List<Product> products = getProducts.getValue();

            ScrollPane sp = controller.getEntityController().getGraphicBuilder().allProducts(products);
            sp.setFitToHeight(true);
            sp.setFitToWidth(true);
            content.getChildren().add(sp);
            content.getChildren().remove(spinner);
        });
        getProducts.setOnFailed(e -> {
            getProducts.getException().printStackTrace();
            content.getChildren().setAll(new Text("Erreur lors du chargement des produits"));
        });

        new Thread(getProducts).start();
    }
}
