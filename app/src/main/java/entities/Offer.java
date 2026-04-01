package entities;

import status.OfferStatus;

public class Offer extends Entity {

    private int price;
    private Product product;
    private User buyer;
    private OfferStatus status;

    public Offer(int id, int price, Product product, User buyer) {
        super(id);
        this.price = price;
        this.product = product;
        this.buyer = buyer;
        this.status = OfferStatus.NO_OFFER;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public User getBuyer() {
        return buyer;
    }
    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }
    public OfferStatus getStatus() {
        return status;
    }
}
