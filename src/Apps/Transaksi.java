package Apps;

public class Transaksi {
    private int biayaBPP;
    private int biayaRegistrasi;
    private String status;
    private int semester;
    private int hargaPerSks;
    private String periode;

    // Constructor
    public Transaksi(int biayaBPP, int biayaRegistrasi, String status, int semester,
            int hargaPerSks, String periode) {
        this.biayaBPP = biayaBPP;
        this.biayaRegistrasi = biayaRegistrasi;
        this.status = status;
        this.semester = semester;
        this.hargaPerSks = hargaPerSks;
        this.periode = periode;
    }

    public int getBiayaBPP() {
        return biayaBPP;
    }

    public void setBiayaBPP(int biayaBPP) {
        this.biayaBPP = biayaBPP;
    }

    public int getBiayaRegistrasi() {
        return biayaRegistrasi;
    }

    public void setBiayaRegistrasi(int biayaRegistrasi) {
        this.biayaRegistrasi = biayaRegistrasi;
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

    public int getHargaPerSks() {
        return hargaPerSks;
    }

    public void setHargaPerSks(int hargaPerSks) {
        this.hargaPerSks = hargaPerSks;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public int totalBiaya(int biayaBPP, int biayaRegistrasi, int totalSKS, int hargaPerSks) {
        return (biayaBPP + biayaRegistrasi + (totalSKS * hargaPerSks));
    }
}
