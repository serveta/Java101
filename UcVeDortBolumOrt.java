/*
Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */

import java.util.Scanner;

public class UcVeDortBolumOrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numFromUser, sum = 0, avarage, count = -1;

        System.out.print("Bir sayı yazın: ");
        numFromUser = input.nextInt();

        for (int i = 0; i <= numFromUser; i++) {
            if (i % 12 == 0) {
                sum += i;
                count++;
            }
        }

        avarage = sum / count;
        System.out.println("0 - " + numFromUser + " arasındaki 3 ve 4 rakamlarına tam bölünen sayıların ortalaması = " + avarage);
    }
}
