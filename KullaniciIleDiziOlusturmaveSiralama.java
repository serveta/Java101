/*
Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve
dizinin elemanlarını kullanıcıdan alınız.
 */
import java.util.Arrays;
import java.util.Scanner;

public class KullaniciIleDiziOlusturmaveSiralama {

    static void createAray(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print((++i) + ". eleman: ");
            i--;
            array[i] = input.nextInt();
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list;
        int arrayLength;

        System.out.print("Dizinin boyutunu giriniz: ");
        arrayLength = input.nextInt();
        list = new int[arrayLength];

        createAray(list);

        Arrays.sort(list);
        System.out.print("Sıralama: ");
        for (int val : list) {
            System.out.print(val + " ");
        }
    }
}
