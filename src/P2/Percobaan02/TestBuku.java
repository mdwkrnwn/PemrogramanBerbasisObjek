package P2.Percobaan02;

public class TestBuku {
    public static void main(String[] args) {

        Buku buku1 = new Buku();
        buku1.isbn = "978-979-29-6104-2";
        buku1.judul = "Dasar Pemrograman Berbasis Objek";
        buku1.penulis = "Abdul Kadir";
        // buku1.penerbit = "Andi Offset";
        buku1.tahunTerbit = 2021;

        Buku buku2 = new Buku();
        buku2.isbn = "978-979-000-000-1";
        buku2.judul = "Pemrograman Java";
        buku2.penulis = "Budi";
        buku2.penerbit = "Informatika";
        buku2.tahunTerbit = 2022;

        Buku buku3 = new Buku();
        buku3.isbn = "978-979-000-000-2";
        buku3.judul = "Belajar Pemrograman Berorientasi Objek";
        buku3.penulis = "Andi";
        buku3.penerbit = "Elex Media";
        buku3.tahunTerbit = 2023;

        buku1.tampillBuku();
        buku2.tampillBuku();
        buku3.tampillBuku();
    }
}
