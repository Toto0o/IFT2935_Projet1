package entities.offers;

import entities.Entity;

public class Offer extends Entity {

    private double price;
    private String message;
    private int productId;
    private int userId;
    private OfferStatus status;

    public Offer(int id, double price, String message, int productId, int userId) {
        super(id);
        this.price = price;
        this.message = message;
        this.productId = productId;
        this.userId = userId;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getBuyerId() {
        return userId;
    }
    public void setBuyer(int userId) {
        this.userId = userId;
    }
    public OfferStatus getStatus() {
        return status;
    }
    public void setStatus(OfferStatus status) { this.status = status; }
    public String getMessage() {return this.message;}
    public void setMessage(String message) {this.message = message;}
}
