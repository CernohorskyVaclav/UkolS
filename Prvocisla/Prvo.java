import java.util.Scanner;
public class Prvo {

    public static void main(String[] args) {
        Prvo p = new Prvo();

        Scanner sc = new Scanner(System.in, "Windows-1250");
        p.vypisPrimeNums(sc);
        sc.close();
    }

    public void vypisPrimeNums(Scanner sc) {

        int cislo = 0;

        for (int i = 1; i <= 100; i++)
        {
            int cislo1=0;

            for(cislo = i; cislo >= 1; cislo--)
            {
                if(i % cislo == 0)
                {
                    cislo1 = cislo1 + 1;
                }
            }
            if (cislo1 == 2)
            {
                System.out.println(i);

            }
        }
    }
}