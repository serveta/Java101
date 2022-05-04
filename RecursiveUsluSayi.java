/*
Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini 
"Recursive" metot kullanarak yapan programı yazınız.
 */
import java.util.Scanner;

public class RecursiveUsluSayi {

    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, --exp);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int base, exp;

        System.out.print("Taban değeri: ");
        base = inp.nextInt();

        System.out.print("Üs değeri: ");
        exp = inp.nextInt();

        System.out.println("Cevap = " + power(base, exp));
    }
}
