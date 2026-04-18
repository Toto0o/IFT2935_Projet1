package db.dto;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.Serializable;

public class ProductOfferCount implements DTO<ProductOfferCount> {

    private String productName;
    private int offerCount;

    public ProductOfferCount(String productName, int offerCount) {
        this.productName = productName;
        this.offerCount = offerCount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getOfferCount() {
        return offerCount;
    }

    public void setOfferCount(int offerCount) {
        this.offerCount = offerCount;
    }

    @Override
    public TableColumn<ProductOfferCount, ?>[] getTableColumns() {
        TableColumn<ProductOfferCount, ?>[] columns = new TableColumn[2];
        columns[0] = new TableColumn<>("Product Name");
        columns[0].setCellValueFactory(new PropertyValueFactory<>("productName"));
        columns[1] = new TableColumn<>("Offer Count");
        columns[1].setCellValueFactory(new PropertyValueFactory<>("offerCount"));
        return columns;
    }
}
