package p35_encapsulation;

import java.util.Scanner;

public class C10_EmployeesRunner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Isminizi giriniz : ");
        String name=scan.nextLine();

        System.out.println("Dogum tarihinizi giriniz ");
        String dob= scan.nextLine();

        System.out.println("Maas beklentinizi giriniz : ");
        int salary=scan.nextInt();




        C09_Employees calisan1=new C09_Employees();
        calisan1.setName(name);
        calisan1.setSalary(salary);
        calisan1.setDob(dob);
        int calisanYas=calisan1.yasHesaplamaMethodu(dob);

        if (calisanYas>18) {
            System.out.println("Welcome to our company " +
                    calisan1.getName()+" your salary is : "
            +calisan1.getSalary());
        }
        else if (calisanYas==18) {
            System.out.println("We can have intern with you after" +
                    " that you can have a  " +calisan1.getSalary());
        }

        else if (calisanYas<18){
            System.out.println("Come back when you are 18 years old");
        }
    }
}
