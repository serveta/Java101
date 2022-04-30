/*
Ödev
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
 */
import java.util.Scanner;

public class UcSayiyiBuyuktenKucugeSirala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("1. sayı: ");
        a = input.nextInt();

        System.out.print("2. sayı: ");
        b = input.nextInt();

        System.out.print("3. sayı: ");
        c = input.nextInt();

        if (a > b && a > c) {
            // a sayısı en büyüktür
            if (b > c) {
                // Sıralama a>b>c dir.
                System.out.println(a + " > " + b + " > " + c);
            } else {
                // Sıralama a>c>b dir.
                System.out.println(a + " > " + c + " > " + b);
            }
        } else if (b > a && b > c) {
            // b sayısı en büyüktür
            if (a > c) {
                System.out.println(b + " > " + a + " > " + c);
            } else {
                System.out.println(b + " > " + c + " > " + a);
            }
        } else {
            // c sayısı en büyüktür
            if (a > b) {
                System.out.println(c + " > " + a + " > " + b);
            } else {
                System.out.println(c + " > " + b + " > " + a);
            }
        }

    }
}
