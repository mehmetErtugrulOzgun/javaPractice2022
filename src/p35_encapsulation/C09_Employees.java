package p35_encapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C09_Employees {
    /*
    Burada iki adet class vardir biri runner biri employees
    Employees classinda
    Bu variablelari olusturunuz
    private String name,
    private int salary,
    private String dob(date of birth)
    getter ve setter olusturunuz.

    Main class icinde kullanicidan name dob ve salary bilgilerini alip
    Eger employee 18 yasindan buyukse welcome to our company name your salary is salary yazdiriniz
    Eger employee 18 yasindan kucukse come back when you are 18 years old yazdirin
    Eger employee 18 yasinda ise we can have intern with you after that you can have a ..... salary yazdiriniz

    Ornek
    name ise Fernando
    dob 27/12/1954
    Salary is 80000

   ageCalculator isminde bir metod olusturunuz.Suan ki tarih- dogum yili=employee yasi
     */

    private String name;
    private int salary;
    private String dob;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    public int yasHesaplamaMethodu(String girilenDogumGunu) {
        String strDate=dob;
        DateTimeFormatter format=DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate bugun=LocalDate.now();

        LocalDate dTarihi=LocalDate.parse(strDate, format);
        //  kullanicinin girdigi stringi MM/dd/yyyy yaptik

        int age=(bugun.getYear() - dTarihi.getYear());
        //  kullanicinin yasini hesapladik

        return age;
    }
}
