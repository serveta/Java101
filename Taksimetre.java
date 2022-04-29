/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double startPrice = 10,
                perKm = 2.20,
                minPrice = 20,
                km, total;

        System.out.print("Kaç KM yol gidildi: ");
        km = input.nextInt();

        total = startPrice + (km * perKm);

        total = (total < minPrice) ? minPrice : total;

        System.out.println("Kesilecek ücret: "+total +" TL");
    }
}
