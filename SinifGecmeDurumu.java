/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */
import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik, gecmeNotu = 55, derssayisi = 5;
        double avarage;

        System.out.print("Matematik notunuz: ");
        matematik = input.nextInt();
        matematik = (matematik<0 || matematik>100) ? 0 : matematik;

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        fizik = (fizik<0 || fizik>100) ? 0 : fizik;

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        turkce = (turkce<0 || turkce>100) ? 0 : turkce;

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        kimya = (kimya<0 || kimya>100) ? 0 : kimya;

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        muzik = (muzik<0 || muzik>100) ? 0 : muzik;

        avarage = (matematik + fizik + turkce + kimya + muzik) / derssayisi;

        if(avarage >= gecmeNotu){
            System.out.println("Tebrikler. Sınıfı geçtiniz.");
        }
        else{
            System.out.println("Sınıfı geçemediniz.");
        }

        System.out.println("Ortalamanız: "+avarage);
    }
}
