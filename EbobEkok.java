/*
Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.

EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.
18’in bölenleri : 1, 2, 3, 6, 9, 18
24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24
Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.
9: 1, 3, 9
12: 1, 2, 3, 4, 6, 12

EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.
ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.
6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …
8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …
Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.

EKOK = (n1*n2) / EBOB

Ödev
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
 */

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, tempNum1, tempNum2, ebob = 0, ekok = 0, count = 1;

        System.out.print("1. sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        num2 = input.nextInt();


        if (num2 < num1) {
            tempNum1 = num1;
            tempNum2 = num2;

            num1 = tempNum2;
            num2 = tempNum1;
        }

        while (count <= num1) {
            if (num1 % count == 0 && num2 % count == 0) {
                ebob = count;
            }
            count++;
        }

        count = 1;
        //ekok = (num1*num2) / ebob;

        while (count <= (num1 * num2)) {
            if (count % num1 == 0 && count % num2 == 0) {
                ekok = count;
                break;
            } else {
                count++;
            }
        }

        System.out.println("EBOB(" + num1 + "," + num2 + ") = " + ebob);
        System.out.println("EKOK(" + num1 + "," + num2 + ") = " + ekok);

    }
}
