package PRAK05.uji;

import java.time.Duration;
import java.time.LocalTime;

import PRAK05.WaktuKuliah;

public class coba {
    WaktuKuliah[] waktu = new WaktuKuliah[15];

    public WaktuKuliah[] coba() {
        LocalTime mulai, selesai;
        Duration D = Duration.ofMinutes(50);
        Duration Jeda = Duration.ofMinutes(5);
        mulai = LocalTime.of(7, 0);
        selesai = LocalTime.of(21, 25);
        waktu = new WaktuKuliah[15];
        int a = 1, kode = 1, x = 5, y = 50;
        int tmp = kode;
        for (int n = 1; mulai.isBefore(selesai); n++) {
            if (n % 6 == 1 && n > 1) {
                mulai = mulai.minusMinutes(x);
                mulai = mulai.plusMinutes(y);
                x -= 5;
                y -= 10;
                continue;
            } else if (kode % 2 == 0 && n < 13 || n == 15) {
                waktu[tmp] = new WaktuKuliah(kode, mulai, mulai.plus(D));
                // System.out.println(kode + ". " + mulai + "-" + mulai.plus(D));
                mulai = mulai.plus(D);
                mulai = mulai.plus(Jeda);
                kode++;
            } else {
                waktu[tmp] = new WaktuKuliah(kode, mulai, mulai.plus(D));
                // System.out.println(kode + ". " + mulai + "-" + mulai.plus(D));
                mulai = mulai.plus(D);
                kode++;
            }
        }
        return waktu;
    }

    public void cetakSemua() {
        for (int i = 1; i < waktu.length; i++) {
            waktu[i].cetak();
        }
    }

    public static void main(String[] args) {
        new coba().cetakSemua();
    }
}
