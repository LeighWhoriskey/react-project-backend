package Whoriskey.Leigh.React_Spring_api.model;

import java.util.List;

public class Eligibility {

    private final String eligibility;
    private final List<Service> entitledServices;
    private final List<Product> entitledProducts;
    
    public Eligibility(String eligibility, List<Service> entitledServices, List<Product> entitledProducts) {
        this.eligibility = eligibility;
        this.entitledServices = entitledServices;
        this.entitledProducts = entitledProducts;
    }

    public String getEligibility() {
        return eligibility;
    }

    public List<Service> getEntitledServices() {
        return entitledServices;
    }

    public List<Product> getEntitledProducts() {
        return entitledProducts;
    }
}
