import java.util.Scanner;

public class Ucak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double toplam;
        System.out.println("Yasınız:");
        a = sc.nextInt();
        System.out.println("Gidilecek yol(KM):");
        b = sc.nextInt();
        System.out.println("Tek yön ise 1, gidis gelis ise 2 yazınız:");
        c = sc.nextInt();
        if(a>0 && b>0 && c==1 || c==2)
        {
            if(c==1)
            {
                if(a<12)
                {
                    toplam = b*1/20;
                    System.out.println("Ucret:"+toplam);
                }
                if(a>=12 && a<=24)
                {
                    toplam = b*9/100;
                    System.out.println("Ucret:"+toplam);
                }
                if(a>=65)
                {
                    toplam = b*7/100;
                    System.out.println("Ucret:"+toplam);
                }
            }
            else
            {
                if(a<12)
                {
                    toplam = b*4/100;
                    System.out.println("Ucret:"+toplam);
                }
                if(a>=12 && a<=24)
                {
                    toplam = b*36/500;
                    System.out.println("Ucret:"+toplam);
                }
                if(a>=65)
                {
                    toplam = b*28/500;
                    System.out.println("Ucret:"+toplam);
                }
            }
        }
        else
        {
            System.out.println("Hatali giris.");
        }

    }
}