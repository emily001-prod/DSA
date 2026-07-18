package moduleone.learningbasics.recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int i=0;
		int fact=1;
		func(a,i,fact);

	}
	public static void func(int a[],int i,int fact) {
		if(i==a.length) {
			System.out.println(fact);
			return;
		}
		
		func(a, i + 1, fact * a[i]);
		
		
	}

}
