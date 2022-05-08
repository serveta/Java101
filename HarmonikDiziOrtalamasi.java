/*
Ödev
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
 */
public class HarmonikDiziOrtalamasi {
    public static void main(String[] args) {

        // Harmonik dizinin ilk üç elemanını saklayan dizi;
        double[] list = new double[3];
        double sum = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = 1 / (double) ++i;
            i--;
            System.out.println(list[i]);
            sum += list[i];
        }

        System.out.println("Harmonik Ortalama: " + (list.length / sum));

    }
}
