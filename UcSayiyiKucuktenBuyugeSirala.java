/*
Ödev
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
 */

import java.util.Scanner;

public class UcSayiyiKucuktenBuyugeSirala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("1. sayı: ");
        a = input.nextInt();

        System.out.print("2. sayı: ");
        b = input.nextInt();

        System.out.print("3. sayı: ");
        c = input.nextInt();

        if (a < b && a < c) {
            // a sayısı en küçüktür
            if (b < c) {
                // Sıralama a<b<c dir.
                System.out.println(a + " < " + b + " < " + c);
            } else {
                // Sıralama a<c<b dir.
                System.out.println(a + " < " + c + " < " + b);
            }
        } else if (b < a && b < c) {
            // b sayısı en küçüktür
            if (a < c) {
                System.out.println(b + " < " + a + " < " + c);
            } else {
                System.out.println(b + " < " + c + " < " + a);
            }
        } else if (c < a && c < b) {
            // c sayısı en küçüktür
            if (a < b) {
                System.out.println(c + " < " + a + " < " + b);
            } else {
                System.out.println(c + " < " + b + " < " + a);
            }
        } else {
            System.out.println("Sayılarda eşitlik söz konusu.");
            // eşitlik söz konusu iken hangi sayılar arasında eşitlik var ise burada koşullarla belirtilebilir...
        }

    }
}
