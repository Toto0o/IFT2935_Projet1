package entities.products;

import entities.Entity;

public class Product extends Entity {

    private String titre, description;
    private ProductCategory categorie;
    ProductState ps;
    ProductStatus status;
    private int id;
    private int announcerId;

    public Product(int id, String titre, String description, ProductState ps, ProductCategory categorie, ProductStatus status, int announcerId) {
        super(id);
        this.titre = titre;
        this.description = description;
        this.ps = ps;
        this.categorie = categorie;
        this.announcerId = announcerId;
        this.status = status;
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

    public ProductState getProductState() {
        return ps;
    }

    public void setProductState(ProductState ps) {
        this.ps = ps;
    }

    public int getAnnouncerId() {
        return announcerId;
    }

    public void setAnnouncerId(int announcerId) {
        this.announcerId = announcerId;
    }

    public ProductCategory getCategorie() {
        return categorie;
    }

    public void setCategorie(ProductCategory categorie) {
        this.categorie = categorie;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }
}

