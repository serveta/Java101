/*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart

Ödev
Burç bulan program örneğini switch-case kullanmadan yapınız.
 */

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month, day;
        String burc = "";
        boolean isErrorDay = false, isErrorMonth = false;

        System.out.print("Doğduğunuz ay (1-12): ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün (1-31): ");
        day = input.nextInt();

        if (month == 1) {
            if (day > 0 && day <= 21) {
                burc = "Oğlak";
            } else if (day > 21 && day <= 31) {
                burc = "Kova";
            } else {
                isErrorDay = true;
            }
        } else if (month == 2) {
            if (day > 0 && day <= 19) {
                burc = "Kova";
            } else if (day > 19 && day <= 29) {
                burc = "Balık";
            } else {
                isErrorDay = true;
            }
        } else if (month == 3) {
            if (day > 0 && day <= 20) {
                burc = "Balık";
            } else if (day > 20 && day <= 31) {
                burc = "Koç";
            } else {
                isErrorDay = true;
            }
        } else if (month == 4) {
            if (day > 0 && day <= 20) {
                burc = "Koç";
            } else if (day > 20 && day <= 30) {
                burc = "Boğa";
            } else {
                isErrorDay = true;
            }
        } else if (month == 5) {
            if (day > 0 && day <= 21) {
                burc = "Boğa";
            } else if (day > 21 && day <= 31) {
                burc = "İkizler";
            } else {
                isErrorDay = true;
            }
        } else if (month == 6) {
            if (day > 0 && day <= 22) {
                burc = "İkizler";
            } else if (day > 22 && day <= 30) {
                burc = "Yengeç";
            } else {
                isErrorDay = true;
            }
        } else if (month == 7) {
            if (day > 0 && day <= 22) {
                burc = "Yengeç";
            } else if (day > 22 && day <= 31) {
                burc = "Aslan";
            } else {
                isErrorDay = true;
            }
        } else if (month == 8) {
            if (day > 0 && day <= 22) {
                burc = "Aslan";
            } else if (day > 22 && day <= 31) {
                burc = "Başak";
            } else {
                isErrorDay = true;
            }
        } else if (month == 9) {
            if (day > 0 && day <= 22) {
                burc = "Başak";
            } else if (day > 22 && day <= 30) {
                burc = "Terazi";
            } else {
                isErrorDay = true;
            }
        } else if (month == 10) {
            if (day > 0 && day <= 22) {
                burc = "Terazi";
            } else if (day > 22 && day <= 31) {
                burc = "Akrep";
            } else {
                isErrorDay = true;
            }
        } else if (month == 11) {
            if (day > 0 && day <= 21) {
                burc = "Akrep";
            } else if (day > 22 && day <= 30) {
                burc = "Yay";
            } else {
                isErrorDay = true;
            }
        } else if (month == 12) {
            if (day > 0 && day <= 21) {
                burc = "Yay";
            } else if (day > 22 && day <= 31) {
                burc = "Oğlak";
            } else {
                isErrorDay = true;
            }
        } else {
            isErrorMonth = true;
        }

        if (isErrorMonth) {
            System.out.println("Hatalı ay girişi yaptınız!");
        } else if (isErrorDay) {
            System.out.println("Hatalı gün girişi yaptınız!");
        } else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}
