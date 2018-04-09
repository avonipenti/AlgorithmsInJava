import java.util.ArrayList;
import java.util.Scanner;

public class SmallestInAList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int size;
		int smallest;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the list : ");
		size = scanner.nextInt();
		
		System.out.println("Enter list elements ");
		for(int i = 0; i < size; i++) {
			if (scanner.hasNext())
				list.add(scanner.nextInt());
		}
		scanner.close();
		
		smallest = smallestInAListAlgorithm(list);
		System.out.println("The smallest in the List of " + list.toString() + " is " + smallest);
		
	}

	// This algorithm traverses through all the elements in an N arrayList and so the time is constant O(N)
	private static int smallestInAListAlgorithm(ArrayList<Integer> list) {
		int smallest = list.get(0);
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < smallest)
				smallest = list.get(i);
		}
		
		return smallest;
	}

}
