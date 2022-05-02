public class Location {
    String placeName;
    String streetAddress;
    String city;
    String state;
    String country;
    String zipCode;
    double latitude;
    double longitude;

    public Location(String placeName, String streetAddress, String city, String state, String country, String zipCode, double latitude, double longitude){
        setPlaceName(placeName);
        setStreetAddress(streetAddress);
        setCity(city);
        setState(state);
        setCountry(country);
        setZipCode(zipCode);
        setLatitude(latitude);
        setLongitude(longitude);
    }

    public void setPlaceName(String placeName){
        this.placeName = placeName;
    }

    public String getPlaceName(){
        return this.placeName;
    }

    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }

    public String getStreetAddress(){
        return this.streetAddress;
    }

    public void setCity(String city){
        this.city =  city;
    }

    public String getCity(){
        return this.city;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry(){
        return this.country;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getZipCode(){
        return this.zipCode;
    }

    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    public double getLatitude(){
        return this.latitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public double getLongitude(){
        return this.longitude;
    }

    public String toString(){
        return getPlaceName() + " " + getStreetAddress() + " " + getCity() + " " +  getState() + " " + getZipCode() + " " + getCountry() + " " + getLatitude() + " " + getLongitude();
    }

    public static void main(String[] args) {
        Location l = new Location("George Mason University", "4400 University Drive", "Fairfax", "VA", "USA", "22030", 38.834720 , -77.312680);
        l.toString();
    }
}