package moduleone.learningbasics.recursion;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 5;

        func(n, 0, 1);
    }

    public static void func(int n, int a, int b) {

        if (n == 0) {
            System.out.println(a);
            return;
        }

        func(n - 1, b, a + b);
    }
}