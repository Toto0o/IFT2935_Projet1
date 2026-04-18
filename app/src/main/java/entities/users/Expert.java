package entities.users;

import controllers.Controller;
import entities.estimates.Estimate;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class Expert {

    private int product_id;
    private Controller controller;

    public Expert(int product_id, Controller controller) {
        this.product_id = product_id;
        this.controller = controller;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void estimateProduct() {
        Stage stg = new Stage();
        Pane root = new Pane();
        Scene scene = new Scene(root, 200, 200);
        stg.setScene(scene);
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        Button estimate = new Button("Estimate");
        estimate.setOnAction(e -> {
            Random rand = new Random();
            int estimatation = rand.nextInt(1000) + 1;
            int experId = controller.getEntityController().getRandomExpert();
            Estimate es = new Estimate(
                    -1,
                    experId,
                    estimatation,
                    product_id,
                    false
            );
            controller.getEntityController().addEstimate(es);
            vbox.getChildren().clear();
            Text done = new Text("Expert estimation finished!");
            Button close = new Button("Close");
            close.setOnAction(e1 -> {
                stg.close();
            });
            vbox.getChildren().addAll(done, close);
        });
        stg.setTitle("Expert estimate");
        vbox.getChildren().addAll(estimate);
        root.getChildren().add(vbox);
        stg.show();

    }
}
