package entities;

import status.OfferStatus;

public class Offer extends Entity {

    private int price;
    private int productId;
    private int buyerId;
    private OfferStatus status;

    public Offer(int id, int price, int productId, int buyerId) {
        super(id);
        this.price = price;
        this.productId = productId;
        this.buyerId = buyerId;
        this.status = OfferStatus.NO_OFFER;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getBuyerId() {
        return buyerId;
    }
    public void setBuyer(int buyerId) {
        this.buyerId = buyerId;
    }
    public OfferStatus getStatus() {
        return status;
    }
}
