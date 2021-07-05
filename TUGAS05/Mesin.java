package TUGAS05;

import java.time.Duration;

public class Mesin {
    private String nama;
    private int roti, biayaProduksi;
    private Duration durasi, pemanasanAwal, jedaProduksi;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getRoti() {
        return roti;
    }

    public void setRoti(int roti) {
        this.roti = roti;
    }

    public int getBiayaProduksi() {
        return biayaProduksi;
    }

    public void setBiayaProduksi(int biayaProduksi) {
        this.biayaProduksi = biayaProduksi;
    }

    public Duration getDurasi() {
        return durasi;
    }

    public void setDurasi(Duration durasi) {
        this.durasi = durasi;
    }

    public Duration getPemanasanAwal() {
        return pemanasanAwal;
    }

    public void setPemanasanAwal(Duration pemanasanAwal) {
        this.pemanasanAwal = pemanasanAwal;
    }

    public Duration getJedaProduksi() {
        return jedaProduksi;
    }

    public void setJedaProduksi(Duration jedaProduksi) {
        this.jedaProduksi = jedaProduksi;
    }

    public Mesin(String nama, int roti, Duration durasi, Duration pemanasanAwal, Duration jedaProduksi,
            int biayaProduksi) {
        this.nama = nama;
        this.roti = roti;
        this.durasi = durasi;
        this.pemanasanAwal = pemanasanAwal;
        this.jedaProduksi = jedaProduksi;
        this.biayaProduksi = biayaProduksi;
    }
}
