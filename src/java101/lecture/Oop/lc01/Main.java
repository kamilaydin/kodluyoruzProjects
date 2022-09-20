package java101.lecture.Oop.lc01;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT",60);
        Course fizik = new Course("Fizik", "FZK101", "FZK",60);
        Course kimya = new Course("Kimya", "KMY101", "KMY",60);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "140144015", 4, mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "2211133", 4, mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "221121312", 4, mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();
    }
}
