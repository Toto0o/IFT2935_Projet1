package entities.products;

public enum ProductCategory {
    CARS("cars"),
    REAL_ESTATE("Real estate"),
    PETS("Pets"),
    SERVICE("Service");

    private final String displayName;

    ProductCategory(String s) {
        this.displayName = s;
    }

    private String getDisplayName() {
        return this.displayName;
    }

    @Override
    public String toString() {
        return getDisplayName();
    }

    public static ProductCategory getProductCategory(String category) {
        ProductCategory pc = null;
        for (ProductCategory productCategory : ProductCategory.values()) {
            if (productCategory.toString().equals(category)) {
                pc = productCategory;
            }
        }
        return pc;
    }
}
