package entities;

import status.EstimateStatus;

public class Estimate extends Entity {

    private User expert;
    private Product product;
    private int estimate;
    private EstimateStatus status;

    public Estimate(int id, User expert, int estimate, Product product) {
        super(id);
        this.expert = expert;
        this.estimate = estimate;
        this.product = product;
        this.status = EstimateStatus.NO_ESTIMATE;
    }
    public User getExpert() {
        return expert;
    }
    public void setExpert(User expert) {
        this.expert = expert;
    }
    public int getEstimate() {
        return estimate;
    }
    public void setEstimate(int estimate) {
        this.estimate = estimate;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public EstimateStatus getStatus() {
        return status;
    }
    public void setStatus(EstimateStatus status) {
        this.status = status;
    }

}
