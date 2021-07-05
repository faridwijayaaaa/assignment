package PRAK05;

import java.time.LocalTime;

public class WaktuUNPKediri {
    public WaktuKuliah[] waktu = new WaktuKuliah[15];
    int kode = 1;
    int tmp = kode - 1;
    LocalTime mulai, selesai;

    public WaktuUNPKediri() {
        int n = 1, x = 5, y = 50;
        for (LocalTime mulai = LocalTime.of(7, 0); mulai.isBefore(LocalTime.of(21, 25)); n++) {
            selesai = mulai.plusMinutes(50);
            if (n % 6 == 1 && n > 1) {
                mulai = mulai.minusMinutes(x);
                // System.out.println(i + " - " + i.plusMinutes(y) + " ; Istirahat ");
                mulai = mulai.plusMinutes(y);
                x = x - 5;
                y = y - 10;
                continue;
            } else if ((kode % 2 == 0 && n < 13) || n == 15) {
                // System.out.println(i + " - " + i.plusMinutes(50));
                waktu[tmp] = new WaktuKuliah((tmp + 1), mulai, selesai);
                mulai = mulai.plusMinutes(55);
                kode += 1;
            } else {
                // System.out.println(i + " - " + i.plusMinutes(50));
                waktu[tmp] = new WaktuKuliah((tmp + 1), mulai, selesai);
                mulai = mulai.plusMinutes(50);
                kode += 1;
            }
            selesai = mulai;
            tmp++;
        }
    }

    public int getWaktuKe(int i) {
        return i - 1;
    }

    public void cetak(int kode, int sks) {
        // System.out.println(waktu[kode] + " - " + waktu[kode + sks]);
        waktu[getWaktuKe(kode)] = new WaktuKuliah(kode, waktu[getWaktuKe(kode)].getMulai(),
                waktu[getWaktuKe(kode)].getMulai().plusMinutes(50 * sks));
        waktu[getWaktuKe(kode)].cetak();
    }

    public void cetakSemua() {
        for (int i = 0; i < waktu.length; i++) {
            waktu[i].cetak();
        }
    }

    public static void main(String[] args) {
        new WaktuUNPKediri().cetak(7, 3);
    }
}