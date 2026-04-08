package entities.estimates;

import entities.Entity;

public class Estimate extends Entity {

    private int expertId;
    private int productId;
    private double estimate;
    private boolean decision;

    public Estimate(int id, int expertId, int estimate, int productId, boolean decision) {
        super(id);
        this.expertId = expertId;
        this.estimate = estimate;
        this.productId = productId;
        this.decision = decision;
    }
    public int getExpertId() {
        return expertId;
    }
    public void setExpertId(int expertId) {
        this.expertId = expertId;
    }
    public double getEstimate() {
        return estimate;
    }
    public void setEstimate(double estimate) {
        this.estimate = estimate;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public boolean getDecision() {return this.decision;}
    public void setDecision(boolean decision) {this.decision = decision;}

}
