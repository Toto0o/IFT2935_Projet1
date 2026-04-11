package entities;

import controllers.Controller;
import entities.products.Product;
import entities.users.User;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

import java.util.List;

public class EntitiesBuilder {

    private Controller controller;

    public EntitiesBuilder(Controller controller) {
        this.controller = controller;
    }

    public void showAllProducts(List<Product> products, Pane content) {
        for (Product product : products) {
            content.getChildren().add(
                    showProduct(product)
            );
        }
    }

    private BorderPane showProduct(Product product) {
        BorderPane main = new BorderPane();

        Button btnClose = new Button("x");
        main.setTop(btnClose);

        VBox content = new VBox();

        Text txtTitre = new Text(product.getTitre());
        TextField tfTitre = new TextField();
        tfTitre.setId("tfTitre");
        tfTitre.setEditable(false);
        Label lblTitre = new Label("Titre : ");

        Text txtDescription = new Text(product.getDescription());
        TextField tfDescription = new TextField();
        tfDescription.setId("tfDescription");
        tfDescription.setEditable(false);
        Label lblDescription = new Label("Description : ");

        Text txtEtat = new Text(product.getProductState().toString());
        TextField tfEtat = new TextField();
        tfEtat.setId("tdEtat");
        tfEtat.setEditable(false);
        Label lblEtat = new Label("État");

        Text txtCategorie = new Text(product.getCategorie().toString());
        TextField tfCategorie = new TextField();
        tfCategorie.setId("tfCategorie");
        tfCategorie.setEditable(false);
        Label lblCategorie = new Label("Catégorie : ");

        content.getChildren().addAll(
                lblTitre, txtTitre,
                lblDescription, txtDescription,
                lblCategorie, txtCategorie
        );

        Button btnSave = new Button("Enregistrer");
        btnSave.setDisable(true);
        btnSave.setOnMouseClicked(save -> {
            String titre = (!tfTitre.getText().isEmpty())
                    ? tfTitre.getText().trim()
                    : product.getTitre();
            String description = (!tfDescription.getText().isEmpty())
                    ? tfDescription.getText().trim()
                    : product.getDescription();
            String etat = (!tfEtat.getText().isEmpty())
                    ? tfEtat.getText().trim()
                    : product.getProductState().toString();
            String categorie = (!tfDescription.getText().isEmpty())
                    ? tfCategorie.getText().trim()
                    : product.getCategorie().toString();

            controller.updateProduct(product.getId(), titre, description, etat, categorie);

            tfTitre.setEditable(false);
            tfDescription.setEditable(false);
            tfEtat.setEditable(false);
            tfCategorie.setEditable(false);

            btnSave.setDisable(true);
        });

        Button btnEdit = new Button("Modifier");
        btnEdit.setOnMouseClicked(edit -> {
            tfTitre.setEditable(true);
            tfDescription.setEditable(true);
            tfEtat.setEditable(true);
            tfCategorie.setEditable(true);

            btnSave.setDisable(false);
            btnEdit.setDisable(true);
        });

        HBox btnBox = new HBox();
        btnBox.getChildren().addAll(btnEdit, btnSave);
        content.getChildren().add(btnBox);

        return main;
    }

    public void showProfile(User user, Pane content) {

    }
}
