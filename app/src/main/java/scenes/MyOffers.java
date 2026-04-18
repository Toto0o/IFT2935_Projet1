package scenes;

import controllers.Controller;
import entities.offers.Offer;
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

public class MyOffers extends AppScene {

    public MyOffers(Controller controller) {
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


        Text pageTitle = new Text("My Offers");
        pageTitle.getStyleClass().add("title");

        titleBox.getChildren().add(pageTitle);
        titleBox.setAlignment(Pos.CENTER);

        int id = UserSession.getInstance().getUser().getId();

        Task<List<Offer>> getOffersByUserId = new Task<>() {
            @Override
            protected List<Offer> call() throws Exception {
                return controller.getEntityController().getOffersByUserId(id);
            }
        };

        getOffersByUserId.setOnSucceeded(e -> {
            List<Offer> offers = getOffersByUserId.getValue();

            ScrollPane sp = controller.getEntityController().getGraphicBuilder().allOffers(offers);
            sp.setFitToHeight(true);
            sp.setFitToWidth(true);
            content.getChildren().add(sp);
            content.setAlignment(Pos.CENTER);
        });
        getOffersByUserId.setOnFailed(e -> {
            getOffersByUserId.getException().printStackTrace();
            content.getChildren().setAll(new Text("Erreur lors du chargement des produits"));
        });

        new Thread(getOffersByUserId).start();
    }
}
