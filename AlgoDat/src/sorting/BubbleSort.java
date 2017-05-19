package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 4, 2,8, 2,1000, 43, 9, 3,3, 1, 7, 9,88,4,2435, 5 };
		a = sortRecursiv(a, a.length);
		a = sortIterative(a);
		for (int i : a)
			System.out.print(i + " ");
	}

	private static int[] sortRecursiv(int[] a, int n) {
		for (int i = 0; i < n-1; i++) {
			if(a[i] > a[i+1]){
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
	
		if(n==1) return a;
		else return sortRecursiv(a, n-1);
	}
	
	private static int[] sortIterative(int[] a) {
		for(int n = a.length; n>1;n-=1)
		for (int i = 0; i < n-1; i++) {
			if(a[i] > a[i+1]){
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		return a;
	}
	
	
}
