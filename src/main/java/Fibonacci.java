import java.util.ArrayList;

public class Fibonacci {

    static int n1 = 0, n2 = 1, n3;

    public Fibonacci(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void computeNonRecursive(int n) {

        System.out.print(n1 + " " + n2);

        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;

            if (n3 == n) {
                System.out.println("fibonacci number");
                break;

            }

        }


    }

    public int computeRecursive(int n) {
        if (n < 2) {
            return n;
        } else {
            return computeRecursive(n - 1) + computeRecursive(n - 2);
        }


    }

   /* public static void main(String[] args) {
        int index = 30;
        long start = System.currentTimeMillis();
        double result = computeRecursive(index);
        end = System.currentTimeMillis();
        System.out.println("f(" + index + ") = " + result + " : time = " + (end - start) + "ms");

    }
*//*
     public static void main(String[] args) {
        int index = 30;
        long start = System.currentTimeMillis();
        double result = computeNonRecursive(index);
        end = System.currentTimeMillis();
        System.out.println("f(" + index + ") = " + result + " : time = " + (end - start) + "ms");

    }
*/
}


