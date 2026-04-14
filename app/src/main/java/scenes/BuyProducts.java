package scenes;

import controllers.Controller;
import entities.products.Product;
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
        HBox titleBox = new HBox();
        HBox btnBox = new HBox();
        header.getChildren().addAll(btnBox, titleBox);

        Button btnLogout = new Button("Logout");
        btnLogout.setOnAction(e -> {
            controller.getEntityController().logout();
        });

        Button btnMyProducts = new Button("My products");
        btnMyProducts.setOnAction(e -> {
            controller.getSceneController().changeScene(SceneName.MY_PRODUCTS, controller);
        });

        Button btnMyProfile = new Button("My account");
        btnMyProfile.setOnAction(e -> {
            controller.getSceneController().changeScene(SceneName.MY_ACCOUNT, controller);
        });

        btnBox.getChildren().addAll(btnMyProducts, btnMyProfile, btnLogout);
        btnBox.setSpacing(10);
        btnBox.setAlignment(Pos.CENTER_RIGHT);

        Text pageTitle = new Text("Acheter des produits");
        pageTitle.getStyleClass().add("title");

        titleBox.getChildren().add(pageTitle);
        titleBox.setAlignment(Pos.CENTER);

        TilePane content = new TilePane();
        root.setTop(header);
        root.setCenter(content);

        ProgressIndicator spinner = new ProgressIndicator();
        content.getChildren().setAll(spinner);

        Task<List<Product>> getProducts = new Task<>() {
            @Override
            protected List<Product> call() throws Exception {
                return controller.getEntityController().getProducts();
            }
        };
        getProducts.setOnSucceeded(e -> {
            List<Product> products = getProducts.getValue();

            //controller.getEntityController().getEntitiesBuilder().showAllProducts(products, content);
            content.getChildren().add(
                    new Text("Success!!")
            );
        });
        getProducts.setOnFailed(e -> {
            getProducts.getException().printStackTrace();
            content.getChildren().setAll(new Text("Erreur lors du chargement des produits"));
        });

        new Thread(getProducts).start();
    }
}
