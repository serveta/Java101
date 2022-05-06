package OgrenciBilgiSistemi;

public class Student {
    String name;
    String stdNo;
    int classes;
    Course matematik;
    Course kimya;
    Course fizik;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stdNo = stuNo;
        this.matematik = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int matematik, int fizik, int kimya) {

        if (matematik >= 0 && matematik <= 100) {
            this.matematik.note = matematik;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkPerformNote(int matematikPerform, int fizikPerform, int kimyaPerform) {
        if (matematikPerform >= 0 && matematikPerform <= 100) {
            this.matematik.performNote = matematikPerform;
        }

        if (fizikPerform >= 0 && fizikPerform <= 100) {
            this.fizik.performNote = fizikPerform;
        }

        if (kimyaPerform >= 0 && kimyaPerform <= 100) {
            this.kimya.performNote = kimyaPerform;
        }
    }

    public void isPass() {
        if (this.matematik.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            System.out.print("DURUM: ");
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }


    private void calcAvarage() {
        this.avarage = (
                (((this.fizik.note)*0.80)+((this.fizik.performNote)*0.20)) +
                (((this.kimya.note)*0.80)+(this.kimya.performNote)*0.20) +
                (((this.matematik.note)*0.80)+(this.matematik.performNote)*0.20)
        ) / 3;
    }

    private boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    private void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav & Sözlü Notu : " + this.matematik.note + " | " + this.matematik.performNote);
        System.out.println("Fizik Sınav & Sözlü Notu : " + this.fizik.note + " | " + this.fizik.performNote);
        System.out.println("Kimya Sınav & Sözlü Notu : " + this.kimya.note + " | " + this.kimya.performNote);
    }

}
