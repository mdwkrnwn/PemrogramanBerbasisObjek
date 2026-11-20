package P4.Tugas;

public class Kendaraan {
    private String merk;
    private String nomorPlat;
    private double hargaPerHari;

    public Kendaraan(String merk, String nomorPlat, double hargaPerHari) {
        this.merk = merk;
        this.nomorPlat = nomorPlat;
        this.hargaPerHari = hargaPerHari;
    }

    public double getHargaPerHari() {
        return hargaPerHari;
    }

    public void tampilkanInfo() {
        System.out.println("Merk        : " + merk);
        System.out.println("Nomor Plat  : " + nomorPlat);
        System.out.println("Harga/Hari  : Rp" + hargaPerHari);
    }
}