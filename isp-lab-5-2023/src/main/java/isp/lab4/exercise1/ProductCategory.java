package isp.lab4.exercise1;

/**
 * @author Radu Miron
 */
public enum ProductCategory {
    ELECTRONICS("Electronics & Gadgets"),
    FASHION("Fashion");
    // todo: add the rest of the constants

    private String displayName;

    private String Electronics;
    private String Fashion;
    private String Home_And_Garden;

    private String Beauty;
private String Toys;
    ProductCategory(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
