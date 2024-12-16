package Algorithm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class gui {
   
    private List<Product> procucts = new ArrayList<Product>();

    private Scanner scanner = new Scanner(System.in);

    public void addProduct(Product product) {
        this.procucts.add(product);
    }

    public void run() {
        while (true) {
            System.out.println("1 Show Products");
            System.out.println("2 Show Stock value");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showProducts();
                    break;

                default:
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
}

