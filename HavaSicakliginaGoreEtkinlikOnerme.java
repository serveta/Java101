/*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
 */
import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heat;

        System.out.print("Şu an hava kaç derece: ");
        heat = input.nextInt();

        if (heat > -20 && heat < 5) {
            System.out.println("- Kayak yapabilirsiniz.");
        }
        if (heat >= 5 && heat < 15) {
            System.out.println("- Sinemaya gidebilirsiniz.");
        }
        if (heat > 10 && heat <= 25) {
            System.out.println("- Piknik yapabilirsiniz.");
        }
        if (heat > 25 && heat < 50) {
            System.out.println("- Yüzmeye gidebilirsiniz.");
        }
        if (heat < -20 || heat >= 50) {
            System.out.println(heat + " derece için bir önerim yok.");
        }

    }
}
