import java.util.List;

public class Faculty {
    String name;
    String address;
    List<programStudi> listProdi;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<programStudi> getListProdi() {
        return listProdi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setListProdi(List<programStudi> listProdi) {
        this.listProdi = listProdi;
    }
}
