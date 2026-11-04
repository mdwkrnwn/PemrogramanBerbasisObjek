package P10.Percobaan3;

import P10.Percobaan1.ElectricityBill;
import P10.Percobaan1.Employee;
import P10.Percobaan1.InternshipEmployee;
import P10.Percobaan1.Payable;
import P10.Percobaan1.PermanentEmployee;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);

        ElectricityBill eBill = new ElectricityBill(5, "A-1");

        Employee[] e = { pEmp, iEmp };
        Payable[] p = { pEmp, eBill };

    }
}
