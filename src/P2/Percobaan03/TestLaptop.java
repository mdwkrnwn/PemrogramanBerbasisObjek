package P2.Percobaan03;

public class TestLaptop {
    public static void main(String[] args) {
        Laptop lab1 = new Laptop();
        lab1.kodeInventaris ="LAB-JTI-017";
        lab1.merk ="Lenovo Thinkpad E14";
        lab1.ramGB = 8 ;
        lab1.tampilSpesifikasi();
        
        System.out.println("RAM setelah upgrade : " + lab1.upgradeRam(8) + " GB");

        int hargaSewa = lab1.hitungHargaSewa(3);
        System.out.println("Harga sewa: Rp" + hargaSewa);
    }
}
