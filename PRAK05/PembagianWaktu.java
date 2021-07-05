package PRAK05;

// Nama     : Bella Nurbuana Tri Cahya Ningrum
// Kelas    : 1 A
// NPM      : 2013020084

import java.time.LocalTime;

public class PembagianWaktu {

    public void waktu() {
        LocalTime masuk, pulang;
        masuk = LocalTime.of(7, 0);
        pulang = LocalTime.of(21, 25);
        int a = 1, n = 1, x = 5, y = 50;
        for (int i = 1; masuk.compareTo(pulang) < 0; i++) {
            if (i % 6 == 1 && i > 1) { // I S T I R A H A T
                masuk = masuk.minusMinutes(x);
                System.out.println(masuk + " - " + masuk.plusMinutes(y) + " ; Istirahat ke - " + a);
                masuk = masuk.plusMinutes(y);
                a++;
                x = x - 5;
                y = y - 10;
            } else if ((n % 2 == 0 && n < 12) || n == 13) { // J E D A W A K T U
                System.out.println(masuk + " - " + masuk.plusMinutes(50) + " ; Waktu ke - " + (n));
                masuk = masuk.plusMinutes(55);
                n++;
            } else {
                System.out.println(masuk + " - " + masuk.plusMinutes(50) + " ; Waktu ke - " + (n));
                masuk = masuk.plusMinutes(50);
                n++;
            }
        }
    }

    public static void main(String[] args) {
        new PembagianWaktu().waktu();
    }
}
