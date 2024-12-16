package Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gui {

    private List<Product> procucts = new ArrayList<Product>();
    private List<Char> chars = new ArrayList<Char>();

    private Scanner scanner = new Scanner(System.in);

    public void addProduct(Product product) {
        this.procucts.add(product);
    }

    public void run() {
        boolean done = false;
        while (!done) {
            System.out.println("1: Show Products");
            System.out.println("2: Show Stock value");
            System.out.println("Everything else: End Program");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showProducts();
                    break;

                case 2:
                    showChar();;

                default:
                    done = true;
                    break;
            }

        }
    }

    private void showProducts() {
        System.out.println("show Products");
        for (Product product : procucts) {
            System.out.println("Name: " + product.getName());
        }

    }

    private void showChar() {
        System.out.println("show Char");
        for (Char Char : chars) {
            System.out.println("Name: " + Char.getChar());
        }

    }
}