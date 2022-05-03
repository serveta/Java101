/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana
ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10

 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *

 */
import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N;

        System.out.print("Basamak değerini giriniz: ");
        N = input.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (N - i)*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
