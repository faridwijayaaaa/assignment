package PRAK06;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class OlahDataMahasiswa {
    private BacaTulisMahasiswa BTM;
    private ArrayList<Mahasiswa> arrayMhs;
    private Scanner input = new Scanner(System.in);

    public void menuTambahData() {
        String npm, nama, gender, alamat, tempatLahir;
        LocalDate tanggalLahir;
        Mahasiswa tmp;

        System.out.println("Menu Tambah Data Mahasiswa...");
        System.out.print("Npm           : ");
        npm = input.nextLine();
        System.out.print("Nama          : ");
        nama = input.nextLine();
        System.out.print("Gender        : ");
        gender = input.nextLine();
        System.out.print("Alamat        : ");
        alamat = input.nextLine();
        System.out.print("Tempat Lahir  : ");
        tempatLahir = input.nextLine();
        System.out.print("Tanggal Lahir : ");
        tanggalLahir = LocalDate.parse(input.nextLine());

        tmp = new Mahasiswa(npm, nama, gender, alamat, tempatLahir, tanggalLahir);
        arrayMhs.add(tmp);
        System.out.println("Data berhasil disimpan. \n");
    }

    private int cariData(String npm) {
        int pos = -1;
        for (int i = 0; i < arrayMhs.size(); i++) {
            if (arrayMhs.get(i).getNpm().equals(npm)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    private void menuHapusData() {
        String npm;
        int pos;

        System.out.println("Menu Hapus Data Mahasiswa...");
        System.out.print("Npm          : ");
        npm = input.nextLine();
        pos = cariData(npm);

        if (pos < 0) {
            System.out.println("Npm tidak ditemukan. \n");
        } else {
            arrayMhs.remove(pos);
            System.out.println("Data dengan npm : " + npm + ", berhasil dihapus. \n");
        }
    }

    private void menuCetakKodeByNpm() {
        String npm;
        int pos;
        System.out.println("Menu Cetak by Npm...");
        System.out.print("Npm           : ");
        npm = input.nextLine();
        pos = cariData(npm);

        if (pos < 0) {
            System.out.println("Npm tidak ditemukan. \n");
        } else {
            System.out.println("Data dengan npm :" + npm + ", berhasil ditampilkan \n");
            arrayMhs.get(pos).cetak();
            System.out.println("");
        }
    }

    private void menuCetakSemua() {
        System.out.println("Menu Cetak Semua...");
        for (int i = 0; i < arrayMhs.size(); i++) {
            System.out.println("Data ke-" + (i + 1) + " : ");
            arrayMhs.get(i).cetak();
            System.out.println("");
        }
    }

    private void menuUtama() {
        int pilihan = 1;
        while (pilihan > 0 && pilihan < 5) {
            System.out.println("Menu Utama : \n" + "(1) Tambah Data\n" + "(2) Hapus Data\n" + "(3) Cetak Data by NPM\n"
                    + "(4) Cetak Semua\n" + "(lainnya) Keluar\n" + "Pilihan :");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    menuTambahData();
                    break;
                case 2:
                    menuHapusData();
                    break;
                case 3:
                    menuCetakKodeByNpm();
                    break;
                case 4:
                    menuCetakSemua();
                    break;
                default:
                    System.out.println("Thankyou...");
                    BTM.simpanKeFile(arrayMhs);
            }
        }
    }

    public OlahDataMahasiswa() {
        BTM = new BacaTulisMahasiswa();
        arrayMhs = BTM.simpanKeArray();
        menuUtama();
    }

    public static void main(String[] args) {
        new OlahDataMahasiswa();
    }
}