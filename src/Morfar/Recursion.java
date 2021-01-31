package Morfar;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(Fact(4));
    }
    public static int Fact(int n) {
        if(n == 1) {// base cases: fact of 0 or 1 is 1
            return 1;
        } else if (n == 0) {
            return 1;
        } else { // recursive case: multiply n by (n - 1) factorial
            return n * Fact(n-1);
        }

    }
}
