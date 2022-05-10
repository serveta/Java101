/*
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
 */
import java.util.Scanner;

public class MatrisTranspozu {

    static void createMatris(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ++count;
            }
        }
    }

    private static void createMatrisTranspoze(int[][] matris, int[][] transpoze) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }
    }

    private static void printMatris(int[][] arr) {
        for (int[] col : arr) {
            for (int row : col) {
                System.out.print(row + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("Matris boyutunu giriniz (aXb);");
        System.out.print("a: ");
        a = input.nextInt();
        System.out.print("b: ");
        b = input.nextInt();

        int[][] matris = new int[a][b];
        int[][] transpoze = new int[matris[0].length][matris.length];

        createMatris(matris);
        createMatrisTranspoze(matris, transpoze);

        System.out.println("Matris: ");
        printMatris(matris);

        System.out.println("Transpoze:");
        printMatris(transpoze);

    }
}
