package scenes;

import controllers.Controller;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;

public class BuyProducts extends AppScene {

    public BuyProducts(Controller controller) {
        super(controller);
    }

    @Override
    public void setScene() {
        HBox header = new HBox();
        TilePane content = new TilePane();
        root.setTop(header);
        root.setCenter(content);
    }
}
