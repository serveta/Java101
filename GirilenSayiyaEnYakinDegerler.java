package Projeler;

import java.util.Scanner;

/*
Ödev
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve büyük en yakın sayıyı bulan programı yazınız.
 */
public class GirilenSayiyaEnYakinDegerler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.print("Bir sayı girin: ");
        num = input.nextInt();

        int buyukYakin = 0;
        int kucukYakin = 0;
        int kckDeger = 0, bykDeger = 0;

        for (int i = 0; i < list.length; i++) {
            if (kckDeger != 1) {
                if (num > list[i]) {
                    if (kckDeger == 0) {
                        kckDeger = num - list[i];
                        kucukYakin = list[i];
                    } else {
                        kckDeger = num - list[i];
                        if ((num - kucukYakin) > kckDeger) {
                            kucukYakin = list[i];
                        }
                    }
                }
            }

            if (bykDeger != 1) {
                if (num < list[i]) {
                    if (bykDeger == 0) {
                        bykDeger = list[i] - num;
                        buyukYakin = list[i];
                    } else {
                        bykDeger = list[i] - num;
                        if ((buyukYakin - num) > bykDeger) {
                            buyukYakin = list[i];
                        }
                    }
                }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + kucukYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + buyukYakin);

    }
}
