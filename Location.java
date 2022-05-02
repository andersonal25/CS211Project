/**
 * Location class
 * represents location of user
 * contains toString() method
 */
public class Location {
    String placeName; // name of user's location/place
    String streetAddress; // street address of user
    String city; // city of user
    String state; // state of user
    String country; // country of user
    String zipCode; // zip code of user
    double latitude; // latitude of location user
    double longitude; // longitude of location of user

    /**
     * Location() constructor
     * @param placeName
     * @param streetAddress
     * @param city
     * @param state
     * @param country
     * @param zipCode
     * @param latitude
     * @param longitude
     * initializes class member variables using encapsulation
     */
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

    /**
     * setPlaceName() method
     * a setter method for placeName
     * @param placeName
     */
    public void setPlaceName(String placeName){
        this.placeName = placeName;
    }

    /**
     * getPlaceName() method
     * a getter method for placeName
     * @return placeName
     */
    public String getPlaceName(){
        return this.placeName;
    }

    /**
     * setStreetAddress() method
     * a setter method for streetAddress
     * @param streetAddress
     */
    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }

    /**
     * getStreetAddress() method
     * a getter method for streetAddress
     * @return streetAddress
     */
    public String getStreetAddress(){
        return this.streetAddress;
    }

    /**
     * setCity() method
     * a setter method for city
     * @param city
     */
    public void setCity(String city){
        this.city =  city;
    }

    /**
     * getCity() method
     * a getter method for city
     * @return city
     */
    public String getCity(){
        return this.city;
    }

    /**
     * setState() method
     * a setter method for state
     * @param state
     */
    public void setState(String state){
        this.state = state;
    }

    /**
     * getState() method
     * a getter method for state
     * @return state
     */
    public String getState(){
        return this.state;
    }

    /**
     * setCountry() method
     * a setter method for country
     * @param country
     */
    public void setCountry(String country){
        this.country = country;
    }

    /**
     * getCountry() method
     * a getter method for country
     * @return country
     */
    public String getCountry(){
        return this.country;
    }

    /**
     * setZipCode() method
     * a setter method for zipCode
     * @param zipCode
     */
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    /**
     * getZipCode() method
     * a getter method for zipCode
     * @return zipCode
     */
    public String getZipCode(){
        return this.zipCode;
    }

    /**
     * setLatitude() method
     * a setter method for latitude
     * @param latitude
     */
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    /**
     * getLatitude() method
     * a getter method for latitude
     * @return latitude
     */
    public double getLatitude(){
        return this.latitude;
    }

    /**
     * setLongitude() method
     * a setter method for longitude
     * @param longitude
     */
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    /**
     * getLongitude() method
     * a getter method for longitude
     * @return longitude
     */
    public double getLongitude(){
        return this.longitude;
    }

    /**
     * toString() method
     * @return concatenated string of user's location
     */
    public String toString(){
        return getPlaceName() + " " + getStreetAddress() + " " + getCity() + " " +  getState() + " " + getZipCode() + " " + getCountry() + " " + getLatitude() + " " + getLongitude();
    }

    /**
     * main() method
     * creates Location instance and calls toString() method on that instance
     * @param args
     */
    public static void main(String[] args) {
        Location l = new Location("George Mason University", "4400 University Drive", "Fairfax", "VA", "USA", "22030", 38.834720 , -77.312680);
        l.toString();
    }
}