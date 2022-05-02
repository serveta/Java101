/*
Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N, count = 0;

        System.out.print("Limit sayısını giriniz: ");
        N = scan.nextInt();

        for (int i = 1, j = 1; i <= N || j <= N; i *= 4, j *= 5) {
            System.out.println("4^" + count + " = " + i);
            if (j <= N) {
                System.out.println("5^" + count + " = " + j);
            }
            count++;
        }
    }
}
