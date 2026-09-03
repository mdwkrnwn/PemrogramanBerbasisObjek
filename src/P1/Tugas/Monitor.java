package P1.Tugas;

public class Monitor extends Perangkat {

    double screenSize;
    String resolution;

    void displayImage() {
        System.out.println("Monitor menampilkan gambar");
    }

    void adjustBrightness() {
        System.out.println("Kecerahan monitor diatur");
    }

    @Override
    void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Ukuran layar: " + screenSize + " inch");
        System.out.println("Resolusi: " + resolution);
    }
}