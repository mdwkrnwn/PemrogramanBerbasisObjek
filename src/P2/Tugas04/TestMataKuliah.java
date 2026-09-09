package P2.Tugas04;

/**
 * TestMataKuliah
 */
public class TestMataKuliah {

    public static void main(String[] args) {

        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "RTI253001";
        mk1.namaMK = "Pemrograman Berbasis Objek";
        mk1.sks = 3;
        mk1.nilaiAngka = 3.75;

        MataKuliah mk2 = new MataKuliah();
        mk2.kodeMK = "RTI253002";
        mk2.namaMK = "Basis Data";
        mk2.sks = 3;
        mk2.nilaiAngka = 3.50;

        MataKuliah mk3 = new MataKuliah();
        mk3.kodeMK = "RTI253003";
        mk3.namaMK = "Matematika Diskrit";
        mk3.sks = 2;
        mk3.nilaiAngka = 3.00;

        System.out.println("=== DATA MATA KULIAH ===");
        System.out.println();

        mk1.tampilData();
        System.out.println();

        mk2.tampilData();
        System.out.println();

        mk3.tampilData();
        System.out.println();

        double totalBobot = mk1.hitungBobotNilai()
                + mk2.hitungBobotNilai()
                + mk3.hitungBobotNilai();

        System.out.println("Total Bobot Nilai : " + totalBobot);
    }
}