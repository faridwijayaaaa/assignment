package ALPRO2.PBO;

public class SegiEmpat {
    private Koordinat titikA, titikB, titikC, titikD;
    private Segitiga s1, s2;

    public Koordinat getTitikA() {
        return titikA;
    }

    public void setTitikA(Koordinat titikA) {
        this.titikA = titikA;
    }

    public Koordinat getTitikB() {
        return titikB;
    }

    public void setTitikB(Koordinat titikB) {
        this.titikB = titikB;
    }

    public Koordinat getTitikC() {
        return titikC;
    }

    public void setTitikC(Koordinat titikC) {
        this.titikC = titikC;
    }

    public Koordinat getTitikD() {
        return titikD;
    }

    public void setTitikD(Koordinat titikD) {
        this.titikD = titikD;
    }

    public SegiEmpat(Koordinat titikA, Koordinat titikB, Koordinat titikC, Koordinat titikD) {
        setTitikA(titikA);
        setTitikB(titikB);
        setTitikC(titikC);
        setTitikD(titikD);
        s1 = new Segitiga(titikA, titikB, titikC);
        s2 = new Segitiga(titikA, titikC, titikD);
    }

    public double getLuas() {
        double L = s1.getLuasSegitiga() + s2.getLuasSegitiga();
        return L;
    }
}
