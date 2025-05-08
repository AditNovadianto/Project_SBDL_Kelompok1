package Query.QBE;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class QBEUpdateByNIM {
    public static void main(String[] args) {
        // Buka database (akan buat file db jika belum ada)
        ObjectContainer db = Db4oEmbedded.openFile("dataSBDL.db4o");

        // Query By Example
        Apps.Mahasiswa template = new Apps.Mahasiswa();
        template.setNim("1232001011");
        ObjectSet<Apps.Mahasiswa> result = db.queryByExample(template);

        if (result.hasNext()) {
            Apps.Mahasiswa m = result.next();
            m.setBeasiswa("Beasiswa Cemerlang");
            db.store(m);
            System.out.println("Data berhasil diupdate: " + m.getNim() + " - " + m.getName() + " - " + m.getBeasiswa());
        } else {
            System.out.println("Data tidak ditemukan.");
        }

        db.close();
    }
}
