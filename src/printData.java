import com.db4o.*;
import java.util.List;


public class printData {
    public static void main(String[] args) {
        // Print Krs dan Isi Matakuliahnya
        ObjectContainer db =
                Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "dataSBDL.db4o");
        try {
            // Ambil semua KRS dari database
            List<KRS> krsList = db.query(KRS.class);
            for (KRS krs : krsList) {
                System.out.println(
                        "KRS: " + krs.getTahunKurikulum() + ", Semester: " + krs.getSemester());
                System.out.println("Mata Kuliah:");
                for (MataKuliah mk : krs.getMatakuliah()) {
                    System.out.println("Kode: " + mk.getKode() + ", Nama: " + mk.getNama()
                            + ", SKS: " + mk.getSks());
                }
            }
        } finally {
            db.close();
        }
    }
}
