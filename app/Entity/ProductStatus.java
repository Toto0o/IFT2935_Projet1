package Entity;

public enum ProductStatus {
    NO_ESTIMATE("No estimate"),
    NO_OFFER("No offer"),
    OFFER("Has an offer"),
    SOLD("Is sold");

    private final String displayName;

    ProductStatus(String s) {
        this.displayName = s;
    }

    private String getDisplayName() {
        return this.displayName;
    }

    @Override
    public String toString() {
        return getDisplayName();
    }
}
