package P1.Tugas;

public class Keyboard {
    String brand;
    String type;

    void typeText() {
        System.out.println("Keyboard digunakan untuk mengetik.");
    }

    void pressKey() {
        System.out.println("Tombol keyboard ditekan.");
    }

    void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Tipe: " + type);
    }
}