package P3.Tugas;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat muatan yang akan dimasukkan (kg): ");
        double beratMasuk = s.nextDouble();

        System.out.println("Memasukkan muatan baru seberat "
                + beratMasuk + " kg...");

        kontainerAlfa.tambahMuatan(beratMasuk);

        System.out.println("Berat muatan saat ini: "
                + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang akan dimasukkan (kg): ");
        beratMasuk = s.nextDouble();

        System.out.println("Memasukkan muatan baru seberat "
                + beratMasuk + " kg...");

        kontainerAlfa.tambahMuatan(beratMasuk);

        System.out.println("Berat muatan saat ini: "
                + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang akan dibongkar (kg): ");
        double beratKeluar = s.nextDouble();

        System.out.println("Membongkar muat/menurunkan barang seberat "
                + beratKeluar + " kg...");

        kontainerAlfa.turunkanMuatan(beratKeluar);

        System.out.println("Berat muatan saat ini: "
                + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang akan dibongkar (kg): ");
        beratKeluar = s.nextDouble();

        System.out.println("Membongkar muat/menurunkan barang seberat "
                + beratKeluar + " kg...");

        kontainerAlfa.turunkanMuatan(beratKeluar);

        System.out.println("Berat muatan saat ini: "
                + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        s.close();
    }
}
