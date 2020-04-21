/**
 * This class represents a Dog object extends Animal class.
 * @author Wenye Yi
 * @version 1.0
 */
public class Dog extends Animal {
    protected boolean curlyTail;
    protected int droolRate;
    /**
     * Create a Dog constructor taking four parameters.
     * @param name name of the dog
     * @param price price of the dog
     * @param curlyTail curly tail of the dog
     * @param droolRate drool rate of the dog
     */
    public Dog(String name, double price, boolean curlyTail, int droolRate) {
        super(100, name, price);
        this.curlyTail = curlyTail;
        this.droolRate = droolRate;
    }
    /**
     * a Dog constructor taking two parameters
     * @param curlyTail curly tail of the dog
     * @param droolRate drool rate of the dog
     */
    public Dog(boolean curlyTail, int droolRate) {
        this("none", 50.0, curlyTail, droolRate);
    }
    /**
     * getter method
     * @return curlyTail is true or false
     */
    public boolean getCurlyTail() {
        return curlyTail;
    }
    /**
     * setter method
     * @param curlyTail curly tail of a dog
     */
    public void setCurlyTail(boolean curlyTail) {
        this.curlyTail = curlyTail;
    }
    /**
     * getter method
     * @return droolRate
     */
    public int getDroolRate() {
        return droolRate;
    }
    /**
     * setter method
     * @param droolRate drool rate of a dog
     */
    public void setDroolRate(int droolRate) {
        this.droolRate = droolRate;
    }
    /**
     * override a compareTo method taking one parameter
     * @param o Animal object o
     * @return the comparison between dog's drool rate and this drool rate
     */
    @Override
    public int compareTo(Animal o) {
        if (super.compareTo(o) == 0) {
            if (o instanceof Dog) {
                Dog d = (Dog) o;
                return d.droolRate - this.droolRate;
            } else {
                return super.compareTo(o);
            }
        } else {
            return super.compareTo(o);
        }
    }
    /**
     * override a toString method
     * @return string s
     */
    @Override
    public String toString() {
        String s = super.toString() + ", ";
        s += "Curly Tail: " + this.curlyTail + ", ";
        s += "Drool Rate: " + this.droolRate;
        return s;

    }


}