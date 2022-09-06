import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Java dilinde programın 0-100 arasında rastgele seçtiği 
 * bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
 * kullanicinin 5 hakkı vardir
 */
public class App {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Random r = new Random();
            int tahmin = r.nextInt(100);
            int hak = 0;
            int sayi;
            int[] yanlislar = new int[5];

            while (hak < 5) {
                System.out.println("Sayi gir: ");
                sayi = scan.nextInt();
                if (sayi < 0 || sayi > 99) {
                    System.out.println("0-100 arasinda bir sayi girin");

                }
                if (sayi == tahmin) {
                    System.out.println("Tebrikler Dogru tahmin ettiniz");
                    break;
                } else {
                    if (sayi > tahmin) {
                        System.out.println("tahminizden daha kücük");
                    }
                    if (sayi < tahmin) {
                        System.out.println("tahminizden daha büyük");

                    }
                    yanlislar[hak++] = sayi;
                    System.out.println("Yanlis Tahmin Kalan Hak: " + (5 - hak));

                    if (hak == 5) {
                        System.out.println("Kaybettiniz :(" + "Tututtuğum sayi: " + tahmin);
                        System.out.println("tahminleriniz: " + Arrays.toString(yanlislar));

                    }

                }
            }

        }

    }
}
