package db.dto;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public class UserProducts implements DTO <UserProducts> {

    private String userName;
    private String productName;
    private double price;


    public UserProducts(String userName, String productName, double price) {
        this.userName = userName;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public TableColumn<UserProducts, ?>[] getTableColumns() {
        TableColumn<UserProducts, ?>[] columns = new TableColumn[3];
        columns[0] = new TableColumn<UserProducts, String>("username");
        columns[0].setCellValueFactory(new PropertyValueFactory<>("username"));
        columns[1] = new TableColumn<UserProducts, String>("productName");
        columns[1].setCellValueFactory(new PropertyValueFactory<>("productName"));
        columns[2] = new TableColumn<UserProducts, Double>("price");
        columns[2].setCellValueFactory(new PropertyValueFactory<>("price"));
        return columns;
    }
}
