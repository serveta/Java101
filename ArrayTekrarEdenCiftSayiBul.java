/*
Ödev
Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazın.
 */
import java.util.Arrays;

public class ArrayTekrarEdenCiftSayiBul {

    static boolean isEvenNum(int value) {
        return (value % 2 == 0);
    }

    static boolean isThere(int[] array, int value) {
        for (int find : array) {
            if (find == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {1, 8, 0, 0, 2, 3, 4, 5, 4, 2, 8, 2, 0, 6, 5, 1, 6, 6};
        int[] duplicateNumbers = new int[list.length];
        Arrays.fill(duplicateNumbers, -1);
        int count = -1;

        for (int i = 0; i < list.length; i++) {
            if (isEvenNum(list[i])) {
                for (int j = 0; j < list.length; j++) {
                    if (i != j) {
                        if ((isEvenNum(list[j])) && (list[i] == list[j])) {
                            if (!isThere(duplicateNumbers, list[j])) {
                                duplicateNumbers[++count] = list[i];
                            }
                            break;
                        }
                    }
                }
            }
        }

        Arrays.sort(duplicateNumbers);
        System.out.print("Tekrar eden çift sayılar: [");
        for (int i = 0; i < duplicateNumbers.length; i++) {
            int c = i + 1;
            if (duplicateNumbers[i] != -1) {
                System.out.print(duplicateNumbers[i]);
            }
            if (c < duplicateNumbers.length && duplicateNumbers[c] != -1 && duplicateNumbers[i] != -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
