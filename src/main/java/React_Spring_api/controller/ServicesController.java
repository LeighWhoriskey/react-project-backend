package React_Spring_api.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import React_Spring_api.model.Service;
@RestController
public class ServicesController {

    List<Service> services = List.of(
            new Service("scv01", "24/7 Customer Support", 
             "Round-the-clock access to our dedicated customer support team.",
             "Support", "Standard, Premium",
             "Calls may be recorded for quality and training purposes. Service availability is subject to network conditions. We do not guarantee issue resolution but will make every effort to assist. By using this service, you agree to our terms"),
            new Service("scv02", "Health Consultation",
             "Virtual consultation sessions with certified professionals.",
              "Health", "Premium", "Up to 5 sessions per month.")
        );

    @GetMapping("/api/services")
    public Map<String, List<Service>> getAllProducts() {
        return Map.of("services", services);
    }

    @GetMapping("/api/services/{id}")
    public Optional<Service> getServiceById(@PathVariable String id){
        return services.stream().filter(service -> service.getId().equals(id)).findFirst();
    }
}
