package ALPRO2.PBO;

public class BangunDatar {
	private void cetak(double hasil) {
		System.out.println("Hasil : " + hasil);
	}

	public BangunDatar() {
		System.out.println("\nSegi Empat Gambar 1 :");
		Koordinat a = new Koordinat(7, 5), b = new Koordinat(9, 3), c = new Koordinat(5, 1), d = new Koordinat(4, 4);
		SegiEmpat seC = new SegiEmpat(a, b, c, d);
		cetak(seC.getLuas());

		System.out.println("\n3 Segi Empat Beraturan :");
		// Persegi Panjang
		Koordinat a1 = new Koordinat(2, 4), b1 = new Koordinat(6, 4), c1 = new Koordinat(6, -1),
				d1 = new Koordinat(2, -1);
		SegiEmpat sE1 = new SegiEmpat(a1, b1, c1, d1);
		cetak(sE1.getLuas());

		// Layang - Layang
		Koordinat a2 = new Koordinat(3, 3), b2 = new Koordinat(1, 1), c2 = new Koordinat(3, -2),
				d2 = new Koordinat(5, 1);
		SegiEmpat sE2 = new SegiEmpat(a2, b2, c2, d2);
		cetak(sE2.getLuas());

		// Trapesium
		Koordinat a3 = new Koordinat(-5, 4), b3 = new Koordinat(1, 4), c3 = new Koordinat(0, 7),
				d3 = new Koordinat(-3, 7);
		SegiEmpat sE3 = new SegiEmpat(a3, b3, c3, d3);
		cetak(sE3.getLuas());

		System.out.println("\n3 Segi Empat tak Beraturan :");
		Koordinat a4 = new Koordinat(6, 4), b4 = new Koordinat(7, 4), c4 = new Koordinat(3, -1),
				d4 = new Koordinat(2, 2);
		SegiEmpat sE4 = new SegiEmpat(a4, b4, c4, d4);
		cetak(sE4.getLuas());

		Koordinat a5 = new Koordinat(5, 1), b5 = new Koordinat(6, 3), c5 = new Koordinat(7, 2),
				d5 = new Koordinat(5, 4);
		SegiEmpat sE5 = new SegiEmpat(a5, b5, c5, d5);
		cetak(sE5.getLuas());

		Koordinat a6 = new Koordinat(9, 4), b6 = new Koordinat(8, 2), c6 = new Koordinat(2, 5),
				d6 = new Koordinat(3, 7);
		SegiEmpat sE6 = new SegiEmpat(a6, b6, c6, d6);
		cetak(sE6.getLuas());

		System.out.println("\nSegi Lima Gambar 2 :");
		Koordinat slA = new Koordinat(7, 5), slB = new Koordinat(9, 3), slC = new Koordinat(8, 1),
				slD = new Koordinat(5, 1), slE = new Koordinat(4, 4);
		SegiLima slG = new SegiLima(slA, slB, slC, slD, slE);
		cetak(slG.getLuas());

		System.out.println("\n3 Segi Lima Beraturan :");
		Koordinat slA1 = new Koordinat(2, 4), slB1 = new Koordinat(6, 4), slC1 = new Koordinat(4, 4),
				slD1 = new Koordinat(6, -1), slE1 = new Koordinat(2, -1);
		SegiLima sl1 = new SegiLima(slA1, slB1, slC1, slD1, slE1);
		cetak(sl1.getLuas());

		Koordinat slA2 = new Koordinat(3, 3), slB2 = new Koordinat(1, 1), slC2 = new Koordinat(2, 2),
				slD2 = new Koordinat(3, -2), slE2 = new Koordinat(5, 1);
		SegiLima sl2 = new SegiLima(slA2, slB2, slC2, slD2, slE2);
		cetak(sl2.getLuas());

		Koordinat slA3 = new Koordinat(-5, 4), slB3 = new Koordinat(1, 4), slC3 = new Koordinat(2, 4),
				slD3 = new Koordinat(0, 7), slE3 = new Koordinat(-3, 7);
		SegiLima sl3 = new SegiLima(slA3, slB3, slC3, slD3, slE3);
		cetak(sl3.getLuas());

		System.out.println("\nSegi Lima tak Beraturan :");
		Koordinat slA4 = new Koordinat(6, 5), slB4 = new Koordinat(8, 3), slC4 = new Koordinat(8, 3),
				slD4 = new Koordinat(5, 2), slE4 = new Koordinat(2, 2);
		SegiLima sl4 = new SegiLima(slA4, slB4, slC4, slD4, slE4);
		cetak(sl4.getLuas());

		Koordinat slA5 = new Koordinat(2, 4), slB5 = new Koordinat(4, 3), slC5 = new Koordinat(6, 3),
				slD5 = new Koordinat(5, 5), slE5 = new Koordinat(4, 2);
		SegiLima sl5 = new SegiLima(slA5, slB5, slC5, slD5, slE5);
		cetak(sl5.getLuas());

		Koordinat slA6 = new Koordinat(4, 5), slB6 = new Koordinat(8, -3), slC6 = new Koordinat(2, 3),
				slD6 = new Koordinat(5, -2), slE6 = new Koordinat(1, 4);
		SegiLima sl6 = new SegiLima(slA6, slB6, slC6, slD6, slE6);
		cetak(sl6.getLuas());
	}

	public static void main(String[] args) {
		new BangunDatar();
	}

}
