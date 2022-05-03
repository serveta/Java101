package Projeler;

/*
Ödev
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
 */
public class AsalSayilarIlkYuz {
    public static void main(String[] args) {

        int count;

        for (int i = 2; i < 100; i++) {
            count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    if (count > 1) {
                        break;
                    }
                }
            }
            if (count < 2) {
                System.out.print(i + " ");
            }
        }

    }
}
