import java.util.Scanner;
public class Dolgozat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az egész számot 10 és 90 között");
        int szam = sc.nextInt();
        sc.close();
        if (szam > 90 || szam < 10) {
            System.out.println("A szám nem helyes!");
        }else if (szam % 3 == 0 && szam % 5 == 0) {
            System.out.println("FizzBuzz");
        }else if(szam % 5 == 0){
            System.out.println("Buzz");
        }else if(szam % 3 == 0){
            System.out.println("Fizz");
        }else {
            System.out.println("Egyik sem osztható el: " + szam);
        }
    }
}
