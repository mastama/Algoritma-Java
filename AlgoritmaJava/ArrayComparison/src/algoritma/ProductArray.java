package algoritma;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductArray {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Indomie", 3000, 5D, 150),
                new Product("Laptop", 4000000, 4.5, 123),
                new Product("Aqua", 3000, 4D, 250),
                new Product("Smart TV", 4000000, 4.5, 42),
                new Product("Headphone", 4000000, 3.5, 90),
                new Product("Very Smart TV", 4000000, 3.5, 87)
        };

        List<Product> productList = List.of(products);

        printProductList(productList);

        // 1. produk harga comparator
        Comparator<Product> hargaComparator = (p1, p2) -> p2.getHarga().compareTo(p1.getHarga());

        // 2. produk rating comparator reverse
        Comparator<Product> ratingComparator = (p1, p2) -> p2.getRating().compareTo(p1.getRating());

        // 3. produk likes comparator reverse or descending
        Comparator<Product> likesComparator = (p1, p2) -> p2.getLikes().compareTo(p1.getLikes());

        Comparator<Product> productComparator = hargaComparator
                .thenComparing(ratingComparator)
                .thenComparing(likesComparator);

        productList = productList.stream().sorted(productComparator)
                .collect(Collectors.toList());

        printProductList(productList);
    }

    public static void printProductList(List<Product> productList) {
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println("--END--");
    }
}
