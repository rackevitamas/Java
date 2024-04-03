import java.util.Scanner;
public class UserData {
    public static void kiiras(String firstName, String lastName, int age) {
        System.out.println(firstName + " " + lastName + " " + age);
    }

    public static void kiiras(String firstName, int age, String lastName) {
        kiiras(firstName, lastName, age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a keresztnevedet:");
        String kerszt = sc.nextLine();
        System.out.println("Hány éves vagy?");
        int kor = sc.nextInt();
        sc.nextLine();
        System.out.println("Kérem a vezetéknevedet:");
        String vez = sc.nextLine();
        sc.close();
        kiiras(kerszt, kor, vez);
        System.out.println();
    }
}
