public class Mobil {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanKontak() {
        kontakOn = true;
        System.out.println("Kontak ON");
    }

    public void matikanKontak() {
        kontakOn = false;
        System.out.println("Kontak OFF");
    }

    public void tambahKecepatan(int nilai) {
        if (kontakOn) {
            kecepatan += nilai;
            System.out.println("Kecepatan bertambah menjadi: " + kecepatan);
        } else {
            System.out.println("Tidak bisa menambah kecepatan karena kontak OFF.");
        }
    }

    public void kurangiKecepatan(int nilai) {
        if (!kontakOn) {
            kecepatan -= nilai;

            if (kecepatan < 0) {
                kecepatan = 0;
            }

            System.out.println("Kecepatan berkurang menjadi: " + kecepatan);
        } else {
            System.out.println("Tidak bisa mengurangi kecepatan karena kontak ON.");
        }
    }

    public void tampilkanStatus() {
        if (kontakOn) {
            System.out.println("Kontak ON");
        } else {
            System.out.println("Kontak OFF");
        }

        System.out.println("Kecepatan: " + kecepatan);
        System.out.println();
    }
}