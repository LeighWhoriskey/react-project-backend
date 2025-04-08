package React_Spring_api.model;

public class Product {
    private final int id;
    private final String name;
    private final String description;
    private final String version;
    private final String platforms;
    private final String availability;
    
    public Product(int id, String name, String description, String version, String platforms, String availability) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.version = version;
        this.platforms = platforms;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getVersion() {
        return version;
    }

    public String getPlatforms() {
        return platforms;
    }

    public String getAvailability() {
        return availability;
    }
    
}
