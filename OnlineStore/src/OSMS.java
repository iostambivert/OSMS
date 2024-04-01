
import java.util.ArrayList;
import java.util.List;

public class OSMS {

    static OSMSTester Tester = new OSMSTester();
    private final List<Product> storage = new ArrayList<Product>();

    public void addProduct(Product product) {
        storage.add(product);
    }

    public boolean removeProduct(Product product) {
        boolean removed = false;
        for (int i = 0; i < storage.size(); i++) {
            Product p = storage.get(i);
            if (p.getProduct().equals(product.getProduct()) && p.getPrice().equals(product.getPrice())) {
                storage.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }
    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty");
        } else {
            for (Product p: storage) {
                System.out.println(p.getPrice() + ", " + p.getProduct());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Tester.tester();
    }


}
