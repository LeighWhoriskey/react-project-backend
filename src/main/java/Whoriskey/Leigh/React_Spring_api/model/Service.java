package Whoriskey.Leigh.React_Spring_api.model;

public class Service {
    private final String id;
    private final String name;
    private final String description;
    private final String category;
    private final String availability;
    private final String termsAndConditions;
    
    public Service(String id, String name, String description, String category, String availability,
            String termsAndConditions) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.availability = availability;
        this.termsAndConditions = termsAndConditions;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getAvailability() {
        return availability;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }
}
