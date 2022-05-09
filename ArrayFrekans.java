/*
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
 */
import java.util.Arrays;

public class ArrayFrekans {

    static boolean isThere(int[] arr, int value) {
        for (int val : arr) {
            if (val == value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);

        int count;


        for (int i=0 ; i < list.length; i++) {
            count = 0;
            for (int j = i; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                } else {
                    break;
                }
            }
            i += (count-1);
            System.out.println(list[i] + " sayısı dizide " + count + " defa tekrar ediyor.");
        }


    }
}
