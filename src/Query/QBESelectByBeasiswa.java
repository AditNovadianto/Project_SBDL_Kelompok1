package Query;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class QBESelectByBeasiswa {
    public static void main(String[] args) {
        // Buka database (akan buat file db jika belum ada)
        ObjectContainer db = Db4oEmbedded.openFile("dataSBDL.db4o");

        // Query By Example
        Apps.Mahasiswa template = new Apps.Mahasiswa();
        template.setBeasiswa("Beasiswa Gemilang");
        ObjectSet<Apps.Mahasiswa> result = db.queryByExample(template);

        System.out.println("Hasil QBE:");
        while (result.hasNext()) {
            Apps.Mahasiswa m = result.next();
            System.out.println(m.getNim() + " - " + m.getName() + " - " + m.getBeasiswa());
        }

        db.close();
    }
}
