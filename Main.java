


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.addAtIndex(1, 0);
		print(ll);
		ll.addAtIndex(4, 1);
		print(ll);
		
		//System.out.println(ll.size());
		//for (int i = 0; i < ll.size(); i++) {
		//	System.out.println(ll.get(i));
		//}
		

	}
	
	public static void print(LinkedList<Integer> ll) {
		//System.out.println(ll.toArray().getClass());
		Integer[] arr = ll.toArray();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
