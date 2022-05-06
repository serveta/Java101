package OgrenciBilgiSistemi;

/**
 * Öğrenci Not Sistemi
 * <p>
 * Course Sınıfı Özellikleri :
 * Nitelikler : name,code,prefix,note,Teacher
 * Metotlar : Course() , addTeacher() , printTeacher()
 * <p>
 * Teacher Sınıfı Özellikleri :
 * Nitelikler : name,mpno,branch
 * Metotlar : Teacher()
 * <p>
 * Student Sınıfı Özellikleri :
 * Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
 * Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
 * <p>
 * Ödev
 * Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
 * Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.
 * <p>
 * Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
 * <p>
 * Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
 * <p>
 * Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
 */
public class App {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "Mat101", "mat");
        Course fiz = new Course("Fizik", "Fiz101", "fiz");
        Course kim = new Course("Kimya", "Kim101", "kim");

        Teacher teacher1 = new Teacher("Servet Arslan", "0511-111-11-11", "mat");
        Teacher teacher2 = new Teacher("Derya San", "0511-222-22-22", "fiz");
        Teacher teacher3 = new Teacher("Halil Şen", "0511-333-33-33", "kim");

        Student st1 = new Student("Arslan Servet", 100, "101", mat, fiz, kim);
        Student st2 = new Student("San Derya", 102, "102", mat, fiz, kim);
        Student st3 = new Student("Şen Halil", 103, "103", mat, fiz, kim);

        mat.addTeacher(teacher1);
        fiz.addTeacher(teacher2);
        kim.addTeacher(teacher3);

        mat.printTeacher();
        fiz.printTeacher();
        kim.printTeacher();

        st1.addBulkExamNote(100,100,100);
        st1.addBulkPerformNote(50,50,50);
        st1.isPass();
        st2.addBulkExamNote(100,100,100);
        st2.addBulkPerformNote(10,10,10);
        st2.isPass();
        st3.addBulkExamNote(50,47,30);
        st3.addBulkPerformNote(15,15,15);
        st3.isPass();

    }
}
