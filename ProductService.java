import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ProductService {
	List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }
    
    
    // Using Loop get product with place name
    public List<Product> getProductWithPlace(String place){
    	List<Product> productPlace = new ArrayList<>();
        for(Product p : products){
            if(p.getPlace().equals(place))
            	productPlace.add(p);
                }
        return productPlace;
    }
    
   // Using Stream API  get product with place name
    public List<Product> getProductsWithPlaceStreamApi(String place) {

		List<Product> filteredPlace= products.stream()
				.filter(product -> product.getPlace().toLowerCase().contains(place.toLowerCase()))
				.collect(Collectors.toList());
		return filteredPlace;
	}
 // Using Loop get product with out of warranty
    public List<Product> getProductWithOutOfWarranty(){
    	List<Product> warrantyOutProd = new ArrayList<>();
    	for(Product p : products) {
    		if(p.getWarranty() < 2023) 
    			warrantyOutProd.add(p);
    		}
    	return warrantyOutProd;
    	
    }
    
   //// Using Stream  get product with place name
    public List<Product> getProductWithOutOfWarrantyStreamAPI() {

		List<Product> filteredwarrantyOutProd = products.stream()
				.filter(products -> products.getWarranty() < LocalDateTime.now().getYear())
				.collect(Collectors.toList());

		return filteredwarrantyOutProd;

	}
    
   
}
