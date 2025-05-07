import java.util.List;

public class ProgramStudi {
    private String name;
    private String code;
    private List<Mahasiswa> listMahasiswa;

    // Constructor
    public ProgramStudi(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Mahasiswa> getListMahasiswa() {
        return listMahasiswa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void addMahasiswa(MahasiswaS1 newMahasiswaS1) {
        listMahasiswa.add(newMahasiswaS1);
    }
}
