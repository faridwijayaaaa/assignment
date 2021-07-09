package ALPRO2.PBO;

public class Garis {
    // Atribut
    private Koordinat titikAwal;
    private Koordinat titikAkhir;

    // Atribute Setter & Getter
    public Koordinat getTitikAwal() {
        return titikAwal;
    }

    public void setTitikAwal(Koordinat titikAwal) {
        this.titikAwal = titikAwal;
    }

    public Koordinat getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAkhir(Koordinat titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Constuctor
    public Garis(Koordinat titikAwal, Koordinat titikAkhir) {
        setTitikAwal(titikAwal);
        setTitikAkhir(titikAkhir);
    }

    public double getPanjang() {
        double panjang = Math.sqrt(Math.pow((titikAwal.getX_value() - titikAkhir.getX_value()), 2)
                + Math.pow(titikAwal.getY_value() - titikAkhir.getY_value(), 2));
        return panjang;
    }
}
