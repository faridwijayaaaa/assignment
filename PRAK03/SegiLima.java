package ALPRO2.PBO;

public class SegiLima {
    private Koordinat titikA, titikB, titikC, titikD, titikE;
    private SegiEmpat se;
    private Segitiga s;

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

    public Koordinat getTitikE() {
        return titikE;
    }

    public void setTitikE(Koordinat titikE) {
        this.titikE = titikE;
    }

    public SegiLima(Koordinat titikA, Koordinat titikB, Koordinat titikC, Koordinat titikD, Koordinat titikE) {
        setTitikA(titikA);
        setTitikB(titikB);
        setTitikC(titikC);
        setTitikD(titikD);
        setTitikE(titikE);
        se = new SegiEmpat(titikA, titikC, titikD, titikE);
        s = new Segitiga(titikA, titikB, titikC);
    }

    public double getLuas() {
        double L = s.getLuasSegitiga() + se.getLuas();
        return L;
    }
}
