package entities;

import controllers.Controller;
import entities.offers.Offer;
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

    public ScrollPane allProducts(List<Product> products, Controller controller, boolean offer) {
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

        TableColumn<Product, Void> makeOfferCol = new TableColumn<>("Make Offer");
        makeOfferCol.setCellFactory(col -> new TableCell<>() {
            private final Button makeOfferButton = new Button("Make Offer");

            {
                makeOfferButton.setOnAction(event -> {
                    Product p = getTableView().getItems().get(getIndex());
                    controller.getSceneController().makeOffer(p.getId(), controller);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                setGraphic(empty ? null : makeOfferButton);
            }
        });

        tableView.getColumns().addAll(nameColumn, priceColumn, stateColumn, categoryColumn, statusColumn);
        if (offer) {
            tableView.getColumns().add(makeOfferCol);
        }

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(tableView);
        return scrollPane;
    }

    public ScrollPane allOffers(List<Offer> offers) {
        TableView<Offer> tableView = new TableView<>();
        tableView.getItems().addAll(offers);

        TableColumn<Offer, String> nameColumn = new TableColumn<>("Product_id");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("product_id"));
        TableColumn<Offer, String> priceColumn = new TableColumn<>("Price");
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        TableColumn<Offer, ProductState> stateColumn = new TableColumn<>("Status");
        stateColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        tableView.getColumns().addAll(nameColumn, priceColumn, stateColumn);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(tableView);
        return scrollPane;
    }

}
