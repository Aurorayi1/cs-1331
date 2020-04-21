public class LinkList {
	// reference to first Link in list
	// the last Link added to the LinkedList

	public Link firstLink;

	LinkList() {
		// the first Link always starts as null
		firstLink = null;
	}

	// returns true if LinkList is empty
	public boolean isEmpty() {
		return (firstLink == null);
	}

	// insert the first Link
	public void insertFirstLink(String bookName, int millionsSold) {
		// create a new Link assign the name and how many books he sold
		Link newLink = new Link(bookName, millionsSold);
		// connect the firstLink field to the new Link
		newLink.next = firstLink;
		firstLink = newLink;
	}

	// remove the first link
	public Link removeFirst() {
		Link linkReference = firstLink;
		if(!Empty()) {
			// removes the link from the List
			firstLink = firstLink.next;
		} else {
			System.out.println("Empty LinkedList");
		}
		return linkReference;
	}
}