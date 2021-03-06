/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

Örnek Çıktı;
Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL

 */
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5,
                kgArmut, kgElma, kgDomates, kgMuz, kgPatlican, total=0;

        System.out.print("Armut kaç kilo? : ");
        kgArmut = input.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        kgElma = input.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        kgDomates = input.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        kgMuz = input.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        kgPatlican = input.nextDouble();
        
        total = (kgArmut*armut) + (kgElma*elma) + (kgDomates*domates) + (kgMuz*muz) + (kgPatlican*patlican);

        System.out.println("Toplam Tutar: "+total+ " TL");
    }
}
