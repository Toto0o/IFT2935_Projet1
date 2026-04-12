package scenes;

import controllers.Controller;
import entities.users.User;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import session.UserSession;

public class MyAccount extends AppScene {

    private User user;

    public MyAccount(Controller controller) {
        super(controller);
        //user = UserSession.getInstance().getUser();
    }

    @Override
    public void setScene() {
        VBox header = new VBox();
        root.setTop(header);

        HBox buttonBox = new HBox();

        Button btnLogout = new Button("Logout");
        btnLogout.setOnAction(e -> {
            controller.logout();
        });

        Button btnMyProducts = new Button("My products");
        btnMyProducts.setOnAction(e -> {
            controller.changeScene(SceneName.MY_PRODUCTS);
        });

        Button btnBuyProducts = new Button("Buy products");
        btnBuyProducts.setOnAction(e -> {
            controller.changeScene(SceneName.BUY_PRODUCTS);
        });

        buttonBox.getChildren().addAll(
                 btnMyProducts, btnBuyProducts, btnLogout
        );
        buttonBox.setSpacing(10);
        buttonBox.setAlignment(Pos.CENTER_RIGHT);
        header.getChildren().add(buttonBox);

        BorderPane content = new BorderPane();
        root.setCenter(content);

        content.getChildren().add(
                new Text("My account")
        );

        //controller.getEntitiesBuilder().showProfile(user, content);

    }
}
