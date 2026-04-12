package scenes;

import javafx.scene.text.Text;
import session.UserSession;
import status.LoginStatus;
import controllers.Controller;

import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Login extends AppScene {

    public Login(Controller controller) {
        super(controller);
    }

    @Override
    public void setScene() {
        VBox vbox = new VBox();

        Text pageTitle = new Text("Login");

        Button btnLogin = new Button("Login");
        btnLogin.setId("btnLogin");

        Hyperlink lnkRegister = new Hyperlink("Don't have an account? Register");
        lnkRegister.setOnAction(e -> {
           controller.changeScene(SceneName.REGISTER);
        });

        TextField tfUser = new TextField();
        tfUser.setId("tfUser");

        PasswordField pfPass = new PasswordField();
        pfPass.setId("pfPass");

        Label lblUser = new Label("Username");
        Label lblPass = new Label("Password");
        Label lblStatus = new Label("");;
        root.setCenter(vbox);

        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-text-fill: white;");
        vbox.getChildren().add(pageTitle);
        vbox.getChildren().addAll(lblStatus, lblUser, tfUser, lblPass, pfPass, btnLogin, lnkRegister);
        vbox.setSpacing(10);

        pageTitle.getStyleClass().add("title");

        btnLogin.setOnAction(e -> {
            String user = tfUser.getText().trim();
            String pass = pfPass.getText().trim();

            LoginStatus status = controller.login(user, pass);
            lblStatus.setText(status.toString());

            if (status == LoginStatus.SUCCESS) {
                controller.changeScene(SceneName.BUY_PRODUCTS);
            } else {
                tfUser.clear();
                pfPass.clear();
            }
        });
    }
}
