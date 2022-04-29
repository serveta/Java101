
import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik, toplam;
        double ortalama;

        System.out.print("Matematik dersi notunuz: ");
        matematik = input.nextInt();
        System.out.print("Fizik dersi notunuz: ");
        fizik = input.nextInt();
        System.out.print("Kimya dersi notunuz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe dersi notunuz: ");
        turkce = input.nextInt();
        System.out.print("Tarih dersi notunuz: ");
        tarih = input.nextInt();
        System.out.print("Müzik dersi notunuz: ");
        muzik = input.nextInt();

        toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        ortalama = toplam / 6;

        System.out.println("Ortalamanız: " + ortalama);
        System.out.print("Durumunuz: ");
        String durum = ortalama > 60 ? "GEÇTİ" : "KALDI";
        System.out.println(durum);
    }

}
