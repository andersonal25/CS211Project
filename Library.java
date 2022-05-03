/**
 * Library class
 * represents libraries in surrounding area that contain book
 */
public class Library {
    String name; // library name
    Location location; // library location

    /**
     * Library() one arg constructor
     * initializes name and location (example of cascading constructor)
     * @param name library name
     */
    public Library(String name){
        this(name, null);
    }

    /**
     * Library() two arg constructor
     * intializes name and location
     * @param name library name
     * @param location library location
     */
    public Library(String name, Location location){
        setName(name);
        setLocation(location);
    }

    /**
     * setName() method
     * a setter method for name
     * @param name library name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * getName() method
     * a getter method for name
     * @return name
     */
    public String getName(){
        return this.name;
    }

    /**
     * setLocation() method
     * a setter method for location
     * @param location library location
     */
    public void setLocation(Location location){
        this.location = location;
    }

    /**
     * getLocation() method
     * a getter method for location
     * @return location
     */
    public Location getLocation(){
        return this.location;
    }

    /**
     * toString() method
     * returns concatenated String of the library name and location
     */
    @Override public String toString(){
        return "Library Name: " + getName() + ", Library Location: " + getLocation().toString();
    }
    
    /**
     * main() method
     * creates Location and Library instance and calls toString() method on Library instance
     * @param args
     */
    public static void main(String[] args) {
        Location location = new Location("George Mason University", "4400 University Drive", "Fairfax", "VA", "USA", "22030", 38.834720 , -77.312680);
        Library library = new Library("City of Fairfax Regional Library", location);
        System.out.println(library.toString());
    }
}