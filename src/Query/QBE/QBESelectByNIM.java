package Query.QBE;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import Apps.Mahasiswa;

public class QBESelectByNIM {
    public static void main(String[] args) {
        // Buka database (akan buat file db jika belum ada)
        ObjectContainer db = Db4oEmbedded.openFile("dataSBDL.db4o");

        // Query By Example
        Mahasiswa template = new Mahasiswa();
        template.setNim("1232001011");
        ObjectSet<Mahasiswa> result = db.queryByExample(template);

        System.out.println("Hasil QBE:");
        while (result.hasNext()) {
            Mahasiswa m = (Mahasiswa) result.next();
            System.out.println(m.getNim() + " - " + m.getName() + " - " + m.getBeasiswa());
        }

        db.close();
    }
}