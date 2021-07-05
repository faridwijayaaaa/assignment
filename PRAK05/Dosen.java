package PRAK05;

public class Dosen {
    private String kode, nama;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak() {
        System.out.println(getKode() + " : " + getNama());
    }

    public Dosen(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

}
