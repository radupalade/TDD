public class Fibonacci {

    static int n1 = 0, n2 = 1, n3;

    public Fibonacci(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public static double computeNonRecursive(int n) {

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


        return 0;
    }

    public static int computeRecursive(int n) {
        if (n < 2) {
            return n;
        } else {
            return computeRecursive(n - 1) + computeRecursive(n - 2);
        }


    }

    public static void main(String[] args) {
        int index = 30;
        for (int i = 0; i < index; i++) {
            System.out.print(computeRecursive(i) + " ");

        }
        long start = System.currentTimeMillis();
        double result = computeRecursive(index);
        long end = System.currentTimeMillis();
        System.out.println("f(" + index + ") = " + result + " : time = " + (end - start) + "ms");
        //f(30) = 832040.0 : time = 8 - 12ms
        //f(40) = 1.02334155E8 : time = 1083ms
        //with index 50 takes too long
    }
    /* public static void main(String[] args) {
        int index = 30;
        long start = System.currentTimeMillis();
        double result = computeNonRecursive(index);
        long end = System.currentTimeMillis();
        System.out.println("f(" + index + ") = " + result + " : time = " + (end - start) + "ms");
        //f(30) = 0.0 : time = 0ms
        //f(50) = 0.0 : time = 4ms

    }*/
}


