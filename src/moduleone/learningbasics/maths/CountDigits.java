package moduleone.learningbasics.maths;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		func(n);
	}
	public static void func(int n) {
		int count=(int)(Math.log10(n)+1);
		System.out.println(count);
	}

}
