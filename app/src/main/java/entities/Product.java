package entities;

public class Product extends Entity {

    private String name, specification;
    private int id;
    private User owner;
    private Estimate estimate;
    private Offer offer;

    public Product(int id, String name, String specification, User owner) {
        super(id);
        this. name = name;
        this.specification = specification;
        this.owner = owner;
        this.estimate = null;
        this.offer = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
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
}

