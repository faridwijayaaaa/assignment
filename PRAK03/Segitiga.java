package ALPRO2.PBO;

public class Segitiga {
	private Koordinat titikA;
	private Koordinat titikB;
	private Koordinat titikC;
	private Garis g1, g2, g3;

	// GETTER
	public Koordinat getTitikA() {
		return titikA;
	}

	public Koordinat getTitikB() {
		return titikB;
	}

	public Koordinat getTitikC() {
		return titikC;
	}

	// SETTER
	public void setTitikA(Koordinat titikA) {
		this.titikA = titikA;
	}

	public void setTitikB(Koordinat titikB) {
		this.titikB = titikB;
	}

	public void setTitikC(Koordinat titikC) {
		this.titikC = titikC;
	}

	// CONSTRUCTOR
	public Segitiga(Koordinat titikA, Koordinat titikB, Koordinat titikC) {
		setTitikA(titikA);
		setTitikB(titikB);
		setTitikC(titikC);
		g1 = new Garis(titikA, titikB);
		g2 = new Garis(titikB, titikC);
		g3 = new Garis(titikA, titikC);
	}

	// METHOD LUAS SEGITIGA
	public double getLuasSegitiga() {
		double s = (g1.getPanjang() + g2.getPanjang() + g3.getPanjang()) / 2;
		double L = Math.pow(s * (s - g1.getPanjang()) * (s - g2.getPanjang()) * (s - g3.getPanjang()), (0.5));
		return L;
	}
}
