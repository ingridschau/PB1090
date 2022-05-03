import java.util.Scanner;

public class ConsistentInterval {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two lists
		System.out.print("Enter the length of list 2");
		int[] list1 = new int[input.nextInt()];
		System.out.print("Enter list2: ");
		for (int i = 0; i < list1.length; i++)
			list1[i] = input.nextInt(); 	

		System.out.print("The length of list2:");
		int[] list2 = new int[input.nextInt()];
		System.out.print("Enter list2: ");
		for (int i = 0; i < list2.length; i++)
			list2[i] = input.nextInt();

		// Display whether the two are strictly identical
		System.out.println("Two lists are" + (equals(list1, list2) ? " " : " not ") 
			+ "identical");
	}

	/** equals returns true if the elements in 
	*   both lists are equal. False otherwise */
	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length)
			return false;

		// Sort both lists in same order
		sort(list1);
		sort(list2);
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i])
				return false;
		}
		return true;
	}

	/** sort selection sorts a list in accending order*/
	public static void sort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int min = list[i];
			int minIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < min) {
					min = list[j];
					minIndex = j;
				}
			}

			if (minIndex != i) {
				list[minIndex] = list[i];
				list[i] = min; 
			}
		}
	}
}