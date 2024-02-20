public class Matek {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 200) + 1;
        int y = (int) (Math.random() * 200) + 1;
        int max = (int) Math.max(x, y);
        int min = (int) Math.min(x, y);
        double gyokx = Math.sqrt(x);
        double gyoky = Math.sqrt(y);
        double powx = Math.pow(x, 3);
        double powy = Math.pow(y, 3);
        double roundx = Math.round(x);
        double roundy = Math.round(y);
        double ceilx = Math.ceil(x);
        double ceily = Math.ceil(y);
        double floorx = Math.floor(x);
        double floory = Math.floor(y);
        System.out.print("A két szám közül nagyobb szám: " + x + " " + y + " " + max);
        System.out.print("\nA két szám közül kisebb szám: " + x + " " + y + " " + min);
        System.out.print("\nAz x szám négyzetgyök szám: " + x  + " " + gyokx);
        System.out.print("\nAz y szám négyzetgyök szám: " + y + " " + gyoky);
        System.out.print("\nA két szám különsbég szám: " + x + " - " + y + " " + (x - y));
        System.out.print("\nAz x szám köbe szám: " + x + " " + powx);
        System.out.print("\nAz y szám köbe szám: " + y + " " + powy);
        System.out.print("\nAz x szám kerekítés szám: " + x + " " + roundx);
        System.out.print("\nAz y szám kerekítés szám: " + y + " " + roundy);
        System.out.print("\nAz x szám felfelé kerekítés szám: " + x + " " + ceilx);
        System.out.print("\nAz y szám felfelé kerekítés szám: " + y + " " + ceily);
        System.out.print("\nAz x szám lefelé kerekítés szám: " + x + " "  + floorx);
        System.out.print("\nAz y szám lefelé kerekítés szám: " + y + " " + floory);

    }
}
