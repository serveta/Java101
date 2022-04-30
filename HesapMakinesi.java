/*
Ödev
Videodaki hesap makinesini switch-case kullanarak yapınız.
 */
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;

        System.out.print("1. Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.print("\nİŞLEM SEÇİN;\n1-Topla\n2-Çıkarma\n3-Çarpma\n4-Bölme\n Seçiminiz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
                break;
            case 3:
                System.out.println(n1 + " x " + n2 + " = " + (n1*n2));
                break;
            case 4:
                System.out.println(n2 != 0 ? n1 + " / " + n2 + " = " + (n1/n2) : "*Hiçbir sayı sıfıra bölünemez!");
                break;
            default:
                System.out.println("*Hatalı işlem seçimi yaptınız!");
        }
    }
}
