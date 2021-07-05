package PRAK05.uji;

import java.time.LocalTime;

public class waktuPerkuliahan {
    public void pembagianWaktu() {
        LocalTime mulai, akhir;
        mulai = LocalTime.of(7, 0);
        akhir = LocalTime.of(21, 25);
        int a = 1, n = 1;
        for (int i = 1; mulai.compareTo(akhir) < 0; i++) {
            LocalTime waktu = mulai.plusMinutes(50);
            if (i == 7) {
                System.out.println(mulai + " - " + waktu + " ; Istirahat ke - " + a);
                mulai = mulai.minusMinutes(5);
                waktu = waktu.minusMinutes(5);
                a++;
            } else if (i == 13) {
                waktu = waktu.minusMinutes(10);
                System.out.println(mulai + " - " + waktu + " ; Istirahat ke - " + a);
                a++;
            } else if (i == 15) {
                System.out.println(mulai + " - " + waktu + " ; Waktu ke - " + n);
                mulai = mulai.plusMinutes(5);
                waktu = waktu.plusMinutes(5);
                n++;
            } else if (n % 2 == 1 && n > 2 && n < 15) {
                mulai = mulai.plusMinutes(5);
                waktu = waktu.plusMinutes(5);
                System.out.println(mulai + " - " + waktu + " ; Waktu ke - " + n);
                n++;
            } else {
                System.out.println(mulai + " - " + waktu + " ; Waktu ke - " + n);
                n++;
            }
            mulai = waktu;
        }
    }

    public static void main(String[] args) {
        new waktuPerkuliahan().pembagianWaktu();
    }
}
