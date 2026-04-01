package status;

public enum OfferStatus {
    NO_OFFER("No offer"),
    OFFERED("New offer"),
    REFUSED("Refused"),
    ACCEPTED("Accepted");

    private final String displayName;

    OfferStatus(String s) {
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
