/**
 * This class represents a Store object implements StoreOrganizer.
 * @author Wenye Yi
 * @version 1.0
 */
public class Store implements StoreOrganizer {
    /**
     * override an Animal array named getPets
     * @return pets
     */
    @Override
    public Animal[] getPets() {
        return pets;
    }
    /**
     * override an add method taking one parameter
     * @param a Animal object a
     */
    @Override
    public void add(Animal a) {
        if (pointer == pets.length) {
            return;
        }
        pets[pointer] = a;
        pointer++;
    }
    /**
     * override sort method
     * Big(O) in this method is O(n^2)
     * The inner loop does O(n) work on each iteration
     * The outer loop runs for O(n) iterations
     * Times the inner loop and the outer loop to get O(n^2)
     */
    @Override
    public void sort() {
        for (int i = 0; i < pointer; i++) {
            for (int j = 0; j < pointer - i - 1; j++) {
                if (pets[j].compareTo(pets[j + 1]) > 0) {
                    Animal k = pets[j];
                    pets[j] = pets[j + 1];
                    pets[j + 1] = k;
                }
            }
        }
    }
    /**
     * override a binarySearch method taking one parameter
     * @param a Animal object a
     * @return the index if the animal is found or -1
     * Big(O) in this method is O(Log(n))
     * Started on the middle element of the list
     * taking three iterations to get to the last element
     * runs in logarithmic time in the worst case which making O(log(n)) comparisons
     */
    @Override
    public int binarySearch(Animal a) {
        this.sort();
        int high = pointer - 1;
        int low = 0;
        int mid = (high + low) / 2;

        while (low <= high) {
            if (pets[mid].compareTo(a) > 0) {
                high = mid - 1;
            } else if (pets[mid].compareTo(a) < 0) {
                low = mid + 1;
            } else {
                return mid;
            }
            mid = (high + low) / 2;
        }
        return -1;
    }
    /**
     * override a linearSearch method taking one parameter
     * @param a Animal object a
     * @return the index that the pet is found or -1 if it cannot be found
     * Big(O) in this method is O(n)
     * Iterate through the list of elements until find the target element
     * The loop runs O(n) times
     */
    @Override
    public int linearSearch(Animal a) {
        for (int i = 0; i < pointer; i++) {
            if (pets[i].compareTo(a) == 0) {
                return i;
            }
        }
        return -1;
    }

    protected Animal[] pets;
    /**
     * Create a Store constructor taking one parameter
     * @param numPets numbers of pets
     */
    public Store(int numPets) {
        pets = new Animal[numPets];
        pointer = 0;
    } // o(n)

    protected int pointer;

}
