package Query;

import java.util.ArrayList;
import java.util.List;
import com.db4o.query.Predicate;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

import Apps.Mahasiswa;

public class NQSelectSortByName {
    public static void main(String[] args) {
        ObjectContainer db = Db4oEmbedded.openFile("dataSBDL.db4o");

        List<Mahasiswa> result = new ArrayList<>(
            db.query(new Predicate<Mahasiswa>() {
                public boolean match(Mahasiswa m) {
                    return true;
                }
            })
            );

        result.sort((m1, m2) -> m1.getName().compareToIgnoreCase(m2.getName()));

        for (Mahasiswa m : result) {
            System.out.println(m.getName() + " - " + m.getNim() + " - " + m.getBeasiswa());
        }

        db.close();
    }
}
