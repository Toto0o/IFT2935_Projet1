package db.dto;

import javafx.scene.control.TableColumn;


public interface DTO<E> {

    public TableColumn<E, ?>[] getTableColumns();

}
