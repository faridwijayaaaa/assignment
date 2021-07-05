package PRAK05;

public class jadwalAtom {
    private MataKuliah mk;
    private Dosen pengampu;
    private String kelas, hari;
    private WaktuKuliah start;

    public MataKuliah getMk() {
        return mk;
    }

    public void setMk(MataKuliah mk) {
        this.mk = mk;
    }

    public Dosen getPengampu() {
        return pengampu;
    }

    public void setPengampu(Dosen pengampu) {
        this.pengampu = pengampu;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public WaktuKuliah getStart() {
        return start;
    }

    public void setStart(WaktuKuliah start) {
        this.start = start;
    }

    public void cetak() {
        System.out.println("MatKul : " + getMk().getNama() + "  , Dosen :  " + getPengampu().getNama() + " , Kelas : "
                + getKelas() + " , Hari : " + getHari() + " , Waktu Kuliah : " + getStart().getMulai() + " - "
                + getStart().getSelesai());
    }

    public jadwalAtom(MataKuliah mk, Dosen pengampu, String kelas, String hari, WaktuKuliah start) {
        this.mk = mk;
        this.pengampu = pengampu;
        this.kelas = kelas;
        this.hari = hari;
        this.start = start;
    }

}
