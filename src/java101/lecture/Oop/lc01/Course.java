package java101.lecture.Oop.lc01;

import javax.swing.plaf.ColorUIResource;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;

    int tNote;
    int note;

    public Course(String name,String code,String prefix,int tNote){

        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.tNote=tNote;
        this.note=0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }











}
