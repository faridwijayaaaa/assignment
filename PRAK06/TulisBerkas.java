package PRAK06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TulisBerkas {
    private String alamatFile;
    private boolean sts;
    private FileWriter buka;
    private BufferedWriter tulis;

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

    public TulisBerkas(String alamatFile) {
        setAlamatFile(alamatFile);
        try {
            buka = new FileWriter(alamatFile); // Add a *boolean true, after that String var name for append
            setSts(true);
            System.out.println("File berhasil dimuat.");
        } catch (IOException e) {
            setSts(false);
            System.out.println("File tidak ditemukan.");
        }
    }

    public void TulisKonten(String[] data) {
        tulis = new BufferedWriter(buka);
        for (int i = 0; i < data.length; i++) {
            String tmp = data[i];
            try {
                tulis.write(tmp);
                tulis.newLine();
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan pada penampung.");
            }
        }

        try {
            tulis.flush();
        } catch (IOException x) {
            System.out.println("Gagal dalam menulis ke dalam file");
        }
    }

    public void tulisKonten03(ArrayList<String> data) {
        tulis = new BufferedWriter(buka);

        for (int i = 0; i < data.size(); i++) {
            String tmp = data.get(i);

            try {
                tulis.write(tmp);
                tulis.newLine();
            } catch (IOException e) {
                System.out.println("Terjadi gangguan pada penampung.");
            }
        }

        try {
            tulis.flush();
        } catch (IOException x) {
            System.out.println("Gagal da;am menilis ke dalam file");
        }
    }
}
