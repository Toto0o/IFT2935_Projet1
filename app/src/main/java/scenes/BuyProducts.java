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



        Task<List<Product>> getProducts = new Task<>() {
            @Override
            protected List<Product> call() throws Exception {
                return controller.getEntityController().getAllProducts();
            }
        };
        getProducts.setOnSucceeded(e -> {
            List<Product> products = getProducts.getValue();

            ScrollPane sp = controller.getEntityController().getGraphicBuilder().allProducts(products, controller, true);
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
