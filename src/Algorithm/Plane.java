package Algorithm;

public class Plane implements Product {

    private String style;
    private String name;

    public Plane(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getChar() {
        return style;
    }

}
