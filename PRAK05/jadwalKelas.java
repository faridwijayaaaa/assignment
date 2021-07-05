package PRAK05;

import java.util.Arrays;

public class jadwalKelas {
    public jadwalAtom[] jadwal = new jadwalAtom[1];

    public int cariJadwal(String masukan) {
        int pos = -1;
        for (int i = 0; i < jadwal.length - 1; i++) {
            if (jadwal[i + 1].getMk().getKode().equals(masukan) || jadwal[i + 1].getHari().equals(masukan)) {
                pos = i + 1;
                break;
            }
        }
        return pos;
    }

    public void inputJadwal(jadwalAtom baru) {
        int idx, ukuran;
        idx = jadwal.length;
        ukuran = idx + 1;
        jadwal = Arrays.copyOf(jadwal, ukuran);
        jadwal[idx] = baru;
    }

    public void hapusJadwal(int idx) {
        for (int i = idx; i < jadwal.length - 1; i++) {
            jadwal[i] = jadwal[i + 1];
            jadwal = Arrays.copyOf(jadwal, jadwal.length - 1);
        }
    }

    public void cetakJadwal() {
        System.out.println("Cetak Jadwal : ");
        for (int i = 0; i < jadwal.length - 1; i++) {
            System.out.print((i + 1) + " : ");
            jadwal[i + 1].cetak();
            System.out.println();
        }
    }

}
