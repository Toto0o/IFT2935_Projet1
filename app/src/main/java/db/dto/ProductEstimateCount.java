package db.dto;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.Serializable;

public class ProductEstimateCount implements DTO<ProductEstimateCount> {

    private String productName;
    private int count;
    private double average;

    public ProductEstimateCount(String productName, int count, double average) {
        this.productName = productName;
        this.count = count;
        this.average = average;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }


    @Override
    public TableColumn<ProductEstimateCount, ?>[] getTableColumns() {
        TableColumn<ProductEstimateCount, ?>[] columns = new TableColumn[3];
        columns[0] = new TableColumn<>("Product name");
        columns[0].setCellValueFactory(new PropertyValueFactory<>("productName"));
        columns[1] = new TableColumn<>("Count");
        columns[1].setCellValueFactory(new PropertyValueFactory<>("count"));
        columns[2] = new TableColumn<>("Average");
        columns[2].setCellValueFactory(new PropertyValueFactory<>("average"));
        return columns;
    }
}
