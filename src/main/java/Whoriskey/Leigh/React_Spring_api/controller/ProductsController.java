package Whoriskey.Leigh.React_Spring_api.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import Whoriskey.Leigh.React_Spring_api.model.Product;

@CrossOrigin(origins = "*")
@RestController
public class ProductsController {

    List<Product> products = List.of(
            new Product(1, "Product A", "A great product", "1.0", "Windows, Mac", "Standard"),
            new Product(2, "Product B", "Another great product", "2.1", "Linux, Windows", "Premium")
        );

    @GetMapping("/api/products")
    public Map<String, List<Product>> getAllProducts() { 
        return Map.of("products", products);
    }

    @GetMapping("/api/product/{id}")
    public Optional<Product> getServiceById(@PathVariable int id){
        return products.stream().filter(product -> product.getId() == id).findFirst();
    }
}
