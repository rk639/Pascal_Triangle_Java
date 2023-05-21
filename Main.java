import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {

        ProductService service = new ProductService();

        // hey service, add the products..

        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

//        Search product which is placed at particular location using loop
        System.out.println("Serach the Product placed at Black table for loop is used ");
        List<Product> pdct = service.getProductWithPlace("Black Table");
        for(Product product : pdct){
          System.out.println(product);
          }
        System.out.println("***********************************************");
        System.out.println("Serach the Product placed at Black table Stream API is used ");
        List<Product> pdct1 =service.getProductsWithPlaceStreamApi("Black Table");
        Stream<Product> z= pdct1.stream();
        z.forEach(System.out::println);
    
        
        
     // Search product which is running out warranty 
        System.out.println("***********************************************");
        System.out.println("Serach the product which is running out of warranty for loop used");
        List<Product> outWarProd = service.getProductWithOutOfWarranty();
        for(Product product : outWarProd){
            System.out.println(product);
        }
        System.out.println("***********************************************");
        System.out.println("Serach the product which is running out of warranty Stream api loop used");
        List<Product> outWarProd1 = service.getProductWithOutOfWarrantyStreamAPI();
        Stream<Product> x= outWarProd1.stream();
        x.forEach(System.out::println);
       }
}
