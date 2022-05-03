
/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana
“mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan
sayıya mükemmel sayı denir.

 */
 
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, count = 0;

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count += i;
            }
        }

        if (num == count) {
            System.out.println(num + " mükemmel sayıdır.");
        } else {
            System.out.println(num + " mükemmel sayı değildir.");
        }

    }
}
