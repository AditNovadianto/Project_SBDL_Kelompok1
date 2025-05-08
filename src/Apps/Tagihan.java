package Apps;

public class Tagihan {
    private String kodeTagihan;
    private String jenisTagihan;
    private int cicilanKe;
    private int Nominal;

    public Tagihan(String kodeTagihan, String jenisTagihan, int cicilanKe, int Nominal) {
        this.kodeTagihan = kodeTagihan;
        this.jenisTagihan = jenisTagihan;
        this.cicilanKe = cicilanKe;
        this.Nominal = Nominal;
    }

    public String getKodeTagihan() {
        return kodeTagihan;
    }

    public void setKodeTagihan(String kodeTagihan) {
        this.kodeTagihan = kodeTagihan;
    }

    public String getJenisTagihan() {
        return jenisTagihan;
    }

    public void setJenisTagihan(String jenisTagihan) {
        this.jenisTagihan = jenisTagihan;
    }

    public int getCicilanKe() {
        return cicilanKe;
    }

    public void setCicilanKe(int cicilanKe) {
        this.cicilanKe = cicilanKe;
    }

    public int getNominal() {
        return Nominal;
    }

    public void setNominal(int nominal) {
        Nominal = nominal;
    }

}
