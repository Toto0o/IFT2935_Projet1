package db.dto;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public class UserProductPriceEstimate implements  DTO<UserProductPriceEstimate> {

    private String firstName;
    private String productName;
    private double price;
    private double estimate;

    public UserProductPriceEstimate(String firstName, String productName, double price, double estimate) {
        this.firstName = firstName;
        this.productName = productName;
        this.price = price;
        this.estimate = estimate;
    }

    @Override
    public TableColumn<UserProductPriceEstimate, ?>[] getTableColumns() {
        TableColumn<UserProductPriceEstimate, ?>[] columns = new TableColumn[4];
        columns[0] = new TableColumn<UserProductPriceEstimate, String>("First Name");
        columns[0].setCellValueFactory(new PropertyValueFactory<>("firstName"));
        columns[1] = new TableColumn<UserProductPriceEstimate, String>("Product Name");
        columns[1].setCellValueFactory(new PropertyValueFactory<>("productName"));
        columns[2] = new TableColumn<UserProductPriceEstimate, Double>("Price");
        columns[2].setCellValueFactory(new PropertyValueFactory<>("price"));
        columns[3] = new TableColumn<UserProductPriceEstimate, Double>("Estimate");
        columns[3].setCellValueFactory(new PropertyValueFactory<>("estimate"));
        return columns;
    }

    {}
}
