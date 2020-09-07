import java.util.Scanner;
public class Del {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int cislo;
        cislo = sc.nextInt();
        if(cislo%7 == 0) {
            System.out.println("Číslo " + cislo + " je dělitelné sedmi");
        } else {
            System.out.println("Číslo " + cislo + " není dělitelné sedmi");
        }

        sc.close();
    }
}