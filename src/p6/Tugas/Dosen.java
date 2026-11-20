package P6.Tugas;

public class Dosen extends Pegawai {
    protected int jumlahSKS;
    protected int TARIFF_SKS = 50000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public int getGaji() {
        return jumlahSKS * TARIFF_SKS;
    }
}