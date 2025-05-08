package Apps;

import com.db4o.*;
import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Menu Driven Program
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Input Data Mahasiswa");
			System.out.println("2. Input Data Matakuliah");
			System.out.println("3. Input Data KRS");
			System.out.println("4. Input Data Tagihan");
			System.out.println("5. Input Data Transaksi");
			System.out.println("6. Print Data Mahasiswa");
			System.out.println("7. Print Data KRS Mahasiswa");
			System.out.println("8. Print Data Transaksi Mahasiswa");
			System.out.println("9. Exit");
			System.out.print("Pilih menu: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline character

			switch (choice) {
				case 1:
					inputMahasiswa();
					break;
				case 2:
					inputMatakuliah();
					break;
				case 3:
					inputKRS();
					break;
				case 4:
					inputTagihan();
					break;
				case 5:
					inputTransaksi();
					break;
				case 6:
					inputMahasiswa();
					break;
				case 7:
					printKRS();
					break;
				case 8:
					inputTransaksi();
					break;
				case 9:
					System.out.println("Exiting...");
					return;
				default:
					System.out.println("Pilihan tidak valid. Silakan coba lagi.");
			}
		}
	}

	private static void printKRS() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'printKRS'");
	}

	private static void inputTransaksi() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'inputTransaksi'");
	}

	private static void inputTagihan() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'inputTagihan'");
	}

	private static void inputKRS() {
		int totalSKS, semester;
		String tahunKurikulum, periode;
		System.out.print("Masukkan Total SKS: ");
		totalSKS = scanner.nextInt();
		scanner.nextLine(); // Consume newline character
		System.out.print("Masukkan Semester: ");
		semester = scanner.nextInt();
		scanner.nextLine(); // Consume newline character
		System.out.print("Masukkan Tahun Kurikulum: ");
		tahunKurikulum = scanner.nextLine();
		System.out.print("Masukkan Periode: ");
		periode = scanner.nextLine();
		KRS krs = new KRS(totalSKS, semester, tahunKurikulum, periode);
		// Tambahkan matakuliah ke KRS


	}

	private static void inputMatakuliah() {

		String kode, nama;
		int sks;
		System.out.print("Masukkan Kode Matakuliah: ");
		kode = scanner.nextLine();
		System.out.print("Masukkan Nama Matakuliah: ");
		nama = scanner.nextLine();
		System.out.print("Masukkan SKS: ");
		sks = scanner.nextInt();
		scanner.nextLine(); // Consume newline character
		Matakuliah matakuliah = new Matakuliah(kode, nama, sks);
		// Simpan data matakuliah ke database
		ObjectContainer db =
				Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "dataSBDL.db4o");
		try {
			db.store(matakuliah);
			System.out.println("Data Matakuliah berhasil disimpan ke database.");
		} finally {
			db.close();
		}
	}

	private static void inputMahasiswa() {

		// Pilih Jenis Mahasiswa
		while (true) {
			System.out.println("Pilih jenis mahasiswa:");
			System.out.println("1. Mahasiswa S1");
			System.out.println("2. Mahasiswa S2");
			System.out.print("Pilihan: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline character

			if (choice == 1) {
				inputMahasiswaS1();
				break;
			} else if (choice == 2) {
				inputMahasiswaS2();
				break;
			} else {
				System.out.println("Pilihan tidak valid. Silakan coba lagi.");
			}

		}

	}

	private static void inputMahasiswaS2() {
		MahasiswaS2 mahasiswaS2 = new MahasiswaS2();
		System.out.print("Masukkan NIM: ");
		mahasiswaS2.setNim(scanner.nextLine());
		System.out.print("Masukkan Nama: ");
		mahasiswaS2.setName(scanner.nextLine());
		System.out.print("Masukkan Beasiswa: ");
		mahasiswaS2.setBeasiswa(scanner.nextLine());
		System.out.print("Jalur Masuk: ");
		mahasiswaS2.setJalurMasuk(scanner.nextLine());
		System.out.print("Dosen Pembimbing: ");
		mahasiswaS2.setDosenPembimbing(scanner.nextLine());
		System.out.print("Asal Universitas: ");
		mahasiswaS2.setAsalUniv(scanner.nextLine());
		// Simpan data mahasiswaS2 ke database
		ObjectContainer db =
				Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "dataSBDL.db4o");
		try {
			db.store(mahasiswaS2);
			System.out.println("Data Mahasiswa S2 berhasil disimpan ke database.");
		} finally {
			db.close();
		}
	}

	private static void inputMahasiswaS1() {
		MahasiswaS1 mahasiswaS1 = new MahasiswaS1();
		System.out.print("Masukkan NIM: ");
		mahasiswaS1.setNim(scanner.nextLine());
		System.out.print("Masukkan Nama: ");
		mahasiswaS1.setName(scanner.nextLine());
		System.out.print("Masukkan Beasiswa: ");
		mahasiswaS1.setBeasiswa(scanner.nextLine());
		System.out.print("Masukkan Jalur Masuk: ");
		mahasiswaS1.setJalurMasuk(scanner.nextLine());
		System.out.print("Masukkan Dosen Pembimbing: ");
		mahasiswaS1.setDosenPembimbing(scanner.nextLine());
		System.out.println("Data Mahasiswa S1 berhasil disimpan.");
		// Simpan data mahasiswaS1 ke database
		ObjectContainer db =
				Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "dataSBDL.db4o");
		try {
			db.store(mahasiswaS1);
			System.out.println("Data Mahasiswa S1 berhasil disimpan ke database.");
		} finally {
			db.close();
		}
	}
}
