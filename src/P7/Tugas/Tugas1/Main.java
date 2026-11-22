package P7.Tugas.Tugas1;

class Segitiga {
    int sudut;

    int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    double keliling(int sisiA, int sisiB) {
        return Math.sqrt(
                Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }
}

public class Main {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println(s.totalSudut(60));
        System.out.println(s.totalSudut(60, 70));
        System.out.println(s.keliling(3, 4, 5));
        System.out.println(s.keliling(3, 4));
    }
}
