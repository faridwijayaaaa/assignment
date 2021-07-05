package PRAK05;

import java.time.LocalTime;

public class WaktuKuliah {
    private LocalTime mulai, selesai;
    private int kode;

    public LocalTime getMulai() {
        return mulai;
    }

    public void setMulai(LocalTime mulai) {
        this.mulai = mulai;
    }

    public LocalTime getSelesai() {
        return selesai;
    }

    public void setSelesai(LocalTime selesai) {
        this.selesai = selesai;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public void cetak() {
        System.out.println(getKode() + " : " + getMulai() + " - " + getSelesai());
    }

    public WaktuKuliah(int kode, LocalTime mulai, LocalTime selesai) {
        this.kode = kode;
        this.mulai = mulai;
        this.selesai = selesai;
    }
}
