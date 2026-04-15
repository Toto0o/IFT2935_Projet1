package entities;

import controllers.Controller;
import entities.products.Product;
import entities.products.ProductCategory;
import entities.products.ProductState;
import entities.products.ProductStatus;
import entities.users.User;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

import java.util.List;

public class GraphicBuilder {

    public GraphicBuilder() {}

    public ScrollPane allProducts(List<Product> products) {
        TableView<Product> tableView = new TableView<>();
        tableView.getItems().addAll(products);

        TableColumn<Product, String> nameColumn = new TableColumn<>("Title");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

        TableColumn<Product, String> priceColumn = new TableColumn<>("Description");
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("description"));

        TableColumn<Product, ProductState> stateColumn = new TableColumn<>("State");
        stateColumn.setCellValueFactory(new PropertyValueFactory<>("ps"));

        TableColumn<Product, ProductCategory> categoryColumn = new TableColumn<>("Category");
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("categorie"));

        TableColumn<Product, ProductStatus> statusColumn = new TableColumn<>("Status");
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        tableView.getColumns().addAll(nameColumn, priceColumn, stateColumn, categoryColumn, statusColumn);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(tableView);
        return scrollPane;
    }

}
