import java.util.List;

public class Faculty {
    private String name;
    private String address;
    private List<ProgramStudi> listProdi;

    // Constructor
    public Faculty(String name, String address) {
        this.name = name;
        this.address = address;
    }

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

    public void addProdi(ProgramStudi newProdi) {
        listProdi.add(newProdi);
    }
}
