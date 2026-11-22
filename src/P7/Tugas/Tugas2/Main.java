package P7.Tugas.Tugas2;
class Manusia {
    public void bernafas() {
        System.out.println("Manusia bernapas");
    }

    public void makan() {
        System.out.println("Manusia makan");
    }
}

class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen sedang makan");
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur");
    }
}

class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur");
    }
}

public class Main {
    public static void main(String[] args) {
        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();

        m1.bernafas();
        m1.makan();

        m2.bernafas();
        m2.makan();
    }
}