/*
Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak
isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı,
lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, newPassword;
        int select;

        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java101")){
            System.out.println("Başarıyla Giriş Yaptınız!");
        }
        else {
            System.out.println("Kullanıcı adı veya şifreniz yanlış!\nŞifrenizi sıfırlamak ister misiniz?");
            System.out.print("1-Evet\n2-Hayır\n Seçimizin: ");
            select = input.nextInt();
            switch (select){
                case 1:
                    System.out.println("***ŞİFRE SIFIRLAMA İŞLEMİ BAŞLATILDI***");
                    System.out.print("Lütfen yeni şifrenizi giriniz: ");
                    Scanner input2 = new Scanner(System.in);
                    newPassword = input2.nextLine();
                    System.out.println((newPassword.equals(password) || newPassword.equals("java101")) ? "Şifre oluşturulamadı, lütfen başka şifre giriniz.":"Şifre oluşturuldu.");
                    break;
                case 2:
                    System.out.println("Program sonlandırıldı!");
                    break;
                default:
                    System.out.println("Hatalı işlem seçimi yaptınız!");
            }
        }
    }
}
