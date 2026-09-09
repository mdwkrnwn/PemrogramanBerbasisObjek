package P2.Tugas03;

/**
 * TestRuangKelas
 */
public class TestRuangKelas {

    public static void main(String[] args) {

        RuangKelas ruang1 = new RuangKelas();

        ruang1.kodeRuang = "RK-01";
        ruang1.namaGedung = "Gedung A";
        ruang1.kapasitas = 40;
        ruang1.jumlahMahasiswa = 32;

        System.out.println("=== DATA RUANG KELAS ===");
        ruang1.tampilData();
    }
}