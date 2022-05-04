/*
Ödev
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının
"Asal" sayı olup olmadığını bulan programı yazın.
 */
import java.util.Scanner;

public class RecursiveAsal {

    static int asal(int num, int i) {
        if (num <= 1) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        if (num % i == 0) {
            return 1;
        }

        return asal(num, --i);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num;

        System.out.print("Bir sayı giriniz: ");
        num = inp.nextInt();

        System.out.print(num);
        System.out.println(asal(num, num / 2) == 0 ? " ASALDIR" : " Asal DEĞİLDİR");
    }
}
