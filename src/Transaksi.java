
public class Transaksi {
    int biayaBPP;
    int biayaRegistrasi;
    String status;
    int semester;
    int hargaPerSks;
    int tahunAkademik;

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

    public int getTahunAkademik() {
        return tahunAkademik;
    }

    public void setTahunAkademik(int tahunAkademik) {
        this.tahunAkademik = tahunAkademik;
    }

    public int totalBiaya(int biayaBPP, int biayaRegistrasi, int totalSKS, int hargaPerSks) {
        return (biayaBPP + biayaRegistrasi + (totalSKS * hargaPerSks));
    }
}
