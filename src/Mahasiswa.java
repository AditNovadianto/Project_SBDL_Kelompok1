import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String nim;
    public String name;
    private String beasiswa;
    private List<Transaksi> daftarKeuangan;
    private List<KRS> daftarKRS;

    // Constructor
    public Mahasiswa(String nim, String name, String beasiswa) {
        this.nim = nim;
        this.name = name;
        this.beasiswa = beasiswa;
        this.daftarKeuangan = new ArrayList<>();
        this.daftarKRS = new ArrayList<>();
    }

    public Mahasiswa() {

    }

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

    public void addDaftarKeuangan(Transaksi newDaftarKeuangan) {
        this.daftarKeuangan.add(newDaftarKeuangan);
    }

    public void addDaftarKRS(KRS newDaftarKRS) {
        this.daftarKRS.add(newDaftarKRS);
    }

}
