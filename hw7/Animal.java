//I worked on the homework assignment alone, using only course materials.
/**
 * This class represents an Animal object.
 * @author Wenye Yi
 * @version 1.0
 */
public abstract class Animal implements Comparable<Animal> {
    protected int storeId;
    protected String name;
    protected double price;
    /**
     * Create an Animal constructor taking three parameters.
     * @param storeId an integer represents a pet's store ID
     * @param name the name of the pet
     * @param price the price of the pet
     */
    public Animal(int storeId, String name, double price) {
        this.storeId = storeId;
        this.name = name;
        this.price = price;
    }
    /**
     * Create an Animal constructor taking one parameter.
     * @param storeId a pet's store ID
     */
    public Animal(int storeId) {
        this(storeId, "Buzz", 222.00);
    }
    /**
     * getter method
     * @return store ID
     */
    public int getStoreId() {
        return storeId;
    }
    /**
     * setter method
     * @param storeId store id of the pets
     */
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
    /**
     * getter method
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * setter method
     * @param name name of the pets
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * getter method
     * @return price
     */
    public double getPrice() {
        return price;
    }
    /**
     * setter method
     * @param price price of the pets
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * override a compareTo method taking one parameter
     * @param o Animal object o
     * @return the comparison between object storeId and this storeId
     */
    @Override
    public int compareTo(Animal o) {
        if (this.storeId == o.storeId) {
            return this.name.compareTo(o.name);
        } else {
            return this.storeId - o.storeId;
        }
    }
    /**
     * override the toString method
     * @return the string s
     */
    @Override
    public String toString() {
        String s = "Store ID: ";
        s += this.storeId + ", ";
        s += "Name: " + this.name + ", ";
        s += String.format("Price: %.2f", this.price);
        return s;

    }


}