package db.dto;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.Serializable;

public class UserProductsEstimate implements DTO<UserProductsEstimate> {

    private String userName;
    private String productName;
    private double price;
    private double estimate;

    public UserProductsEstimate(String userName, String productName, double price, double estimate) {
        this.userName = userName;
        this.productName = productName;
        this.price = price;
        this.estimate = estimate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getEstimate() {
        return estimate;
    }
    public void setEstimate(double estimate) {
        this.estimate = estimate;
    }



    @Override
    public TableColumn<UserProductsEstimate, ?>[] getTableColumns() {
        TableColumn<UserProductsEstimate, ?>[] columns = new TableColumn[4];
        columns[0] = new TableColumn<UserProductsEstimate, String>("userName");
        columns[0].setCellValueFactory(new PropertyValueFactory<>("username"));
        columns[1] = new TableColumn<UserProductsEstimate, String>("productName");
        columns[1].setCellValueFactory(new PropertyValueFactory<>("productName"));
        columns[2] = new TableColumn<UserProductsEstimate, Double>("price");
        columns[2].setCellValueFactory(new PropertyValueFactory<>("price"));
        columns[3] = new TableColumn<UserProductsEstimate, Double>("estimate");
        columns[3].setCellValueFactory(new PropertyValueFactory<>("estimate"));
        return columns;
    }
}
