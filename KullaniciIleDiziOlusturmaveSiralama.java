package Projeler;
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

    static int[] sortArray(int[] array) {
        int len = array.length;
        int temp;

        for (int i = 0; i < len; ++i) {
            for (int j = (i + 1); j < len; ++j) {
                if (array[j] < array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list;
        int arrayLength;

        System.out.print("Dizinin boyutunu giriniz: ");
        arrayLength = input.nextInt();
        list = new int[arrayLength];

        createAray(list);
        System.out.println("Sıralama: " + Arrays.toString(sortArray(list)));
/*
        Arrays.sort(list);
        System.out.print("Sıralama: ");
        for (int val : list) {
            System.out.print(val + " ");
        }

 */
    }
}
