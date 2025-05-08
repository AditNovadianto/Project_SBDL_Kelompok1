package Query;

import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import Apps.Mahasiswa;

public class NQSelectWhere {
    public static void main(String[] args) {
        ObjectContainer db = Db4oEmbedded.openFile("dataSBDL.db4o");

        List<Mahasiswa> result = db.query(new Predicate<Mahasiswa>() {
            public boolean match(Mahasiswa m) {
                return m.getBeasiswa() != null;
            }
        });

        for (Mahasiswa m : result) {
            System.out.println(m.getNim() + " - " + m.getName());
        }

        db.close();
    }
}
