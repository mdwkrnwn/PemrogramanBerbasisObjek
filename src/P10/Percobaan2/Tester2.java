package P10.Percobaan2;

import P10.Percobaan1.Employee;
import P10.Percobaan1.PermanentEmployee;

public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);

        Employee e = pEmp;

        System.out.println(e.getEmployeeInfo());
        System.out.println("--------------------");
        System.out.println(pEmp.getEmployeeInfo());
    }
}
