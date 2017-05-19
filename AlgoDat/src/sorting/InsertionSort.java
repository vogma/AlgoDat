package sorting;

public class InsertionSort {

	static int counter = 0;

	public static void main(String[] args) {
		int a[] = { 3, 5, 8, 4, 2 };
		a = sortIterative(a);
		//a = sortRecursive(a, a.length);
		for(int i:a){
			System.out.print(i+" ");
		}
	}

	private static int[] sortIterative(int[] a) {
		int j, temp;
		for (int i = 1; i < a.length; i++) {
			j = i;
			while (j > 0 && a[j] < a[j - 1]) {
				System.out.println("Swap: " + a[j] + " tauscht mit " + a[j - 1]);
				counter++;
				temp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = temp;
				j -= 1;
			}
		}
		return a;
	}

	//TODO
	private static int[] sortRecursive(int[] a, int length) {
		if (length > 1) {
			sortRecursive(a, length - 1);
		} else {
			int temp;
			int j = length;
			System.out.println(j);
			while (j > 0 && a[j] < a[j - 1]) {
				System.out.println("[Swap] " + a[j] + " tauscht mit " + a[j - 1]);
				counter++;
				temp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = temp;
				j -= 1;
			}
		}

		return a;
	}
}
