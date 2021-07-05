package PRAK06;

import java.time.LocalDate;
import java.time.Period;

public class Mahasiswa {
    private String npm, nama, gender, alamat, tempatLahir;
    private LocalDate tanggalLahir;

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public int getUmur() {
        LocalDate hariIni = LocalDate.now();
        return Period.between(tanggalLahir, hariIni).getYears();
    }

    public void cetak() {
        System.out.println("NPM             : " + getNpm());
        System.out.println("Nama            : " + getNama());
        System.out.println("Jenis Kelamin   : " + getGender());
        System.out.println("Alamat          : " + getAlamat());
        System.out.println("Tempat Lahir    : " + getTempatLahir());
        System.out.println("Tanggal Lahir   : " + getTanggalLahir());
    }

    public Mahasiswa(String npm, String nama, String gender, String alamat, String tempatLahir,
            LocalDate tanggalLahir) {
        this.npm = npm;
        this.nama = nama;
        this.gender = gender;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
    }
}