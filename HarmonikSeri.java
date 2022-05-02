/*
Pratik - 
Java ile girilen sayının harmonik serisini bulan program yazacağız.
 */
import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N;
        double result = 0;

        System.out.print("Bir sayı giriniz: ");
        N = input.nextInt();

        for (double i = 1; i <= N; i++) {
            result += (1 / i);
        }

        System.out.println("Sonuç = "+ result);
    }
}
