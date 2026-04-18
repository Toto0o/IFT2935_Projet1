package entities.offers;

import entities.products.ProductCategory;

public enum OfferStatus {
    ACCEPTED("accepted"),
    DECLINED("declined"),
    PENDING("pending");

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

    public static OfferStatus getOfferStatus(String status) {
        OfferStatus of = null;
        for (OfferStatus offerStatus : OfferStatus.values()) {
            if (offerStatus.toString().equals(status)) {
                of = offerStatus;
            }
        }
        return of;
    }
}
