/*

Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

 */

import java.util.Scanner;

public class HipotenusBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Uzunluk ölçümü sadece tam sayı olmayabilir bu yüzden tüm değişkenlerimi double yaptım.
        double a, b, c;

        System.out.print("1. dik kenarının uzunluğu: ");
        a = input.nextDouble();
        System.out.print("2. dik kenarının uzunluğu: ");
        b = input.nextDouble();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüsün uzunluğu: "+ c);

        System.out.println("\n**ÖDEV BÖLÜMÜ**");
        /*  ÖDEV KISMI , aynı değişkenleri kullanarak yapıyorum. Sadece ek olarak u ve alan tanımlıyorum. */

        double u, alan;

        System.out.print("1. kenarının uzunluğu: ");
        a = input.nextDouble();
        System.out.print("2. kenarının uzunluğu: ");
        b = input.nextDouble();
        System.out.print("3. kenarının uzunluğu: ");
        c = input.nextDouble();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        /*
        Eğer girilen uzunluk değerleri bir üçgen oluşturmuyorsa alan hesabı yapılamıyor.
        Bu yüzden ben de basitçe bu durumda kullanıcıyı şu şekilde bilgilendirdim;
         */

        String kontrolSonuc = (alan > 0) ? "Üçgenin alanı: " : "*Hesaplama başarısız!--";

        System.out.println(kontrolSonuc + alan);
    }
}
