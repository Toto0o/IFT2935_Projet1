package entities.products;

public enum ProductState {
    NEW("new"),
    LIKE_NEW("like new"),
    USED("used");

    private final String displayName;

    ProductState(String s) {
        this.displayName = s;
    }

    private String getDisplayName() {
        return this.displayName;
    }

    @Override
    public String toString() {
        return getDisplayName();
    }

    public static ProductState getProductState(String state) {
        ProductState ps = null;
        for (ProductState productState : ProductState.values()) {
            if (productState.toString().equals(state)) {
                ps = productState;
            }
        }
        return ps;
    }
}
