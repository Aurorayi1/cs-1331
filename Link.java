// create a Link object
public class Link {
	public String bookName;
	public int millionsSold;

	// reference to next link made in the LinkList
	// holds the reference to the Link that was created before it
	// set to null until it is connected to other links
	public Link next;
    
    // Constructor
	public Link(String bookName, int millionsSold) {
		this.bookName = bookName;
		this.millionsSold = millionsSold;
	}

	public void display() {
		System.out.println(bookName + ": " + millionsSold + " ,000,000");
	}

	public String toString() {
		return bookName;
	}

	public static void main(String[] args) {

	}
}
