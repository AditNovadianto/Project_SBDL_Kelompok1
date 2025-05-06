import java.util.List;

public class ProgramStudi {
    String name;
    String code;
    List<Mahasiswa> listMahasiswa;

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

    public void setListMahasiswa(List<Mahasiswa> listMahasiswa) {
        this.listMahasiswa = listMahasiswa;
    }
}
