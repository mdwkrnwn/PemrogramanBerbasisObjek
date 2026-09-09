package P2.Tugas02;

/**
 * TestTransaksiPeminjaman
 */
public class TestTransaksiPeminjaman {
    public static void main(String[] args) {

        TransaksiPeminjaman transaksi1 = new TransaksiPeminjaman();
        transaksi1.idTransaksi = "TRX001";
        transaksi1.namaPeminjam = "Dwi Kurniawan";
        transaksi1.judulBuku = "Dasar Pemrograman Java";
        transaksi1.jumlahHariKeterlambatan = 0;

        TransaksiPeminjaman transaksi2 = new TransaksiPeminjaman();
        transaksi2.idTransaksi = "TRX002";
        transaksi2.namaPeminjam = "Andi Pratama";
        transaksi2.judulBuku = "Pemrograman Berbasis Objek";
        transaksi2.jumlahHariKeterlambatan = 3;

        TransaksiPeminjaman transaksi3 = new TransaksiPeminjaman();
        transaksi3.idTransaksi = "TRX003";
        transaksi3.namaPeminjam = "Budi Santoso";
        transaksi3.judulBuku = "Struktur Data";
        transaksi3.jumlahHariKeterlambatan = 10;

        System.out.println("=== DATA TRANSAKSI PEMINJAMAN ===");
        System.out.println();

        transaksi1.tampilData();
        transaksi2.tampilData();
        transaksi3.tampilData();
    }
}