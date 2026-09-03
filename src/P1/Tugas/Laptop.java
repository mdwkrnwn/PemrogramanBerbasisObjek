package P1.Tugas;

public class Laptop extends Perangkat {

    String ram;
    String processor;

    void openApplication() {
        System.out.println("Laptop membuka aplikasi");
    }

    void chargeBattery() {
        System.out.println("Laptop sedang mengisi daya");
    }

    @Override
    void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram);
        System.out.println("Processor: " + processor);
    }
}