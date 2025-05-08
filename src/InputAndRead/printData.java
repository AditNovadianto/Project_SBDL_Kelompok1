package InputAndRead;

import com.db4o.*;

import Apps.KRS;
import Apps.Matakuliah;
import Apps.Transaksi;
import java.util.List;


public class printData {
    public static void main(String[] args) {
        // Print Krs dan Isi Matakuliahnya
        ObjectContainer db =
                Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "dataSBDL.db4o");
        try {
            // Print Transaksi dan Tagihan
            List<Transaksi> transaksiList = db.query(Transaksi.class);
            for (Transaksi transaksi : transaksiList) {
                System.out.println("Kode Pembayaran: " + transaksi.getKodePembayaran());
                System.out.println("Semester: " + transaksi.getSemester());
                System.out.println("Periode: " + transaksi.getPeriode());
                System.out.println("Status: " + transaksi.getStatus());
                System.out.println("Daftar Tagihan:");
                for (Apps.Tagihan tagihan : transaksi.getDaftarTagihan()) {
                    System.out.println("  - Kode Tagihan: " + tagihan.getKodeTagihan());
                    System.out.println("    Jenis Tagihan: " + tagihan.getJenisTagihan());
                    System.out.println("    Cicilan Ke: " + tagihan.getCicilanKe());
                    System.out.println("    Nominal: " + tagihan.getNominal());
                }
            }
        } finally {
            db.close();
        }
    }
}
