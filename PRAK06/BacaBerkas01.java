package PRAK06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BacaBerkas01 {
    private String alamatFile;
    private boolean sts;
    private FileReader buka;
    private BufferedReader baca;

    public String getAlamatFile() {
        return alamatFile;
    }

    public void setAlamatFile(String alamatFile) {
        this.alamatFile = alamatFile;
    }

    public boolean isSts() {
        return sts;
    }

    public void setSts(boolean sts) {
        this.sts = sts;
    }

    public BacaBerkas01(String alamatFile) {
        setAlamatFile(alamatFile);
        try {
            buka = new FileReader(alamatFile);
            setSts(true);
            System.out.println("File berhasil dibuka.");
        } catch (FileNotFoundException e) {
            setSts(false);
            System.out.println("File tidak ditemukan.");
        }
    }

    public void BacaKonten() {
        String tmp = "";
        baca = new BufferedReader(buka);

        while (true) {
            try {
                tmp = baca.readLine();
                if (tmp == null)
                    break;
                System.out.println(tmp);
            } catch (IOException e) {
                System.out.println("Karakter tidak dapat dibaca.");
            }
        }
    }

    // Modifikasi untuk Prak06
    public ArrayList<String> BacaKonten03() {
        String tmp = "";
        ArrayList<String> hasil = new ArrayList<>();

        baca = new BufferedReader(buka);

        while (true) {
            try {
                tmp = baca.readLine();
                if (tmp == null)
                    break;
                hasil.add(tmp);
            } catch (IOException e) {
                System.out.println("Karakter tidak bisa dibaca.");
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        String lokasi = "D://K U L I A H/ALPRO 2/Materi Project/Project Latihan/PRAK06/DATA.txt";
        BacaBerkas01 bacaBerkas = new BacaBerkas01(lokasi);

        if (!bacaBerkas.isSts())
            System.exit(0);

        bacaBerkas.BacaKonten();
    }
}
