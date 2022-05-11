package Projeler;
/*
Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini 
istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randNumber = random.nextInt(100);
        int number;
        int right = 5;
        int[] answers = new int[right];
        int count = 0;
        boolean isWin = false;
        boolean isWrong = true;
        boolean isRight = false;

        System.out.println("*** SAYI TAHMİN OYUNU (0-100) ***");
        do {
            System.out.print((++count) + ". Tahmininiz : ");
            --count; // array için de kullanıldığından tekrar azaltıyorum...
            number = input.nextInt();

            if (number < 0 || number > 100) {
                if (isWrong) {
                    System.out.println("* Tahminleriniz 0 - 100 aralığında olmalı!");
                    System.out.println("* Tekrar değer aralığı dışında bir tahminde bulunursanız hakkınız eksilecektir.");
                    isWrong = false;
                    continue;
                } else {
                    System.out.println("* Değer aralığı dışında tahminde bulundunuz.");
                    isRight = true;
                }
            }


            answers[count++] = number;

            if (number > randNumber) {
                System.out.println("* Tahmininiz yanlış. Daha KÜÇÜK bir tahminde bulunun.");
                isRight = true;
            } else if (number < randNumber) {
                System.out.println("* Tahmininiz yanlış. Daha BÜYÜK bir tahminde bulunun.");
                isRight = true;
            } else {
                isWin = true;
                break;
            }

            if (isRight) {
                System.out.println("* Kalan hakkınız: " + (--right));
                isRight = false;
            }


        } while (right > 0);

        if (isWin) {
            System.out.println("*** TEBRİKLER! Tahmininiz DOĞRU : " + randNumber);
            System.out.println("*** " + (5 - (--right)) + " tahminde bildiniz.");
            System.out.println("*** Tahminleriniz : " + Arrays.toString(answers));
        } else {
            System.out.println("*** KAYBETTİNİZ!");
            System.out.println("*** Tahminleriniz : " + Arrays.toString(answers));
            System.out.println("*** DOĞRU CEVAP : " + randNumber + " olmalıydı!");
        }

    }
}
