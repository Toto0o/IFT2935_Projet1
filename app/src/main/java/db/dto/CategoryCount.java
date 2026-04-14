package db.dto;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public class CategoryCount implements DTO<CategoryCount> {

    private String category;
    private int count;
    private double average;

    public CategoryCount(String category, int count, double average) {
        this.category = category;
        this.count = count;
        this.average = average;
    }

    @Override
    public TableColumn<CategoryCount, ?>[] getTableColumns() {
        TableColumn<CategoryCount, ?>[] columns = new TableColumn[3];
        columns[0] = new TableColumn<>(category);
        columns[0].setCellValueFactory(new PropertyValueFactory<>("category"));
        columns[1] = new TableColumn<>("Category count");
        columns[1].setCellValueFactory(new PropertyValueFactory<>("count"));
        columns[2] = new TableColumn<>("Offer average");
        columns[2].setCellValueFactory(new PropertyValueFactory<>("average"));
        return columns;
    }

}
