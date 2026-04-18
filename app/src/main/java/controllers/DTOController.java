package controllers;

import db.DbService;
import db.dto.*;
import entities.products.Product;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.sql.SQLException;
import java.util.List;

public class DTOController {

    private DbService dbService;

    private TableBuilder<BuyerOfferAverage> boaTB;
    private TableBuilder<CategoryCount> ccTB;
    private TableBuilder<ProductEstimateCount> pecTB;
    private TableBuilder<ProductOfferCount> pocTB;
    private TableBuilder<UserProductPriceEstimate> uppeTB;
    private TableBuilder<UserProducts> upTB;
    private TableBuilder<UserProductsEstimate> upeTB;

    public DTOController(DbService dbService) {
        this.dbService = dbService;
    }

    public ScrollPane getBuyerOfferAverage() {
        ScrollPane scrollPane;
        try {
            List<BuyerOfferAverage> buyerOfferAverages = dbService.getBuyerOfferAverage();
            boaTB = new TableBuilder<>(buyerOfferAverages);
            scrollPane = boaTB.build();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return scrollPane;
    }
    public ScrollPane getCategoryCount() {
        ScrollPane scrollPane;
        try {
            List<CategoryCount> categoryCounts = dbService.getCategoryCount();
            ccTB = new TableBuilder<>(categoryCounts);
            scrollPane = ccTB.build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return scrollPane;
    }
    public ScrollPane getProductEstimateCount() {
        ScrollPane scrollPane;
        try {
            List<ProductEstimateCount> productEstimateCounts = dbService.getProductEstimateCount();
            pecTB = new TableBuilder<>(productEstimateCounts);
            scrollPane = pecTB.build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return scrollPane;
    }
    public ScrollPane getProductOfferCount() {
        ScrollPane scrollPane;
        try {
            List<ProductOfferCount> productOfferCounts = dbService.getProductOfferCount();
            pocTB = new TableBuilder<>(productOfferCounts);
            scrollPane = pocTB.build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return scrollPane;
    }
    public ScrollPane getUserProductPriceEstimate() {
        ScrollPane scrollPane;
        try {
            List<UserProductPriceEstimate> userProductPriceEstimates = dbService.getUserProductPriceEstimate();
            uppeTB = new TableBuilder<>(userProductPriceEstimates);
            scrollPane = uppeTB.build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return scrollPane;
    }
    public ScrollPane getUserProductsLowPrices() {
        ScrollPane scrollPane;
        try {
            List<UserProducts> userProducts = dbService.getUserProductsLowPrices();
            upTB = new TableBuilder<>(userProducts);
            scrollPane = upTB.build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return scrollPane;
    }
    public ScrollPane getAcceptedDecision() {
        ScrollPane scrollPane;
        try {
            List<UserProductsEstimate> userProductsEstimates = dbService.getAcceptedDecision();
            upeTB = new TableBuilder<>(userProductsEstimates);
            scrollPane = upeTB.build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return scrollPane;
    }


}
