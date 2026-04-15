package scenes;

import controllers.Controller;
import entities.products.Product;
import javafx.concurrent.Task;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
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

        VBox header = new VBox();
        root.setTop(header);

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
                return null;
                //return controller.findProductByAnnoucerId(id);
            }
        };

        getProductsByAnnoucerId.setOnSucceeded(e -> {
            List<Product> products = getProductsByAnnoucerId.getValue();

            //controller.getEntitiesBuilder().showAllProducts(products, content);
            content.getChildren().add(
                    new Text("Success!!")
            );
        });
        getProductsByAnnoucerId.setOnFailed(e -> {
            content.getChildren().setAll(new Text("Erreur lors du chargement des produits"));
        });
    }
}
