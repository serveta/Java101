package Projeler;
/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
sonrasındaki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
 - Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
 - Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
 - Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
 - Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */
import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km, age, tripType;
        double price = 0, discountPrice, mesafeBasiUcret = 0.10;
        boolean isError = false;

        System.out.print("Mesafe (KM): ");
        km = input.nextInt();

        System.out.print("Kaç yaşındasınız: ");
        age = input.nextInt();

        System.out.println("Yolculuk Tipini Seçiniz;");
        System.out.println("1 => Tek Yön\n2 => Gidiş Dönüş");
        System.out.print(" Seçiminiz: ");
        tripType = input.nextInt();

        if ((km > 0) && (age > 0) && (tripType == 1 || tripType == 2)) {
            price = km * mesafeBasiUcret;

            if (age < 12) {
                price *= 0.50;
            } else if (age < 24) {
                price *= 0.90;
            } else if (age > 65) {
                price *= 0.70;
            }

            if (tripType == 2) {
                price *= 0.80;
                price *= 2;
            }

        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı veri girişi yaptınız!");
        } else {
            System.out.println("Toplam Tutar = " + price + " TL");
        }

    }
}
