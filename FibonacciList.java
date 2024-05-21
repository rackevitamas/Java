import java.util.ArrayList;

public class FibonacciList {

    // The fibonacci sequence is a famous bit of mathematics,
    // and it happens to have a recursive definition.
    // The first two values in the sequence are 0 and 1 (essentially 2 base cases).
    // Each subsequent value is the sum of the previous two values,
    // so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
    // Define a fibonacci(n) method that
    // returns a list of the nth fibonacci numbers,
    // with n=0 representing the start of the sequence.
    // The method should be able to handle invalid input (e.g. negative numbers)
    // Example:
    // fibonacci(4) - > [0, 1, 1, 2]
    // fibonacci(10) - > [0, 1, 1, 2, 3, 5, 8, 13, 21, 33]




    public static ArrayList<Integer> Fibonacci(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            list.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(10));
    }
}
