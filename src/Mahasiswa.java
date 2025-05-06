import java.util.List;

public class Mahasiswa {
    String nim;
    String name;
    String beasiswa;
    List<Transaksi> daftarKeuangan;
    List<KRS> daftarKRS;

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getBeasiswa() {
        return beasiswa;
    }

    public List<Transaksi> getDaftarKeuangan() {
        return daftarKeuangan;
    }

    public List<KRS> getDaftarKRS() {
        return daftarKRS;
    }


    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBeasiswa(String beasiswa) {
        this.beasiswa = beasiswa;
    }

    public void setDaftarKeuangan(List<Transaksi> daftarKeuangan) {
        this.daftarKeuangan = daftarKeuangan;
    }

    public void setDaftarKRS(List<KRS> daftarKRS) {
        this.daftarKRS = daftarKRS;
    }

}
