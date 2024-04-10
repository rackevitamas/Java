import java.util.Scanner;
public class PartyArrasAndDividable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a bejövő lányok számát: ");
        int lanydb = sc.nextInt();
        System.out.println("Kérem a bejövő fiúk számát: ");
        int fiudb = sc.nextInt();
        if (lanydb >= 20 && fiudb >= 20 && lanydb == fiudb){
            System.out.println("The party is excellent!");
        }
        else if (lanydb >= 20 && fiudb >= 20 && lanydb != fiudb){
            System.out.println("Quite a cool party!");
        }
        else if (lanydb < 20 && fiudb < 20){
            System.out.println("Average party!");
        }
        else if (lanydb == 0){
            System.out.println("Sausage party");
        }
    }
}