/*
    * BİLGİ : VİDEODA İSTENİLEN ÖDEV ve AYRICA KONU AÇIKLAMASINDA İSTENİLEN ÖDEV olarak proje ayrılmıştır.

    Ödev
    Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        Örnek : 1643 = 1 + 6 + 4 + 3 = 14

    VİDEODAKİ ÖDEV
    * Üç basamaklı armstron sayıları bulup ekrana basan programı yazınız.

*
*/

import java.util.Scanner;

public class SayiBasamaklariVeArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N, K = 0, answer = 0;
        String sVal = "", tempSVal = "";

        // İlk önce girilen sayının basamak değerlerini hesaplayan algoritmayı yazacağım.
        /*
        ÖRNEK: Girilen sayı : 123 ise çıktısı : 1 + 2 + 3 = 6 olacak...
         */

        System.out.print("Bir sayı giriniz: ");
        N = input.nextInt();

        while (N != 0) {
            K = N % 10;
            answer += K;

            if (N / 10 != 0) {
                sVal = " + " + K;
                tempSVal = sVal + tempSVal;
            } else {
                sVal = "" + K;
                tempSVal = sVal + tempSVal;
            }
            N /= 10;
        }

        System.out.println(tempSVal + " = " + answer);

// Algoritmanın bundan sonrası Üç Basamaklı Armstrong Sayıları bulmak ile ilgili....

        System.out.println("\n***ÜÇ BASAMAKLI ARMSTRONG SAYILAR***");

        int i, tempI, rakam, carp = 1, result;

        for (i = 100; i <= 999; i++) {
            // Ben zaten sayılarımın üç basamaklı olduğunu bildiğim için basamak hesabı yaptırmayacağım...
            tempI = i;
            result = 0;
            while (tempI != 0) {
                rakam = tempI % 10;
                carp = 1;
                for (int j = 0; j<3; j++) {
                    carp *= rakam;
                }
                result += carp;
                tempI /= 10;
            }
            if (i == result) {
                System.out.println(i + " bir ARMSTRONG sayıdır.");
            }
        }

    }
}
