import java.util.ArrayList;
import java.util.List;

public class KRS {
    private int totalSKS;
    private int semester;
    private String tahunKurikulum;
    private String periode;
    private List<Matakuliah> matakuliah;

    // Constructor
    public KRS(int totalSKS, int semester, String tahunKurikulum, String periode) {
        this.totalSKS = totalSKS;
        this.semester = semester;
        this.tahunKurikulum = tahunKurikulum;
        this.periode = periode; // Default value, can be changed later
        this.matakuliah = new ArrayList<>();
    }

    public void setTotalSKS(int totalSKS) {
        this.totalSKS = totalSKS;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setTahunKurikulum(String tahunKurikulum) {
        this.tahunKurikulum = tahunKurikulum;
    }

    public void setMatakuliah(Matakuliah newMatakuliah) {
        this.matakuliah.add(newMatakuliah);
    }

    public String getTahunKurikulum() {
        return tahunKurikulum;
    }

    public int getSemester() {
        return semester;
    }

    public int getTotalSKS() {
        return totalSKS;
    }

    public List<Matakuliah> getMatakuliah() {
        return matakuliah;
    }
}
