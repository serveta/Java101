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
        this.avarage = (this.fizik.note + this.kimya.note + this.matematik.note) / 3;
    }

    private boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    private void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.matematik.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}
