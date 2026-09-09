public class TestMobil {
    public static void main(String[] args) {

        Mobil mbl = new Mobil();

        mbl.tampilkanStatus();

        mbl.tambahKecepatan(100);

        mbl.nyalakanKontak();

        mbl.tambahKecepatan(100);
        
        mbl.kurangiKecepatan(50);

        mbl.matikanKontak();

        mbl.tambahKecepatan(50);

        mbl.kurangiKecepatan(50);

        mbl.tampilkanStatus();
    }
}