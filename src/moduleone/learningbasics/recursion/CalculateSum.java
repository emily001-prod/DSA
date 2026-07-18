package moduleone.learningbasics.recursion;

public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int i=0;
		System.out.println(func(a,i));

	}
	public static int func(int a[], int i) {

        // Base case
        if (i == a.length) {
            return 0;
        }

        // Current element + sum of remaining elements
        return a[i] + func(a, i + 1);
    }

}
