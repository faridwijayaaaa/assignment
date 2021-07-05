package TUGAS05;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Produksi {
    private Mesin A, B, C, D, E;
    private LocalTime mulai, tutup;
    private int totalRoti = 0, biaya = 0, totalBiaya = 0, kotak = 0, hargaJual = 0, roti = 0, keuntungan = 0, tmp;
    private Scanner input = new Scanner(System.in);

    private Duration satuHari() {
        mulai = LocalTime.of(8, 0);
        tutup = LocalTime.of(16, 0);
        Duration D = Duration.between(mulai, tutup);
        return D;
    }

    private void sehariProduksi(Mesin nama) {
        Duration D1 = satuHari().minus(nama.getPemanasanAwal());
        while (D1.compareTo(nama.getPemanasanAwal().plus(nama.getDurasi())) > 0) {
            D1 = D1.minus(nama.getDurasi());
            totalBiaya += nama.getBiayaProduksi();
            totalRoti += nama.getRoti();
            if (D1.compareTo(nama.getPemanasanAwal().plus(nama.getDurasi())) > 0)
                D1 = D1.minus(nama.getJedaProduksi());
        }

        biaya = totalBiaya;
        roti = totalRoti;
        while (roti > 12) {
            roti -= 12;
            kotak++;
            hargaJual = kotak * 25000;
        }
        keuntungan = hargaJual - biaya;

    }

    private void pilihanKotak(int tmp) {
        System.out.print("Masukan Kotak yang ingin dijual : ");
        tmp = input.nextInt();
        input.nextLine();

        hargaJual = tmp * 25000;
        keuntungan = hargaJual - biaya;
        System.out.println("Pendapatan jika " + tmp + " kotak Dijual : " + hargaJual);
        System.out.println("Keuntungan jika " + tmp + " kotak Dijual : " + keuntungan);
    }

    private void menuMesin() {
        int pil;

        while (true) {
            System.out.print("Menu Mesin : " + "\n1. Mesin A" + "\n2. Mesin B" + "\n3. Mesin C" + "\n4. Mesin D"
                    + "\n5. Mesin E" + "\nlainnya. Hitung" + "\nPilihan : ");

            pil = input.nextInt();
            input.nextLine();
            switch (pil) {
                case 1:
                    A = new Mesin("A", 20, Duration.of(100, ChronoUnit.MINUTES), Duration.of(10, ChronoUnit.MINUTES),
                            Duration.of(10, ChronoUnit.MINUTES), 35000);
                    sehariProduksi(A);
                    break;
                case 2:
                    B = new Mesin("B", 25, Duration.of(120, ChronoUnit.MINUTES), Duration.of(12, ChronoUnit.MINUTES),
                            Duration.of(15, ChronoUnit.MINUTES), 45000);
                    sehariProduksi(B);
                    break;
                case 3:
                    C = new Mesin("C", 24, Duration.of(120, ChronoUnit.MINUTES), Duration.of(10, ChronoUnit.MINUTES),
                            Duration.of(15, ChronoUnit.MINUTES), 40000);
                    sehariProduksi(C);
                    break;
                case 4:
                    D = new Mesin("D", 30, Duration.of(150, ChronoUnit.MINUTES), Duration.of(12, ChronoUnit.MINUTES),
                            Duration.of(15, ChronoUnit.MINUTES), 50000);
                    sehariProduksi(D);
                    break;
                case 5:
                    E = new Mesin("E", 36, Duration.of(160, ChronoUnit.MINUTES), Duration.of(15, ChronoUnit.MINUTES),
                            Duration.of(20, ChronoUnit.MINUTES), 60000);
                    sehariProduksi(E);
                    break;
                default:
                    return;
            }
        }
    }

    private void cetak() {
        System.out.print("Banyak roti produksi : " + totalRoti + "\nTotal biaya produksi : " + biaya
                + "\nTotal pendapatan : " + hargaJual + "\nKeuntungan : " + keuntungan + "\nKotak = " + kotak);
        System.out.println();
    }

    public Produksi() {
        menuMesin();
        cetak();
        pilihanKotak(tmp);
    }

    public static void main(String[] args) {
        new Produksi();
    }
}
