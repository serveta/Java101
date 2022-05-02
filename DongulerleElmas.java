/*

Ödev
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

        N = 5 iken örnek elmas modelimiz...

         *
        ***
       *****
      *******
     *********
      *******
       *****
        ***
         *

NOT: Ben ayrıca elmasın hangi şekil ile basılacağına dair bir seçim sundum.
     Bu yüzden algoritma olması gerekenden biraz uzun.

 */

import java.util.Scanner;

public class DongulerleElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N, select;
        String X = "";

        do {
            System.out.print("Elmas büyüklüğü kaç birim olsun: ");
            N = input.nextInt();
            if(N<=1){
                System.out.println("Lütfen 1'den büyük bir sayı giriniz.");
            }
        }while(N<=1);
        
        do {
            System.out.println("Elmas hangi şekil ile basılsın: ");
            System.out.print("0 => 0\n1 => *\n2 => -\n3 => x\n Seçiminiz: ");
            select = input.nextInt();

            switch (select) {
                case 0:
                    X = "0";
                    break;
                case 1:
                    X = "*";
                    break;
                case 2:
                    X = "-";
                    break;
                case 3:
                    X = "x";
                    break;
                default:
                    System.out.println("Lütfen 0,1,2,3 arasından bir değer seçiniz.");
            }
        } while (select<0 || select>3);


        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < (N - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {

                System.out.print(X);
            }
            System.out.println();
        }

        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < (N - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print(X);
            }
            System.out.println();
        }


    }
}
