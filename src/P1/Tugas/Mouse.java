package P1.Tugas;

public class Mouse {
    String brand;
    int dpi;

    void moveCursor() {
        System.out.println("Cursor digerakkan.");
    }

    void click() {
        System.out.println("Mouse diklik.");
    }

    void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("DPI: " + dpi);
    }
}