import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fiyat, kdvOrani, kdvTutari, kdvliTutar;

        System.out.print("Ürünün fiyatını giriniz: ");
        fiyat = input.nextInt();

        kdvOrani = fiyat > 0 && fiyat <= 1000 ? 0.18 : 0.08;

        kdvTutari = fiyat * kdvOrani;
        kdvliTutar = fiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat: "+fiyat);
        System.out.println("KDV Oranı: "+kdvOrani);
        System.out.println("KDV Tutarı: "+kdvTutari);
        System.out.println("Fiyat + KDV: "+kdvliTutar);
    }
}
