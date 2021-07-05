package PRAK05;

import java.util.Scanner;

public class jadwalApps {
    private DosenInformatika objDosenInformatika = new DosenInformatika();
    private MK_Informatika objMK_Informatika = new MK_Informatika();
    private WaktuUNPKediri objWaktuUNPKediri = new WaktuUNPKediri();
    private jadwalKelas objJadwal = new jadwalKelas();
    private Scanner input = new Scanner(System.in);

    public void menuLihatDosen() {
        objDosenInformatika.cetak();
    }

    public void menuLihatMataKuliah() {
        objMK_Informatika.cetak();
    }

    public void menuLihatWaktuPerkuliahan() {
        objWaktuUNPKediri.cetakSemua();
    }

    public void menuLihatJadwal() {
        objJadwal.cetakJadwal();
    }

    public void menuCetakJadwalHari() {
        String hari;
        int pos;
        System.out.println("Menu cetak Jadwal hari");
        System.out.print("Masukan hari  : ");
        hari = input.next();
        pos = objJadwal.cariJadwal(hari);

        if (pos < 0) {
            System.out.println("Jadwal hari tidak ada.");
        } else {
            for (int i = 0; i < objJadwal.cariJadwal(hari); i++) {
                System.out.println("Jadwal dengan hari : " + hari + ", Berhasil ditampilkan");
                objJadwal.jadwal[pos].cetak();
                System.out.println();
            }
        }
    }

    public void menuCetakJadwalMK() {
        String kode;
        int pos;
        System.out.println("Menu cetak Jadwal menurut Kode Mata Kuliah");
        System.out.print("Masukan Kode Mata Kuliah : ");
        kode = input.next();
        pos = objJadwal.cariJadwal(kode);

        if (pos < 0) {
            System.out.println("Jadwal dengan Kode : " + kode + ", tidak ada.");
        } else {
            System.out.println("Jadwal dengan Kode Mata Kuliah : " + kode + ", Berhasil ditampilkan");
            objJadwal.jadwal[pos].cetak();
            System.out.println();
        }
    }

    public void menuTambahJadwal() {
        jadwalAtom tmp;
        MataKuliah mk;
        Dosen pengampu;
        String kelas, hari, kode_mk, kode_dosen;
        WaktuKuliah start;
        int kode_Start, i = 0, l = 0;

        System.out.println("Menu Tambah Jadwal . . .");
        // M A T A K U L I A H
        System.out.print("Kode Mata Kuliah      : ");
        kode_mk = input.next();
        if (kode_mk.equals("K001")) {
            i = i + 1;
        } else if (kode_mk.equals("K002")) {
            i = i + 2;
        } else if (kode_mk.equals("K003")) {
            i = i + 3;
        } else if (kode_mk.equals("K004")) {
            i = i + 4;
        } else if (kode_mk.equals("K005")) {
            i = i + 5;
        } else if (kode_mk.equals("K006")) {
            i = i + 6;
        } else if (kode_mk.equals("K007")) {
            i = i + 7;
        } else if (kode_mk.equals("K008")) {
            i = i + 8;
        } else if (kode_mk.equals("K009")) {
            i = i + 9;
        }
        mk = new MataKuliah(kode_mk, objMK_Informatika.matKul[objMK_Informatika.getMatKulKe(i)].getNama(),
                objMK_Informatika.matKul[objMK_Informatika.getMatKulKe(i)].getSks());

        // D O S E N
        System.out.print("Kode Dosen            : ");
        kode_dosen = input.next();
        if (kode_dosen.equals("D001")) {
            l = l + 1;
        } else if (kode_dosen.equals("D002")) {
            l = l + 2;
        } else if (kode_dosen.equals("D003")) {
            l = l + 3;
        } else if (kode_dosen.equals("D004")) {
            l = l + 4;
        } else if (kode_dosen.equals("D005")) {
            l = l + 5;
        } else if (kode_dosen.equals("D006")) {
            l = l + 6;
        } else if (kode_dosen.equals("D007")) {
            l = l + 7;
        }
        pengampu = new Dosen(kode_dosen, objDosenInformatika.dosenku[objDosenInformatika.getDosenKuKe(l)].getNama());

        System.out.print("Kelas                 : ");
        kelas = input.next();
        input.nextLine();
        System.out.print("Hari                  : ");
        hari = input.next();
        input.nextLine();

        // W A K T U K U L I A H
        System.out.print("Kode Jam Kuliah       : ");
        kode_Start = input.nextInt();
        int x = 0;
        if (kode_Start > 2) {
            x = x + 1;
        }
        start = new WaktuKuliah(kode_Start,
                objWaktuUNPKediri.waktu[objWaktuUNPKediri.getWaktuKe(kode_Start + x)].getMulai(),
                objWaktuUNPKediri.waktu[objWaktuUNPKediri.getWaktuKe(
                        kode_Start + objMK_Informatika.matKul[objMK_Informatika.getMatKulKe(i) + x].getSks())]
                                .getSelesai());

        tmp = new jadwalAtom(mk, pengampu, kelas, hari, start);
        if (tmp.equals(objJadwal.jadwal.length - 1)) {
            System.out.println("Data sudah ada, Proses Penambahan dibatalkan.");
        } else {
            objJadwal.inputJadwal(tmp);
            System.out.println("Jadwal berhasil disimpan.");
        }

    }

    public void MenuHapusJadwal() {
        String kode;
        int pos;

        System.out.println("Menu Hapus Jadwal : ");
        System.out.print("Kode Mata Kuliah      : ");
        kode = input.next();
        pos = objJadwal.cariJadwal(kode);

        if (pos < 0) {
            System.out.println("Kode Mata Kuliah tidak ditemukan.");
        } else {

            objJadwal.hapusJadwal(pos);
            System.out.println("Jadwal dengan Kode  : " + kode + ", berhasil dihapus.");
        }
    }

    public void menuUtama() {
        int pilihan = 0;
        while (pilihan <= 8) {
            System.out.println("Menu : ");
            System.out.println("1. Lihat Dosen");
            System.out.println("2. Lihat Mata Kuliah");
            System.out.println("3. Lihat Pembagian Waktu Perkuliahan");
            System.out.println("4. Lihat Jadwal");
            System.out.println("5. Jadwal Hari tertentu");
            System.out.println("6. Jadwal Mata Kuliah tertentu");
            System.out.println("7. Tambah Jadwal");
            System.out.println("8. Hapus Jadwal");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    menuLihatDosen();
                    break;
                case 2:
                    menuLihatMataKuliah();
                    break;
                case 3:
                    menuLihatWaktuPerkuliahan();
                    break;
                case 4:
                    menuLihatJadwal();
                    break;
                case 5:
                    menuCetakJadwalHari();
                    break;
                case 6:
                    menuCetakJadwalMK();
                    break;
                case 7:
                    menuTambahJadwal();
                    break;
                case 8:
                    MenuHapusJadwal();
                    break;
                default:
                    System.out.println("Terimakasih untuk hari ini, esok, dan seterusnya. ");
            }
            System.out.println();
            if (pilihan == 0)
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        new jadwalApps().menuUtama();
    }
}
