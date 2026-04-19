package entities.offers;

import controllers.Controller;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import session.UserSession;

public class MakeOffer {

    private int product_id;
    private Controller controller;

    public MakeOffer(int product_id, Controller controller) {
        this.product_id = product_id;
        this.controller = controller;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void start() {
        Stage stage = new Stage();
        Pane root = new Pane();
        Scene scene = new Scene(root, 200, 200);
        stage.setScene(scene);
        stage.setTitle("MakeOffer");

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        Label label = new Label("Make your offer !");
        TextField tf = new TextField();

        Button save = new Button("Save");
        save.setOnAction(e -> {
            double price = Double.parseDouble(tf.getText());
            int userId = UserSession.getInstance().getUser().getId();
            System.out.println("New offer user id : " + userId);
            Offer offer = new Offer(
                    -1,
                    price,
                    "new offer!",
                    this.product_id,
                    userId
            );
            controller.getEntityController().addNewOffer(offer);
            vbox.getChildren().clear();

            Text text = new Text("Offer Saved. You can close this page");
            vbox.getChildren().add(text);
        });
        vbox.getChildren().addAll(label, tf, save);
        root.getChildren().addAll(vbox);
        stage.show();
    }
}
