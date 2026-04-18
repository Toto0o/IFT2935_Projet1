package entities.products;

import entities.Entity;

public class Product extends Entity {

    private String title, description;
    private ProductCategory categorie;
    ProductState ps;
    ProductStatus status;
    private int announcerId;
    private double price;

    public Product(int id, String title, String description, ProductState ps, ProductCategory categorie, ProductStatus status, int announcerId, double price) {
        super(id);
        this.title = title;
        this.description = description;
        this.ps = ps;
        this.categorie = categorie;
        this.announcerId = announcerId;
        this.status = status;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductState getPs() {
        return ps;
    }

    public void setPs(ProductState ps) {
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

