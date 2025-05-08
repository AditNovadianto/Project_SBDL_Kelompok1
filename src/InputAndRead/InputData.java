package InputAndRead;

import com.db4o.*;

import Apps.Faculty;
import Apps.KRS;
import Apps.MahasiswaS1;
import Apps.Matakuliah;
import Apps.ProgramStudi;
import Apps.Tagihan;
import Apps.Transaksi;
import Apps.University;

import java.util.*;

public class InputData {
    public static void main(String[] args) {
        ObjectContainer db =
                Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "dataSBDL.db4o");

        try {
            // 1. Buat MataKuliah
            Matakuliah mk1 = new Matakuliah("FTK161", "Statistik", 3);
            Matakuliah mk2 = new Matakuliah("FTK203", "Sistem Basis Data", 3);
            Matakuliah mk3 = new Matakuliah("TIF206", "Sistem Operasi", 3);
            Matakuliah mk4 = new Matakuliah("TIF207", "Komunikasi Data", 3);
            Matakuliah mk5 =
                    new Matakuliah("TIF211", "Leadership and Management for IT Engineer", 3);
            Matakuliah mk6 = new Matakuliah("TIF223", "Sistem Dijital", 3);
            Matakuliah mk7 =
                    new Matakuliah("UNI106", "Pendidikan Pancasila dan Kewarganegaraan", 3);
            Matakuliah mk8 = new Matakuliah("UNI101", "Bahasa Indonesia", 2);
            Matakuliah mk9 = new Matakuliah("FTK103", "Pemrograman Visual", 3);
            Matakuliah mk10 = new Matakuliah("FTK211", "Kalkulus II", 3);
            Matakuliah mk11 = new Matakuliah("TIF103", "Matematika Diskrit", 3);
            Matakuliah mk12 = new Matakuliah("TIF106", "Konsep Sistem Informasi", 3);
            Matakuliah mk13 = new Matakuliah("TIF109", "Struktur Data", 3);
            Matakuliah mk14 = new Matakuliah("UNI102", "Agama", 2);
            Matakuliah mk15 = new Matakuliah("UNI204", "Bahasa Inggris 2", 3);
            Matakuliah mk16 = new Matakuliah("TIF210", "Informatika Sosial", 2);
            Matakuliah mk17 = new Matakuliah("TIF310", "Interpersonal Skill", 2);
            Matakuliah mk18 =
                    new Matakuliah("FTK403", "Etika Profesi dan Hak Kekayaan Intelektual", 3);

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


            // 3. Tagihan
            // Tagihan Thariq
            Tagihan tg1 = new Tagihan("INV/20232/0006031", "REG - BIAYA REGISTRASI", 1, 900000);
            Tagihan tg2 = new Tagihan("INV/20232/0006032", "BPP - BIAYA PENYELENGGARAAN PENDIDIKAN",
                    1, 2500000);
            Tagihan tg3 = new Tagihan("INV/20232/0016851", "SKS - UANG SKS", 1, 2310000);
            Tagihan tg4 = new Tagihan("INV/20232/0016852", "SKS - UANG SKS", 2, 2310000);
            Tagihan tg5 = new Tagihan("INV/20232/0016853", "SKS - UANG SKS", 3, 2310000);
            Tagihan tg6 = new Tagihan("INV/20232/0016854", "SKS - UANG SKS", 4, 2310000);
            Tagihan tg7 = new Tagihan("INV/20241/0005234", "REG - BIAYA REGISTRASI", 1, 900000);
            Tagihan tg8 = new Tagihan("INV/20241/0005235", "BPP - BIAYA PENYELENGGARAAN PENDIDIKAN",
                    1, 2500000);
            Tagihan tg9 = new Tagihan("INV/20241/0014061", "SKS - UANG SKS", 1, 2213000);
            Tagihan tg10 = new Tagihan("INV/20241/0014062", "SKS - UANG SKS", 2, 2213000);
            Tagihan tg11 = new Tagihan("INV/20241/0014063", "SKS - UANG SKS", 3, 2213000);
            Tagihan tg12 = new Tagihan("INV/20241/0014064", "SKS - UANG SKS", 4, 2213000);

            // Tagihan Egbert
            Tagihan tg13 = new Tagihan("INV/20232/0006045", "REG - BIAYA REGISTRASI", 1, 900000);
            Tagihan tg14 = new Tagihan("INV/20232/0006046",
                    "BPP - BIAYA PENYELENGGARAAN PENDIDIKAN", 1, 2500000);
            Tagihan tg15 = new Tagihan("INV/20232/0016879", "SKS - UANG SKS", 1, 2213000);
            Tagihan tg16 = new Tagihan("INV/20232/0016880", "SKS - UANG SKS", 2, 2213000);
            Tagihan tg17 = new Tagihan("INV/20232/0016881", "SKS - UANG SKS", 3, 2213000);
            Tagihan tg18 = new Tagihan("INV/20232/0016882", "SKS - UANG SKS", 4, 2213000);
            Tagihan tg19 = new Tagihan("INV/20241/0005269", "REG - BIAYA REGISTRASI", 1, 900000);
            Tagihan tg20 = new Tagihan("INV/20241/0005270",
                    "BPP - BIAYA PENYELENGGARAAN PENDIDIKAN", 1, 2500000);
            Tagihan tg21 = new Tagihan("INV/20241/0014121", "SKS - UANG SKS", 1, 2213000);
            Tagihan tg22 = new Tagihan("INV/20241/0014122", "SKS - UANG SKS", 2, 2213000);
            // Tagihan tg23 = new Tagihan("INV/20241/0014123", "SKS - UANG SKS", 3, 2213000);
            // Tagihan tg24 = new Tagihan("INV/20241/0014124", "SKS - UANG SKS", 4, 2213000);

            // Tagihan Aditya
            Tagihan tg25 = new Tagihan("INV/20232/0006060", "REG - BIAYA REGISTRASI", 1, 900000);
            Tagihan tg26 = new Tagihan("INV/20232/0006061",
                    "BPP - BIAYA PENYELENGGARAAN PENDIDIKAN", 1, 2500000);
            Tagihan tg27 = new Tagihan("INV/20232/0016903", "SKS - UANG SKS", 1, 2117000);
            Tagihan tg28 = new Tagihan("INV/20232/0016904", "SKS - UANG SKS", 2, 2117000);
            Tagihan tg29 = new Tagihan("INV/20232/0016905", "SKS - UANG SKS", 3, 2117000);
            Tagihan tg30 = new Tagihan("INV/20232/0016906", "SKS - UANG SKS", 4, 2117000);
            Tagihan tg31 = new Tagihan("INV/20241/0005251", "REG - BIAYA REGISTRASI", 1, 900000);
            Tagihan tg32 = new Tagihan("INV/20241/0005252",
                    "BPP - BIAYA PENYELENGGARAAN PENDIDIKAN", 1, 2500000);
            Tagihan tg33 = new Tagihan("INV/20241/0014089", "SKS - UANG SKS", 1, 2117000);
            Tagihan tg34 = new Tagihan("INV/20241/0014090", "SKS - UANG SKS", 2, 2117000);
            Tagihan tg35 = new Tagihan("INV/20241/0014091", "SKS - UANG SKS", 3, 2117000);
            Tagihan tg36 = new Tagihan("INV/20241/0014092", "SKS - UANG SKS", 4, 2117000);

            // Simpan Transaksi ke dalam database
            db.store(tg1);
            db.store(tg2);
            db.store(tg3);
            db.store(tg4);
            db.store(tg5);
            db.store(tg6);
            db.store(tg7);
            db.store(tg8);
            db.store(tg9);
            db.store(tg10);
            db.store(tg11);
            db.store(tg12);
            db.store(tg13);
            db.store(tg14);
            db.store(tg15);
            db.store(tg16);
            db.store(tg17);
            db.store(tg18);
            db.store(tg19);
            db.store(tg20);
            db.store(tg21);
            db.store(tg22);
            // db.store(tg23);
            // db.store(tg24);
            db.store(tg25);
            db.store(tg26);
            db.store(tg27);
            db.store(tg28);
            db.store(tg29);
            db.store(tg30);
            db.store(tg31);
            db.store(tg32);
            db.store(tg33);
            db.store(tg34);
            db.store(tg35);
            db.store(tg36);

            // 3. Buat Transaksi dan tambahkan tagihan
            // Transaksi Thariq
            Transaksi transaksi1 = new Transaksi("PAY/20231/0010390", 2, "20232");
            transaksi1.addDaftarTagihan(tg1);
            transaksi1.addDaftarTagihan(tg2);
            Transaksi transaksi2 = new Transaksi("PAY/20232/0002856", 2, "20232");
            transaksi2.addDaftarTagihan(tg3);
            transaksi2.addDaftarTagihan(tg4);
            Transaksi transaksi3 = new Transaksi("PAY/20232/0007248", 2, "20232");
            transaksi3.addDaftarTagihan(tg5);
            transaksi3.addDaftarTagihan(tg6);
            Transaksi transaksi4 = new Transaksi("PAY/20233/0000661", 2, "20241");
            transaksi4.addDaftarTagihan(tg7);
            transaksi4.addDaftarTagihan(tg8);
            Transaksi transaksi5 = new Transaksi("PAY/20241/0002747", 2, "20241");
            transaksi5.addDaftarTagihan(tg9);
            transaksi5.addDaftarTagihan(tg10);
            Transaksi transaksi6 = new Transaksi("PAY/20241/0008508", 2, "20241");
            transaksi6.addDaftarTagihan(tg11);
            transaksi6.addDaftarTagihan(tg12);

            // Transaksi Egbert
            Transaksi transaksi7 = new Transaksi("PAY/20232/0000877", 2, "20232");
            transaksi7.addDaftarTagihan(tg13);
            transaksi7.addDaftarTagihan(tg14);
            Transaksi transaksi8 = new Transaksi("PAY/20232/0002488", 2, "20232");
            transaksi8.addDaftarTagihan(tg15);
            transaksi8.addDaftarTagihan(tg16);
            Transaksi transaksi9 = new Transaksi("PAY/20232/0008297", 2, "20232");
            transaksi9.addDaftarTagihan(tg17);
            transaksi9.addDaftarTagihan(tg18);
            Transaksi transaksi10 = new Transaksi("PAY/20241/0000770", 2, "20241");
            transaksi10.addDaftarTagihan(tg19);
            transaksi10.addDaftarTagihan(tg20);
            Transaksi transaksi11 = new Transaksi("PAY/20241/0005270", 2, "20241");
            transaksi11.addDaftarTagihan(tg21);
            transaksi11.addDaftarTagihan(tg22);

            // Transaksi Aditya
            Transaksi transaksi12 = new Transaksi("PAY/20231/0010412", 2, "20231");
            transaksi12.addDaftarTagihan(tg25);
            Transaksi transaksi13 = new Transaksi("PAY/20231/0010415", 2, "20231");
            transaksi12.addDaftarTagihan(tg26);
            Transaksi transaksi14 = new Transaksi("PAY/20232/0003754", 2, "20231");
            transaksi14.addDaftarTagihan(tg27);
            Transaksi transaksi15 = new Transaksi("PAY/20232/0004828", 2, "20231");
            transaksi15.addDaftarTagihan(tg28);
            Transaksi transaksi16 = new Transaksi("PAY/20232/0008614", 2, "20231");
            transaksi16.addDaftarTagihan(tg29);
            transaksi16.addDaftarTagihan(tg30);
            Transaksi transaksi17 = new Transaksi("PAY/20241/0000163", 2, "20241");
            transaksi17.addDaftarTagihan(tg31);
            transaksi17.addDaftarTagihan(tg32);
            Transaksi transaksi18 = new Transaksi("PAY/20241/0006049", 2, "20241");
            transaksi18.addDaftarTagihan(tg33);
            Transaksi transaksi19 = new Transaksi("PAY/20241/0006051", 2, "20241");
            transaksi19.addDaftarTagihan(tg34);
            Transaksi transaksi20 = new Transaksi("PAY/20241/0009716", 2, "20241");
            transaksi20.addDaftarTagihan(tg35);
            transaksi20.addDaftarTagihan(tg36);
            // Simpan transaksi ke dalam database
            db.store(transaksi1);
            db.store(transaksi2);
            db.store(transaksi3);
            db.store(transaksi4);
            db.store(transaksi5);
            db.store(transaksi6);
            db.store(transaksi7);
            db.store(transaksi8);
            db.store(transaksi9);
            db.store(transaksi10);
            db.store(transaksi11);
            db.store(transaksi12);
            db.store(transaksi13);
            db.store(transaksi14);
            db.store(transaksi15);
            db.store(transaksi16);
            db.store(transaksi17);
            db.store(transaksi18);
            db.store(transaksi19);
            db.store(transaksi20);



            // 4. Buat MahasiswaS1
            MahasiswaS1 mhs1 = new MahasiswaS1();
            mhs1.setNim("1232001011");
            mhs1.setName("Thariq Rahman");
            mhs1.setBeasiswa("Beasiswa Gemilang");
            mhs1.setJalurMasuk("Nilai Raport");
            mhs1.setDosenPembimbing("Ir. Iwan Adhicandra, S.T., M.Sc., Ph.D., SMIEEE");
            // Tambahkan KRS
            mhs1.addDaftarKRS(krs1);
            mhs1.addDaftarKRS(krs2);
            // Tambahkan Transaksi
            mhs1.addDaftarKeuangan(transaksi1);
            mhs1.addDaftarKeuangan(transaksi2);
            mhs1.addDaftarKeuangan(transaksi3);
            mhs1.addDaftarKeuangan(transaksi4);
            mhs1.addDaftarKeuangan(transaksi5);
            mhs1.addDaftarKeuangan(transaksi6);

            MahasiswaS1 mhs2 = new MahasiswaS1();
            mhs2.setNim("1232001044");
            mhs2.setName("Aditya Novadianto Pratama");
            mhs2.setBeasiswa("Beasiswa Gemilang");
            mhs2.setJalurMasuk("Nilai Raport");
            mhs2.setDosenPembimbing("Guson P. Kuntarto, ST, Msc");
            // Tambahkan KRS
            mhs2.addDaftarKRS(krs1);
            mhs2.addDaftarKRS(krs3);
            // Tambahkan Transaksi
            mhs2.addDaftarKeuangan(transaksi12);
            mhs2.addDaftarKeuangan(transaksi13);
            mhs2.addDaftarKeuangan(transaksi14);
            mhs2.addDaftarKeuangan(transaksi15);
            mhs2.addDaftarKeuangan(transaksi16);
            mhs2.addDaftarKeuangan(transaksi17);
            mhs2.addDaftarKeuangan(transaksi18);
            mhs2.addDaftarKeuangan(transaksi19);
            mhs2.addDaftarKeuangan(transaksi20);

            MahasiswaS1 mhs3 = new MahasiswaS1();
            mhs3.setNim("1232001032");
            mhs3.setName("Egbert Felica Wibianto");
            mhs3.setBeasiswa("Beasiswa Gemilang");
            mhs3.setJalurMasuk("Nilai Raport");
            mhs3.setDosenPembimbing("Irwan Prasetya Gunawan, S.T., M.Eng., PhD");
            // Tambahkan KRS
            mhs3.addDaftarKRS(krs1);
            mhs3.addDaftarKRS(krs4);
            // Tambahkan Transaksi
            mhs3.addDaftarKeuangan(transaksi7);
            mhs3.addDaftarKeuangan(transaksi8);
            mhs3.addDaftarKeuangan(transaksi9);
            mhs3.addDaftarKeuangan(transaksi10);
            mhs3.addDaftarKeuangan(transaksi11);

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
        } finally {
            db.close();
        }
    }
}
