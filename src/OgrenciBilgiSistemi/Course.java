package OgrenciBilgiSistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int performNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.performNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("BAŞARILI: " + name + " öğretmeni olarak '" + courseTeacher.name + "' atandı.");
        } else {
            System.out.println("HATA: " + courseTeacher.name + ", " + name + " dersi öğretmeni değil.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersi öğretmeni\t: " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine öğretmen atanmamıştır.");
        }
    }
}
