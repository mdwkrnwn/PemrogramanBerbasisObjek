package P2.Tugas02;

/**
 * TransaksiPeminjaman
 */
public class TransaksiPeminjaman {
    public String idTransaksi;
    public String namaPeminjam;
    public String judulBuku;
    public int jumlahHariKeterlambatan;

    public int hitungDenda() {
        return jumlahHariKeterlambatan * 1000;
    }

    public void tampilData() {
        System.out.println("ID Transaksi              : " + idTransaksi);
        System.out.println("Nama Peminjam             : " + namaPeminjam);
        System.out.println("Judul Buku                : " + judulBuku);
        System.out.println("Jumlah Hari Keterlambatan : "
                + jumlahHariKeterlambatan + " hari");
        System.out.println("Denda                     : Rp" + hitungDenda());
        System.out.println();
    }
}