/*
Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....

 */

import java.util.Scanner;

public class PalindromSayi {

    /* BU metot benim videoyu izlemeden önce kendimce çözüm yolu ürettiğim metottur. */
    static void PalindromSayiBul(int number) {
        if (number < 0) {
            System.out.println("Palindrom sayılar doğal sayılarda tanımlıdır.");
        } else if (number == 0) {
            System.out.println("0 palindrom sayıdır.");
        } else {
            String numberStr = "" + number;
            String numberControl = "";
            int rakam;

            while (number > 0) {
                rakam = number % 10;
                numberControl += "" + rakam;
                number /= 10;
            }

            if (numberControl.equals(numberStr)) {
                System.out.println(numberStr + " palindromik sayıdır.");
            } else {
                System.out.println(numberStr + " palindromik sayı değildir.");
            }
        }
    }


    /* Bu metot videoyu izledikten sonra uyguladığım metottur.  */
    static boolean isPalindrom(int num) {
        int tempNum = num, reverseNum = 0;

        while (tempNum != 0) {
            int lastNum = tempNum % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            tempNum /= 10;
        }

        if (reverseNum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Bir sayı yazın: ");
        num = input.nextInt();

        System.out.println("Kendi yazdığım metodun cevabı...");
        PalindromSayiBul(num);

        System.out.println("----------------------");

        System.out.println("Videoyu izledikten sonra yazdığım metodun cevabı...");
        if (isPalindrom(num)) {
            System.out.println(num + " palindromik sayıdır.");
        } else {
            System.out.println(num + " palindromik değildir.");
        }

    }
}
