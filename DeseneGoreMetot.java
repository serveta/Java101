/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma
işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

Senaryolar
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16

N Sayısı : 10
Çıktısı : 10 5 0 5 10

N Sayısı : 25
Çıktısı : 25 20 15 10 5 0 5 10 15 20 25
 */

import java.util.Scanner;

public class DeseneGoreMetot {

    /*
    
    Ben çok karmaşık düşünmüşüm, ödevimi paylaştıktan sonra diğer ödevleri incelerken şunu fark ettim ve aslında
    mantığın sandığım kadar zor olmadığını fark ettim :)
    
    static void desen(int sayi){
        if(sayi<=0){
            System.out.print(" " + sayi);
            return;
        }
        System.out.print(" " +sayi);
        metotOlusturma(sayi - 5);
        System.out.print(" " + sayi);

    }
    */
    static int desen(int num, int count, int tempCount) {

        System.out.print(num + " ");

        if (num > 0 && count > 0) {
            return desen(num - 5, --count, tempCount);
        } else if (count <= 0 && tempCount > 0) {
            if (num > 0 && count == 0) {
                num-=5;
                System.out.print(num + " ");
                num+=5;
                System.out.print(num + " ");
            }
            return desen(num + 5, --count, --tempCount);
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Bir sayı girin: ");
        number = input.nextInt();

        System.out.print(desen(number, (number / 5), (number / 5)) == 0 ? "" : desen(number, (number / 5), (number / 5)));

    }
}
