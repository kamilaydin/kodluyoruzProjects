package java101.lecture.Oop.lc03;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.hireYear = hireYear;
        this.name = name;
        this.workHours = workHours;
        this.salary = salary;
    }

    public double tax() {
        double tax = 0;
        if (this.salary < 1000) ;
        else tax = this.salary * 0.03;
        return tax;

    }

    public int bonus() {
        int bonus = 0;
        if (this.workHours < 40) bonus = 0;
        else if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;

        }
        return bonus;
    }

    public double raiseSalary() {
        double raise = 0;
        if (this.hireYear < 10) raise = this.salary * 0.05;
        else if (this.hireYear >= 10 && this.hireYear < 20) raise = this.salary * 0.1;
        else raise = this.salary * 0.15;
        return raise;
    }

    public void toStr() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Başlangıç Yılı : \n" + this.hireYear);
        System.out.println("Vergi : \n" + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + (bonus() + raiseSalary()));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() + raiseSalary() - tax()));
        System.out.println("Toplam Maaş : " + (this.salary + raiseSalary() + bonus()));


    }


}

