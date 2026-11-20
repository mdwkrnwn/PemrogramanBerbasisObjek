package P6.Tugas;

public class Percobaan5 {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen(
            "001",
            "Budi Santoso",
            "Malang"
        );

        Dosen dosen2 = new Dosen(
            "002",
            "Andi Wijaya",
            "Malang"
        );

        dosen1.setSKS(12);
        dosen2.setSKS(16);

        DaftarGaji daftar = new DaftarGaji();

        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);

        daftar.printSemuaGaji();
    }
}