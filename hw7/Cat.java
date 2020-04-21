/**
 * This class represent a Cat object extends Animal class.
 * @author Wenye Yi
 * @version 1.0
 */
public class Cat extends Animal {
    protected boolean likesLasagna;
    protected int miceCaught;
    /**
     * Create a Cat constructor taking four parameters.
     * @param name name of the cat
     * @param price price of the cat
     * @param likesLasagna cat likes Lasagna
     * @param miceCaught cat caught mice
     */
    public Cat(String name, double price, int miceCaught, boolean likesLasagna) {
        super(200, name, price);
        this.miceCaught = miceCaught;
        this.likesLasagna = likesLasagna;
    }
    /**
     * a Cat constructor taking two parameters
     * @param likesLasagna cat likes Lasagna
     * @param miceCaught cat caught mice
     */
    public Cat(int miceCaught, boolean likesLasagna) {
        this("none", 30.0, miceCaught, likesLasagna);
    }
    /**
     * getter method
     * @return likesLasagna
     */
    public boolean getLikesLasagna() {
        return likesLasagna;
    }
    /**
     * setter method
     * @param likesLasagna cat likes Lasagna
     */
    public void setLikesLasagna(boolean likesLasagna) {
        this.likesLasagna = likesLasagna;
    }
    /**
     * getter method
     * @return miceCaught
     */
    public int getMiceCaught() {
        return miceCaught;
    }
    /**
     * setter method
     * @param miceCaught cat caught mice
     */
    public void setMiceCaught(int miceCaught) {
        this.miceCaught = miceCaught;
    }
    /**
     * override a compareTo method taking one parameter.
     * @param o Animal object o
     * @return comparison between this miceCaught and cat's miceCaught
     */
    @Override
    public int compareTo(Animal o) {
        if (super.compareTo(o) == 0) {
            if (o instanceof Cat) {
                Cat d = (Cat) o;
                return d.miceCaught - this.miceCaught;
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
        s += "Likes Lasagna: " + this.likesLasagna + ", ";
        s += "Mice Caught: " + this.miceCaught;
        return s;

    }


}