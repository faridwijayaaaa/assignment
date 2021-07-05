package PRAK05;

public class DosenInformatika {
    public Dosen[] dosenku = new Dosen[7];

    public DosenInformatika() {
        dosenku[0] = new Dosen("D001", "Intan Nur Farida");
        dosenku[1] = new Dosen("D002", "Daniel Swanjaya");
        dosenku[2] = new Dosen("D003", "Niska Shofia");
        dosenku[3] = new Dosen("D004", "Muhammad Najibulloh Muzaki");
        dosenku[4] = new Dosen("D005", "Risa Helilintar");
        dosenku[5] = new Dosen("D006", "Risky Aswi Ramadhani");
        dosenku[6] = new Dosen("D007", "Ridwan");
    }

    public int getDosenKuKe(int i) {
        return i - 1;
    }

    public String getDosenKu(String kode) {
        return kode;
    }

    public void cetak() {
        for (int i = 0; i < dosenku.length; i++) {
            System.out.print("Dosen ke - " + (i + 1) + " : ");
            dosenku[i].cetak();
        }
    }
}
