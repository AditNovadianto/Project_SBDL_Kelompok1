import com.db4o.*;
import java.util.*;

public class InputData {
    public static void main(String[] args) {
        ObjectContainer db =
                Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "dataSBDL.db4o");

        try {
            // 1. Buat MataKuliah
            MataKuliah mk1 = new MataKuliah("FTK161", "Statistik", 3);
            MataKuliah mk2 = new MataKuliah("FTK203", "Sistem Basis Data", 3);
            MataKuliah mk3 = new MataKuliah("TIF206", "Sistem Operasi", 3);
            MataKuliah mk4 = new MataKuliah("TIF207", "Komunikasi Data", 3);
            MataKuliah mk5 =
                    new MataKuliah("TIF211", "Leadership and Management for IT Engineer", 3);
            MataKuliah mk6 = new MataKuliah("TIF223", "Sistem Dijital", 3);
            MataKuliah mk7 =
                    new MataKuliah("UNI106", "Pendidikan Pancasila dan Kewarganegaraan", 3);
            MataKuliah mk8 = new MataKuliah("UNI101", "Bahasa Indonesia", 2);
            MataKuliah mk9 = new MataKuliah("FTK103", "Pemrograman Visual", 3);
            MataKuliah mk10 = new MataKuliah("FTK211", "Kalkulus II", 3);
            MataKuliah mk11 = new MataKuliah("TIF103", "Matematika Diskrit", 3);
            MataKuliah mk12 = new MataKuliah("TIF106", "Konsep Sistem Informasi", 3);
            MataKuliah mk13 = new MataKuliah("TIF109", "Struktur Data", 3);
            MataKuliah mk14 = new MataKuliah("UNI102", "Agama", 2);
            MataKuliah mk15 = new MataKuliah("UNI204", "Bahasa Inggris 2", 3);
            MataKuliah mk16 = new MataKuliah("TIF210", "Informatika Sosial", 2);
            MataKuliah mk17 = new MataKuliah("TIF310", "Interpersonal Skill", 2);
            MataKuliah mk18 =
                    new MataKuliah("FTK403", "Etika Profesi dan Hak Kekayaan Intelektual", 3);

            // Simpan mata kuliah ke dalam database
            db.store(mk1);
            db.store(mk2);
            db.store(mk3);
            db.store(mk4);
            db.store(mk5);
            db.store(mk6);
            db.store(mk7);
            db.store(mk8);
            db.store(mk9);
            db.store(mk10);
            db.store(mk11);
            db.store(mk12);
            db.store(mk13);
            db.store(mk14);
            db.store(mk15);
            db.store(mk16);
            db.store(mk17);
            db.store(mk18);


            // 2. Buat KRS dan tambahkan mata kuliah
            KRS krs1 = new KRS(23, 3, "221P", "20241");
            krs1.setMatakuliah(mk1);
            krs1.setMatakuliah(mk2);
            krs1.setMatakuliah(mk3);
            krs1.setMatakuliah(mk4);
            krs1.setMatakuliah(mk5);
            krs1.setMatakuliah(mk6);
            krs1.setMatakuliah(mk7);
            krs1.setMatakuliah(mk8);

            KRS krs2 = new KRS(24, 2, "221P", "20232");
            krs2.setMatakuliah(mk9);
            krs2.setMatakuliah(mk10);
            krs2.setMatakuliah(mk11);
            krs2.setMatakuliah(mk12);
            krs2.setMatakuliah(mk13);
            krs2.setMatakuliah(mk14);
            krs2.setMatakuliah(mk15);
            krs2.setMatakuliah(mk16);
            krs2.setMatakuliah(mk17);

            KRS krs3 = new KRS(22, 2, "221P", "20232");
            krs3.setMatakuliah(mk9);
            krs3.setMatakuliah(mk10);
            krs3.setMatakuliah(mk11);
            krs3.setMatakuliah(mk12);
            krs3.setMatakuliah(mk13);
            krs3.setMatakuliah(mk14);
            krs3.setMatakuliah(mk15);
            krs3.setMatakuliah(mk16);

            KRS krs4 = new KRS(23, 2, "221P", "20232");
            krs4.setMatakuliah(mk9);
            krs4.setMatakuliah(mk10);
            krs4.setMatakuliah(mk11);
            krs4.setMatakuliah(mk12);
            krs4.setMatakuliah(mk13);
            krs4.setMatakuliah(mk17);
            krs4.setMatakuliah(mk15);
            krs4.setMatakuliah(mk18);

            // Simpan KRS ke dalam database
            db.store(krs1);
            db.store(krs2);
            db.store(krs3);
            db.store(krs4);


            // 3. Buat Transaksi
            Transaksi t1 = new Transaksi(2500000, 900000, "Lunas", 3, 385000, "20241");
            Transaksi t2 = new Transaksi(2500000, 900000, "Lunas", 2, 385000, "20232");

            // Simpan transaksi ke dalam database
            db.store(t1);
            db.store(t2);

            // 4. Buat MahasiswaS1
            MahasiswaS1 mhs1 = new MahasiswaS1();
            mhs1.setNim("1232001011");
            mhs1.setName("Thariq Rahman");
            mhs1.setBeasiswa("Beasiswa Gemilang");
            mhs1.setJalurMasuk("Nilai Raport");
            mhs1.setDosenPembimbing("Ir. Iwan Adhicandra, S.T., M.Sc., Ph.D., SMIEEE");
            // Tambahkan transaksi dan KRS
            mhs1.addDaftarKRS(krs1);
            mhs1.addDaftarKRS(krs2);

            MahasiswaS1 mhs2 = new MahasiswaS1();
            mhs2.setNim("1232001044");
            mhs2.setName("Aditya Novadianto Pratama");
            mhs2.setBeasiswa("Beasiswa Gemilang");
            mhs2.setJalurMasuk("Nilai Raport");
            mhs2.setDosenPembimbing("Guson P. Kuntarto, ST, Msc");
            // Tambahkan transaksi dan KRS
            mhs2.addDaftarKRS(krs1);
            mhs2.addDaftarKRS(krs3);

            MahasiswaS1 mhs3 = new MahasiswaS1();
            mhs3.setNim("1232001032");
            mhs3.setName("Egbert Felica Wibianto");
            mhs3.setBeasiswa("Beasiswa Gemilang");
            mhs3.setJalurMasuk("Nilai Raport");
            mhs3.setDosenPembimbing("Irwan Prasetya Gunawan, S.T., M.Eng., PhD");
            // Tambahkan transaksi dan KRS
            mhs3.addDaftarKRS(krs1);
            mhs3.addDaftarKRS(krs4);

            // Simpan mahasiswa ke dalam database
            db.store(mhs1);
            db.store(mhs2);
            db.store(mhs3);

            // 5. Buat Program Studi dan tambahkan mahasiswa
            ProgramStudi prodi = new ProgramStudi("Informatika", "TIF");
            prodi.addMahasiswa(mhs1);
            prodi.addMahasiswa(mhs2);
            prodi.addMahasiswa(mhs3);

            // Simpan prodi ke dalam database
            db.store(prodi);



            // 6. Buat Fakultas dan tambahkan prodi
            Faculty fakultas = new Faculty("FTK", "Kampus Plaza Festival Universitas Bakrie");
            fakultas.addProdi(prodi);

            // Simpan fakultas ke dalam database
            db.store(fakultas);

            // 7. Buat Universitas dan simpan fakultas
            University ub = new University("Universitas Bakrie", "Jl. H.R. Rasuna Said, Kuningan");
            // Simpan universitas ke dalam database
            db.store(ub);

            // Commit the transaction
            db.commit();

            // Print success message
            System.out.println("Data berhasil disimpan ke db4o.");


            System.out.println("Data berhasil disimpan ke db4o.");
        } finally {
            db.close();
        }
    }
}
