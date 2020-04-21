public class Linkedlist1<E> {

	private static class Node<E> {
		E data;
		Node<E> next;

		Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
	private Node<E> first = null;

	public void addFrist(E elt) {
		first = new Node<>(elt, first);
	}

	public static void main(String[] args) {
		Linkedlist1<Integer> ints = new Linkedlist1<>();
		ints.addFrist(44);
		ints.addFrist(23);
		ints.addFrist(22);
		ints.addFrist(54);
		ints.addFrist(23);

		System.out.println(ints);

	}
	
}