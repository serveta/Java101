/*
Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */
import java.util.Scanner;

public class UsluSayiHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, answer = 1;

        System.out.print("Bir sayı yazın: ");
        x = input.nextInt();

        System.out.print("Üs sayısını yazın: ");
        y = input.nextInt();

        for (int i = 0; i < y; i++) {
            answer *= x;
        }

        System.out.println(x+"^"+y+" = "+ answer);
    }
}
