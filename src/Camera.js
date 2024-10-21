package at.bas.projects.camera;

public class Camera {
    private String color;
    private float weight;
    private int pixel;
    private SDcard sDcard;

    // Constructor

    public Camera(String color, float weight, int pixel, SDcard sDcard) {
        this.color = color;
        this.weight = weight;
        this.pixel = pixel;
        this.sDcard = sDcard;
    }

    public void getInfo() {
        System.out.println("----------------------\n" + "SDCard: ");
        sDcard.getInfo();
    }

    // Getter and Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }
}