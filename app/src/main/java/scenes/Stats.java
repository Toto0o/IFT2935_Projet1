package scenes;

import controllers.Controller;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Stats extends AppScene {

    public Stats(Controller controller) {
        super(controller);
    }

    @Override
    public void setScene() {
        System.out.println(controller);
        root.setTop(navBar);

        VBox sidebar = new VBox();
        sidebar.setSpacing(10);
        root.setLeft(sidebar);

        Button btnBOA = new Button("Buyer offer average");
        btnBOA.setOnAction(e -> {
            ScrollPane sp = controller.getDtoController().getBuyerOfferAverage();
            root.setCenter(sp);
        });

        Button btnCC = new Button("Number of products per category");
        btnCC.setOnAction(e -> {
            ScrollPane sp = controller.getDtoController().getCategoryCount();
            root.setCenter(sp);
            sp.setFitToHeight(true);
            sp.setFitToWidth(true);
        });

        Button btnPEC = new Button("Number of estimates per product");
        btnPEC.setOnAction(e -> {
            ScrollPane sp = controller.getDtoController().getProductEstimateCount();
            root.setCenter(sp);
            sp.setFitToHeight(true);
            sp.setFitToWidth(true);
        });

        Button btnPOC = new Button("Number of offer per product");
        btnPOC.setOnAction(e -> {
            ScrollPane sp = controller.getDtoController().getProductOfferCount();
            root.setCenter(sp);
            sp.setFitToHeight(true);
            sp.setFitToWidth(true);
        });

        Button btnUPPE = new Button("Detailed list of products per user");
        btnUPPE.setOnAction(e -> {
            ScrollPane sp = controller.getDtoController().getUserProductPriceEstimate();
            root.setCenter(sp);
            sp.setFitToHeight(true);
            sp.setFitToWidth(true);
        });

        Button btnLowPrice = new Button("Offer lower than estimate");
        btnLowPrice.setOnAction(e -> {
            ScrollPane sp = controller.getDtoController().getUserProductsLowPrices();
            root.setCenter(sp);
            sp.setFitToHeight(true);
            sp.setFitToWidth(true);
        });

        Button btnAccepted = new Button("Accepted offers");
        btnAccepted.setOnAction(e -> {
            ScrollPane sp = controller.getDtoController().getAcceptedDecision();
            root.setCenter(sp);
            sp.setFitToHeight(true);
            sp.setFitToWidth(true);
        });

        sidebar.getChildren().addAll(
                btnBOA, btnCC, btnPEC, btnPOC, btnUPPE, btnLowPrice, btnAccepted
        );

    }
}
