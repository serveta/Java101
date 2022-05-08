/*
Ödev
Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.
 */
public class ArrayIleBHarfi {
    public static void main(String[] args) {

        String[][] bHarfi = new String[7][4];

        for (int i = 0; i < bHarfi.length; i++) {
            for (int j = 0; j < bHarfi[i].length; j++) {
                if ((i == 0 || i == 3 || i == 6) && j != (bHarfi[i].length - 1)) {
                    bHarfi[i][j] = "* ";
                } else {
                    if (j == 0 || j == (bHarfi[i].length - 1)) {
                        bHarfi[i][j] = "*";
                    } else {
                        bHarfi[i][j] = "\t";
                    }
                }
            }
        }

        for (String[] row : bHarfi) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
