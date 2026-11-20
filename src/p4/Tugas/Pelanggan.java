package P4.Tugas;

public class Pelanggan {
    private String nama;
    private String noTelepon;

    public Pelanggan(String nama, String noTelepon) {
        this.nama = nama;
        this.noTelepon = noTelepon;
    }

    // DEPENDENCY
    public void buatPenyewaan(
            String tanggal,
            int lamaSewa,
            Kendaraan kendaraan) {

        Penyewaan penyewaan =
            new Penyewaan(tanggal, lamaSewa, kendaraan);

        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("No. Telepon    : " + noTelepon);
        System.out.println();

        penyewaan.tampilkanInfo();
    }
}