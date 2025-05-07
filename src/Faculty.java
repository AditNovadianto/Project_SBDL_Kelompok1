import java.util.List;

public class Faculty {
    private String name;
    private String address;
    private List<ProgramStudi> listProdi;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<ProgramStudi> getListProdi() {
        return listProdi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setListProdi(List<ProgramStudi> listProdi) {
        this.listProdi = listProdi;
    }
}
