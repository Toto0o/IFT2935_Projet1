package db.dto;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class BuyerOfferAverage implements DTO<BuyerOfferAverage> {

    private String username;
    private double offerAverage;

    public BuyerOfferAverage(String username, double offerAverage) {
        this.username = username;
        this.offerAverage = offerAverage;
    }

    @Override
    public TableColumn<BuyerOfferAverage, ?>[] getTableColumns() {
        TableColumn<BuyerOfferAverage, ?>[] columns = new TableColumn[2];
        columns[0] = new TableColumn("Username");
        columns[0].setCellValueFactory(new PropertyValueFactory<>("username"));
        columns[1] = new TableColumn("Offer Average");
        columns[1].setCellValueFactory(new PropertyValueFactory<>("offerAverage"));
        return columns;
    }
}
