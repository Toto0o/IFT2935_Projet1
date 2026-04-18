package db.dto;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class TableBuilder<E extends DTO<E>> {

    private List<E> listDTO;

    public TableBuilder(List<E> listDTO) {
        this.listDTO = listDTO;
    }

    public ScrollPane build() {
        TableView<E> tableView = new TableView<>();
        tableView.getItems().addAll(listDTO);
        DTO<E> dto = listDTO.getFirst();

        tableView.getColumns().addAll(dto.getTableColumns());

        VBox box = new VBox(tableView);

        return new ScrollPane(box);

    }



}
