/*
Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını
hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

Sınıfın Nitelikleri

name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı
Sınıfın Metotları

Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.
 */

package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    double totalSalary;
    int workHours;
    int hireYear;
    double tax = 0;
    double bonus;
    int yearCount;
    double raiseSalary;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.totalSalary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax() {
        if (this.salary >= 1000) {
            this.tax = this.salary * 0.03;
            this.totalSalary -= this.tax;
        }
    }

    void bonus() {
        if (this.workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
            this.totalSalary += this.bonus;
        }
    }

    void raiseSalary() {
        yearCount = 2021 - this.hireYear;
        if (yearCount < 10) {
            this.raiseSalary = this.salary * 0.05;
        } else if (yearCount < 20) {
            this.raiseSalary = this.salary * 0.10;
        } else {
            this.raiseSalary = this.salary * 0.15;
        }

        this.totalSalary += this.raiseSalary;
    }

    void print() {
        System.out.println("*** Çalışan Maaş Bordrosu ***");
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("İşe Başlama Tarihi : " + this.hireYear);
        System.out.println("Vergi Kesintisi : " + this.tax);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Bu Yıl Maaş Artışı : " + this.raiseSalary);
        System.out.println("Vergi ve Bonuslar ile Maaş : " + ((this.salary) + (this.bonus) - (this.tax)));
        System.out.println("Toplam Maaş: " + this.totalSalary);
    }

}
