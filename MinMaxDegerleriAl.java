/*
Java ile klavyeden girilen N tane sayma sayısından en büyük
ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
 */
import java.util.Scanner;

public class MinMaxDegerleriAl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, min = 0, max = 0, num;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayınız: ");
            num = input.nextInt();

            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }

        System.out.println("Yazdığınız en büyük sayı: " + max);
        System.out.println("Yazdığınız en küçük sayı: " + min);
    }
}
