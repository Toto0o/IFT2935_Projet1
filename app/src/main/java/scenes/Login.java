package scenes;

import javafx.scene.text.Text;
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

        Button btnRegister = new Button("Register");
        btnRegister.setId("btnRegister");

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
        vbox.getChildren().addAll(lblStatus, lblUser, tfUser, lblPass, pfPass, btnLogin, btnRegister);
        vbox.setSpacing(10);

        pageTitle.setStyle("-fx-text-fill: white;-fx-font-size: 14px;");

        tfUser.setMaxWidth(250);
        pfPass.setMaxWidth(250);

        btnLogin.setOnMouseClicked(login -> {
            String user = tfUser.getText().trim();
            String pass = pfPass.getText().trim();
            LoginStatus status = controller.login(user, pass);
            lblStatus.setText(status.toString());
        });

        btnRegister.setOnMouseClicked(register ->
            controller.changeScene(SceneName.REGISTER)
        );
    }
}
