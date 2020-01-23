public class Inventory {
    private Item[] contents = new Item[4];
    // TODO : Add an Item[] instance variable called contents.
    // Initialize it at declaration; give it a default length of 4.

    // Merge two inventorys, merging other into this inventory.
    public void merge(Inventory other) {
        int otherlength = other.getContentsLength();
        int thislength = this.contents.length;
        int totallength = otherlength + thislength;
        Item[] newcontents = new Item[totallength];

        for (int i = 0; i < thislength; i++) {
            newcontents[i] = contents[i];
        }

        for (int i = 0; i < otherlength; i++) {
            newcontents[i + thislength] = other.getItem(i);
        }
        contents = newcontents;
        // TODO : Compute contents.length + other.contents.length
        // TODO : Create a new Item[] of the size above
        // TODO : Copy all the elements from contents into the new Item[]
        // TODO : Copy all the elements from other.contents into the new Item[]
        // TODO : Set contents to be the new Item[] we just filled
    }

    // Get the i-th item, where the 0th item is the first.
    // Return null if the index is invalid.
    public Item getItem(int i) {
        if (i >= contents.length || i < 0) {
            return null;
        } else {
            return contents[i];
        }

        // TODO : Check if "i" is a bad index into our array
            // If so, return null
        // TODO : Otherwise, return the element at index i
    }

    // Put an item at the i-th position, where the 0th item is the first.
    // Return false if the index is invalid. Otherwise return true.
    public boolean putItem(int i, Item item) {
        if (i >= contents.length || i < 0) {
            return false;
        } else {
            contents[i] = item;
            return true;
        }
        // TODO : Check if "i" is a bad index into our array
            // If so, return false
        // TODO : Otherwise, set the element at index i to item
    }

    // Get the length of contents.
    public int getContentsLength() {
        return contents.length;
        // TODO : Return the length of contents.
    }

}
