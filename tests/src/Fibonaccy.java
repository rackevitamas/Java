public class Fibonaccy {
    public int Fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }

        int num1 = 0, num2 = 1;
        for (int i = 2; i <= n; i++) {
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
        return num2;
    }

    public static void main(String[] args) {
        Fibonaccy fMany = new Fibonaccy();
        int i = 3;
        System.out.println(fMany.Fibonacci(i) + " az " + i + ". Fibonacci szám!");
    }
}
