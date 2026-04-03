package entities;

import status.EstimateStatus;

public class Estimate extends Entity {

    private int expertId;
    private int productId;
    private int estimate;
    private EstimateStatus status;

    public Estimate(int id, int expertId, int estimate, int productId) {
        super(id);
        this.expertId = expertId;
        this.estimate = estimate;
        this.productId = productId;
        this.status = EstimateStatus.NO_ESTIMATE;
    }
    public int getExpertId() {
        return expertId;
    }
    public void setExpertId(int expertId) {
        this.expertId = expertId;
    }
    public int getEstimate() {
        return estimate;
    }
    public void setEstimate(int estimate) {
        this.estimate = estimate;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public EstimateStatus getStatus() {
        return status;
    }
    public void setStatus(EstimateStatus status) {
        this.status = status;
    }

}
