package P4.Tugas;

public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Toyota Avanza", "N 1234 AB", 350000);
        Pelanggan pelanggan = new Pelanggan("Dwi Kurniawan", "08123456789");
        pelanggan.buatPenyewaan(
                "24 September 2026",
                3,
                kendaraan);
    }
}
