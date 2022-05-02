/*
Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden 
çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
(not: 4'ün katları zaten çifttir.)
 */
import java.util.Scanner;

public class DortunKatiOlanSayilar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numFromUser, sum = 0;

        do {
            System.out.print("Bir sayı girin: ");
            numFromUser = scan.nextInt();
            if ((numFromUser % 4) == 0) {
                sum += numFromUser;
            }
        } while ((numFromUser % 2) == 0);

        System.out.println("Girilen sayılardan 4'ün katı olan sayıların toplamı = " + sum);
    }
}
