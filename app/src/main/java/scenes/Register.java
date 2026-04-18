package scenes;

import entities.users.User;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import status.RegisterStatus;
import controllers.Controller;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class Register extends AppScene {

    public Register(Controller controller) {
        super(controller);
    }

    @Override
    public void setScene() {
        VBox vbox = new VBox();

        Text pageTitle = new Text("Register");

        Button btnRegister = new Button("Register");

        Hyperlink lnkLogin = new Hyperlink("Already have an account? Login");
        lnkLogin.setOnAction(e -> {
            controller.getSceneController().changeScene(SceneName.LOGIN, controller);
        });

        TextField tfUser = new TextField();
        Label lblUser = new Label("Email");

        TextField tfFName = new TextField();
        Label lblFName = new Label("First name");

        TextField tfLName = new TextField();
        Label lblLName = new Label("Last name");

        PasswordField pfPass = new PasswordField();
        Label lblPass = new Label("Password");

        Label lblStatus = new Label("");

        root.setCenter(vbox);

        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-text-fill: white;");
        vbox.getChildren().add(pageTitle);
        vbox.getChildren().addAll(
                lblStatus,
                lblUser, tfUser,
                lblFName, tfFName,
                lblLName, tfLName,
                lblPass, pfPass,
                btnRegister, lnkLogin);
        vbox.setSpacing(10);

        pageTitle.getStyleClass().add("title");

        btnRegister.setOnAction(e -> {
            String user = tfUser.getText().trim();
            String pass = pfPass.getText().trim();
            String fname = tfFName.getText().trim();
            String lname = tfLName.getText().trim();

            RegisterStatus status = controller.getEntityController().register(user, pass, lname, fname, false);
            lblStatus.setText(status.toString());

            if (status == RegisterStatus.REGISTERED) {
                controller.getSceneController().changeScene(SceneName.BUY_PRODUCTS, controller);
            }
        });
    }
}
