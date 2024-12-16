package Algorithm;

public class Main {

    public static void main(String[] args) {
        Tractor t1 = new Tractor("red", "Supercar");
        Plane p1 = new Plane("blue", "Plane");

        gui gui = new gui();
        gui.addProduct(t1);
        gui.addProduct(p1);
        gui.addProduct(new Flugzeug());

        gui.run();
    }

}
