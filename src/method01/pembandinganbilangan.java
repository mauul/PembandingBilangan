package method01;
import java.util.Scanner;
/**
 *
 * @author MAULIDYA DWI RAHMWATI XRPL6 (29)
 * SOAL NOMER 5 JOBSHEET 9
 */
public class pembandinganbilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilanganA;
        int bilanganB;
        int bilanganC;
        System.out.println ("Pembandingan 3 Bilangan");
        System.out.println ("Masukan Bilangan");
        System.out.print ("Bilangan pertama : ");
        bilanganA = scanner.nextInt();
        System.out.print ("Bilangan kedua : ");
        bilanganB = scanner.nextInt();
        System.out.print ("Bilangan ketiga: ");
        bilanganC = scanner.nextInt();
        int pilihan;
        pilihan = bandingkan(bilanganA, bilanganB, bilanganC);
        switch(pilihan) {
            case 1:System.out.println("Nilai terbesar adalah "+ bilanganA);break;
            case 2:System.out.println("Niai terbesar adalah "+ bilanganB);break;
            case 3:System.out.println("Niai terbesar adalah "+ bilanganC);break;
        }
    }
    public static int bandingkan(int a, int b, int c) {
        int x = 0;
        if(a>b) {
            if(a>c){
                x=1;
            }
        }
        if(b>c) {
            if(b>a) {
                x=2;
                
            }
        }
        if(c>b) {
            if(c>a) {
                x=3;
            }
        }       
    return x;     
   }

    
}
