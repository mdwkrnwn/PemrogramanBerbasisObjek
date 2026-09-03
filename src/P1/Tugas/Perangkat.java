package P1.Tugas;

public class Perangkat {
    String brand;
    String powerStatus;

    void turnOn() {
        powerStatus = "Menyala";
        System.out.println("Perangkat dinyalakan");
    }

    void turnOff() {
        powerStatus = "Mati";
        System.out.println("Perangkat dimatikan");
    }

    void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Status: " + powerStatus);
    }
}