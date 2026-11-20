package P6.Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;

    public DaftarGaji() {
        listPegawai = new Pegawai[10];
    }

    public void addPegawai(Pegawai pegawai) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                listPegawai[i] = pegawai;
                break;
            }
        }
    }

    public void printSemuaGaji() {
        for (Pegawai pegawai : listPegawai) {
            if (pegawai != null) {
                System.out.println(
                    "Nama: " + pegawai.getNama() +
                    ", Gaji: Rp" + pegawai.getGaji()
                );
            }
        }
    }
}