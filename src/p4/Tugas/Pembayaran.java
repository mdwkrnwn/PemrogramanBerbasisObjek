package P4.Tugas;

public class Pembayaran {
    private String metode;
    private double jumlah;

    public Pembayaran(String metode, double jumlah) {
        this.metode = metode;
        this.jumlah = jumlah;
    }

    public void prosesBayar() {
        System.out.println("Metode Pembayaran : " + metode);
        System.out.println("Jumlah Pembayaran : Rp" + jumlah);
        System.out.println("Pembayaran berhasil.");
    }
}