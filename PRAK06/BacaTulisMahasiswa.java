package PRAK06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.StringJoiner;

public class BacaTulisMahasiswa {
    private BacaBerkas01 bacaBerkas;

    private void bacaFileIni() {
        String fileIni = "D://K U L I A H/ALPRO 2/Materi Project/Project Latihan/PRAK06/DATA.txt";
        bacaBerkas = new BacaBerkas01(fileIni);

        if (!bacaBerkas.isSts()) {
            System.out.println("File DATA.txt gagal dimuat.");
            System.exit(0);
        }
    }

    public ArrayList<Mahasiswa> simpanKeArray() {
        ArrayList<String> tmp1 = bacaBerkas.BacaKonten03();
        ArrayList<Mahasiswa> arrayMhs = new ArrayList<>();
        String npm = "", nama = "", gender = "", alamat = "", tempatLahir = "";
        LocalDate tanggalLahir;

        for (int i = 0; i < tmp1.size(); i++) {
            String tmp2[] = tmp1.get(i).split("#");
            for (int k = 0; k < tmp2.length; k++) {
                switch (k) {
                    case 0:
                        npm = tmp2[k];
                        break;
                    case 1:
                        nama = tmp2[k];
                        break;
                    case 2:
                        gender = tmp2[k];
                        break;
                    case 3:
                        alamat = tmp2[k];
                        break;
                    case 4:
                        tempatLahir = tmp2[k];
                        break;
                    case 5:
                        tanggalLahir = LocalDate.parse(tmp2[k]);
                        arrayMhs.add(new Mahasiswa(npm, nama, gender, alamat, tempatLahir, tanggalLahir));
                }
            }
        }
        return arrayMhs;
    }

    public void simpanKeFile(ArrayList<Mahasiswa> arrayMhs) {
        String fileIni = "D://K U L I A H/ALPRO 2/Materi Project/Project Latihan/PRAK06/DATA.txt";
        ArrayList<String> isi = new ArrayList<>();

        for (int i = 0; i < arrayMhs.size(); i++) {
            Mahasiswa tmp = arrayMhs.get(i);
            StringJoiner SJ = new StringJoiner("#");
            SJ.add(tmp.getNpm());
            SJ.add(tmp.getNama());
            SJ.add(tmp.getGender());
            SJ.add(tmp.getAlamat());
            SJ.add(tmp.getTempatLahir());
            SJ.add(tmp.getTanggalLahir().toString());
            isi.add(SJ.toString());
        }

        TulisBerkas tulisBerkas = new TulisBerkas(fileIni);
        if (!tulisBerkas.isSts())
            System.exit(0);
        tulisBerkas.tulisKonten03(isi);
    }

    public BacaTulisMahasiswa() {
        bacaFileIni();
    }
}
