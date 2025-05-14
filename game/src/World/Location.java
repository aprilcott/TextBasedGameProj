package World;

public class Location {
    private String locationDescription;
    private String locationName;

    private String locationType;
    private String isPassable;

    public Location(String locationDescription, String locationName, String locationType, String isPassable) {
        this.locationDescription = locationDescription;
        this.locationName = locationName;
        this.locationType = locationType;
        this.isPassable = isPassable;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }
    public String getLocationDescription() {
        return locationDescription;
    }
    public void setLocationName(String locationName) {
        this.locationName = locationName;
        
    }
}
