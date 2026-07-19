package moduleone.learningbasics.recursion;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int i=0;
		int j=a.length-1;
		func(a,i,j);

	}
	public static void func(int a[],int i,int j) {
		if(i>=j) {
			System.out.println(Arrays.toString(a));
			return;
		}
		
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		func(a,i+1,j-1);
	}

}
