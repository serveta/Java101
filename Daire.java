/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r, a;
        double area, perimeter, pi = 3.14;
        String areaStr;

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        System.out.print("Daire diliminin merkez açısını giriniz: ");
        a = input.nextInt();

        area = a==360 ? r*r*pi : (pi * (r*r) * a)/360;
        areaStr = a==360 ? "Dairenin alanı: " : "Daire diliminin alanı: ";
        perimeter = 2*pi*r;

        System.out.println(areaStr+area);
        System.out.println("Dairenin çevresi: "+perimeter);
    }
}
