import java.util.Scanner;
public class Dividable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fizz = sc.nextInt();
        int buzz = sc.nextInt();
        if(num % fizz == 0 && num % buzz == 0){
            System.out.println("fizz * buzz = " + fizz * buzz);
        } else if (num % buzz == 0){
            System.out.println(buzz);
        }else if (num % fizz == 0){
            System.out.println(fizz);
        } else{
            System.out.println("-1");
        }
    }
}