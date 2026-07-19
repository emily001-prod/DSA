package modulethree.arrays.easy;

public class FindLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,2,5,9,4,6,7};
		func(a);

	}

	public static void func(int a[]) {
		int largest= Integer.MIN_VALUE;
		for(int i:a) {
			if(i>largest) {
				largest=i;
			}
		}
		
		System.out.println(largest);
	}
}
