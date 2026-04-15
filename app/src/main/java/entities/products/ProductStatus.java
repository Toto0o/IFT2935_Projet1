package entities.products;

public enum ProductStatus {
    ACTIVE("active"),
    SOLD("sold");

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

    public static ProductStatus getProductStatus(String status) {
        ProductStatus ps = null;
        for (ProductStatus productStatus : ProductStatus.values()) {
            if (productStatus.toString().equals(status)) {
                ps = productStatus;
            }
        }
        return ps;
    }
}
