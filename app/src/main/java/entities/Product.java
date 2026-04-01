package entities;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;

public class Product extends Entity {

    private String titre, description, etat, categorie;
    private int id;
    private User owner;
    private Estimate estimate;
    private Offer offer;

    public Product(int id, String name, String etat, String categorie, String description, User owner) {
        super(id);
        this.titre = name;
        this.description = description;
        this.etat = etat;
        this.categorie = categorie;
        this.owner = owner;
        this.estimate = null;
        this.offer = null;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Estimate getEstimate() {
        return estimate;
    }

    public void setEstimate(Estimate estimate) {
        this.estimate = estimate;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public VBox draw(boolean showEstimate) {
        VBox vBox = new VBox();

        Text txtTitre = new Text(this.titre);
        TextField tfTitre = new TextField();
        tfTitre.setId("tfTitre");
        Label lblTitre = new Label("Titre");

        Text txtDescription = new Text(this.description);
        TextField tfDescription = new TextField();
        tfDescription.setId("tfDescription");
        Label lblDescription = new Label("Description");

        Text txtEtat = new Text(this.etat);
        TextField tfEtat = new TextField();
        tfEtat.setId("tdEtat");
        Label lblEtat = new Label("État");

        Text txtEstimate = new Text(this.estimate.getEstimate() + " $");
        Label lblEstimate = new Label("Estimation");
        txtEstimate.setVisible(showEstimate);
        lblEstimate.setVisible(showEstimate);

        Text txtCategorie = new Text(this.categorie);
        TextField tfCategorie = new TextField();
        tfCategorie.setId("tfCategorie");
        Label lblCategorie = new Label("Catégorie");

        Button btnEdit = new Button("Modifier");
        Button btnClose = new Button("x");
        Button btnSave = new Button("Enregistrer");

        vBox.getChildren().addAll(
                lblTitre, txtTitre,
                lblDescription, txtDescription,
                lblEstimate, txtEstimate,
                lblCategorie, txtCategorie
        );


        return vBox;
    }
}

