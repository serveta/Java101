/*
Ödev
Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.

NOT: Ben projede istenildiği gibi switch - case kullandım ve ayrıca projeye elimden geldiğince farklı şeyler eklemeye
çalıştım. Bu doğrultuda;
 - her ana menü işleminden sonra kişiye ana menüye mi dönmek istediği, çıkış mı yapmak istediği
 sorusunu sordum ve buna göre kişiyi isteği doğrultusunda yönlendirdim.
 */
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int balance = 1260;
        int right = 3;
        int select = -1;
        int nextReturn = -1;
        int control;
        String userName;
        String password;
        boolean isLogin = false;

        System.out.println("Merhaba, KODLUYORUZ Bankasına Hoş Geldiniz!");
        do {
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Sisteme giriş yaptınız.");
                right = 0;
                isLogin = true;
            } else {
                System.out.println("Kullanıcı adı veya parolanız yanlış.");
                System.out.println("Tekrar deneme hakkınız: " + (--right));
            }
        } while (right != 0);

        if (isLogin) {
            do {
                if (nextReturn == -1) {
                    nextReturn++;
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz;");
                    System.out.print("1 => Bakiye Sorgulama\n" +
                            "2 => Para Yatırma\n" +
                            "3 => Para Çekme\n" +
                            "4 => Çıkış Yap\n" +
                            " Seçiminiz: "
                    );
                    select = input.nextInt();
                }
                switch (select) {
                    case 1:
                        System.out.println("Hesabınızda bulunan para = " + balance + " TL");
                        break;
                    case 2:
                        System.out.print("Para girişi yapınız: ");
                        balance += input.nextInt();
                        System.out.println("Hesabınızdaki para miktarı " + balance + " TL oldu.");
                        break;
                    case 3:
                        System.out.print("Kaç TL çekeceksiniz: ");
                        control = input.nextInt();
                        if (control > balance) {
                            System.out.println("Hesabınızda yeterli para bulunmuyor.");
                            System.out.println("Bakiyeniz: " + balance);
                        } else {
                            balance -= control;
                            System.out.println("Hesabınızda kalan para miktarı: " + balance);
                        }
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("ERROR: Ana menü kısmı...");
                }

                if(select != 4) {
                    System.out.print("1 => Ana Menü\n2 => Çıkış Yap \n Seçiminiz:");
                    select = input.nextInt();


                    switch (select) {
                        case 1:
                            nextReturn = -1;
                            break;
                        case 2:
                            nextReturn = 1;
                            break;
                        default:
                            System.out.println("ERROR: Ana Menü - Çıkış Yap bölümü...");
                    }
                }

            } while (nextReturn == -1);

            System.out.println("Hesabınızdan güvenli şekilde çıkış yaptınız.");

        } else {
            System.out.println("Hesap bloke edilmiştir. Lütfen banka ile iletişime geçiniz!");
        }

    }
}
