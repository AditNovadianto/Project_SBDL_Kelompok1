package Query;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class QBEDeleteByNIM {
    public static void main(String[] args) {
        // Buka database (akan buat file db jika belum ada)
        ObjectContainer db = Db4oEmbedded.openFile("dataSBDL.db4o");

        // Query By Example
        Apps.Mahasiswa template = new Apps.Mahasiswa();
        template.setNim("1232001011");
        ObjectSet<Apps.Mahasiswa> result = db.queryByExample(template);

        System.out.println("Hasil QBE:");
        while (result.hasNext()) {
            Apps.Mahasiswa m = result.next();
            System.out.println(m.getNim() + " - " + m.getName() + " - " + m.getBeasiswa());
            db.delete(m); // Hapus data yang ditemukan
        }

        db.close();
        System.out.println("Data berhasil dihapus.");
    }
}
