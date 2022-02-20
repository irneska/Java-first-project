package ua.lviv.iot;

public record Sofa(String colour, String fabric, Double price, Double width, Double length) {
    private static final String BRAND_OF_SOFA = "Blest";

    Sofa() {
        this("Blue", null, null, null, null);
    }
    Sofa(String colour, String fabric, double price) {
        this(colour , fabric, price, null, null);
    }

    @Override
    public String toString() {
        return "Sofa(colour= " + this.colour
                + ", fabric = " + this.fabric
                + ", price = " + this.price
                + ", width = " + this.width
                + ", length = " + this.length
                + ")";
    }

    public static String getStaticField(){
        return BRAND_OF_SOFA;
    }
}
