package Whoriskey.Leigh.React_Spring_api.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Whoriskey.Leigh.React_Spring_api.model.Eligibility;
import Whoriskey.Leigh.React_Spring_api.model.Product;
import Whoriskey.Leigh.React_Spring_api.model.Service;


@RestController
public class EligibilityController {

    private final Map<String, List<Service>> getServicesByEligibility = Map.of(
        "Premium", List.of(
            new Service("scv01", "24/7 Customer Support", 
             "Round-the-clock access to our dedicated customer support team.",
             "Support", "Standard, Premium",
             "Calls may be recorded for quality and training purposes. Service availability is subject to network conditions. We do not guarantee issue resolution but will make every effort to assist. By using this service, you agree to our terms"),
            new Service("scv02", "Health Consultation",
             "Virtual consultation sessions with certified professionals.",
              "Health", "Premium", "Up to 5 sessions per month.")
        
        ),
        "Standard", List.of(
            new Service("scv01", "24/7 Customer Support", 
             "Round-the-clock access to our dedicated customer support team.",
             "Support", "Standard, Premium",
             "Calls may be recorded for quality and training purposes. Service availability is subject to network conditions. We do not guarantee issue resolution but will make every effort to assist. By using this service, you agree to our terms")
        )
    );

    private final Map<String, List<Product>> getProductsByEligibility = Map.of(
        "Premium", List.of(
            new Product(1, "Product A", "A great product", "1.0", "Windows, Mac", "Standard"),
            new Product(2, "Product B", "Another great product", "2.1", "Linux, Windows", "Premium")
        ),
        "Stanard", List.of(
            new Product(1, "Product A", "A great product", "1.0", "Windows, Mac", "Standard")

        )
    );

    @GetMapping("/api/eligibility")
    public Eligibility getAllEligibility() {
        List<Service> allServices = getServicesByEligibility.values()
            .stream()
            .flatMap(List::stream)
            .distinct()
            .collect(Collectors.toList());

        List<Product> allProducts = getProductsByEligibility.values()
            .stream()
            .flatMap(List::stream)
            .distinct()
            .collect(Collectors.toList());

        return new Eligibility("All", allServices, allProducts);
    }
}
