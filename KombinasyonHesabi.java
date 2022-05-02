/*
Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu
olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */

import java.util.Scanner;

public class KombinasyonHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r, C, nFactorial = 1, rFactorial = 1, nrFactorial = 1;
        boolean isError = false;

        System.out.println("** Kombinasyon Hesabı C(n,r) şeklinde hesaplanır!");
        System.out.print("n : ");
        n = input.nextInt();

        System.out.print("r : ");
        r = input.nextInt();

        if (n >= r && r >= 0) {
            for (int i = 1; i <= n; i++) {
                nFactorial *= i;

                if (i <= r) {
                    rFactorial *= i;
                }
                if (i <= (n - r)) {
                    nrFactorial *= i;
                }

            }
        } else {
            isError = true;
        }

        C = nFactorial / (rFactorial * nrFactorial);

        if (isError) {
            System.out.println("Hata: r büyük veya eşit 0 iken n büyük veya eşit r olmalı.");
        } else {
            System.out.println("C(" + n + "," + r + ") = " + C);
        }
    }
}
