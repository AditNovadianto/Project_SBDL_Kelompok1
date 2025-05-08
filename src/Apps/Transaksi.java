package Apps;

import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    private String status;
    private int semester;
    private String periode;
    private String kodePembayaran;
    private List<Tagihan> daftarTagihan;

    // Constructor
    public Transaksi(String kodePembayaran, int semester, String periode) {
        this.status = "Belum Lunas";
        this.semester = semester;
        this.periode = periode;
        this.kodePembayaran = kodePembayaran;
        this.daftarTagihan = new ArrayList<>(); // Initialize with null or an empty list if needed
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }


    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public String getKodePembayaran() {
        return kodePembayaran;
    }

    public void setKodePembayaran(String kodePembayaran) {
        this.kodePembayaran = kodePembayaran;
    }

    public List<Tagihan> getDaftarTagihan() {
        return daftarTagihan;
    }

    public void addDaftarTagihan(Tagihan daftarTagihan) {
        this.daftarTagihan.add(daftarTagihan);
        checkStatuc();
    }

    public void checkStatuc() {
        for (Tagihan tagihan : daftarTagihan) {
            if (tagihan.getCicilanKe() == 4) {
                this.status = "Lunas";
            } else {
                this.status = "Belum Lunas";
            }
        }
    }
}
