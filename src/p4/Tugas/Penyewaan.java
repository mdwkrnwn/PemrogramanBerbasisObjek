package P4.Tugas;

public class Penyewaan {
    private String tanggal;
    private int lamaSewa;

    
    // AGGREGATION
    private Kendaraan kendaraan;
    // COMPOSITION
    private Pembayaran pembayaran;

    public Penyewaan(String tanggal, int lamaSewa, Kendaraan kendaraan) {
        this.tanggal = tanggal;
        this.lamaSewa = lamaSewa;
        // Aggregation
        this.kendaraan = kendaraan;
        // Composition
        this.pembayaran = new Pembayaran(
            "Transfer",
            hitungTotal()
        );
    }

    public double hitungTotal() {
        return kendaraan.getHargaPerHari() * lamaSewa;
    }

    public void tampilkanInfo() {
        System.out.println("=== DATA PENYEWAAN ===");
        System.out.println("Tanggal     : " + tanggal);
        System.out.println("Lama Sewa   : " + lamaSewa + " hari");

        System.out.println("\nKendaraan:");
        kendaraan.tampilkanInfo();

        System.out.println("\nTotal Biaya : Rp" + hitungTotal());

        System.out.println("\nPembayaran:");
        pembayaran.prosesBayar();
    }
}