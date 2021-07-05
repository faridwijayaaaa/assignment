package PRAK05;

public class MK_Informatika {
    public MataKuliah[] matKul = new MataKuliah[9];

    public MK_Informatika() {
        matKul[0] = new MataKuliah("K001", "Inovasi Teknologi", 2);
        matKul[1] = new MataKuliah("K002", "Algoritma Pemrograman II", 3);
        matKul[2] = new MataKuliah("K003", "Aljabar Linear", 4);
        matKul[3] = new MataKuliah("K004", "Sistem Operasi", 2);
        matKul[4] = new MataKuliah("K005", "Arsitektur dan Organisasi Komputer", 2);
        matKul[5] = new MataKuliah("K006", "Basis Data ", 2);
        matKul[6] = new MataKuliah("K007", "Praktikum Algoritma Pemrograman II", 2);
        matKul[7] = new MataKuliah("K008", "Praktikum Basis Data I", 2);
        matKul[8] = new MataKuliah("K009", "Pendidikan Agama", 2);
    }

    public String getMatKul(String kode) {
        return kode;
    }

    public int getMatKulKe(int i) {
        return i - 1;
    }

    public void cetak() {
        for (int i = 0; i < matKul.length; i++) {
            System.out.print("Mata Kuliah ke - " + (i + 1) + " : ");
            matKul[i].cetak();
        }
    }
}
