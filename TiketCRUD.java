import java.util.ArrayList;
import java.util.Scanner;

class Tiket {
    int nik;
    String nama;
    String email;
    String asal;
    String tujuan;
    int tanggal, bulan, tahun, jam;
    int dewasa, bayi, harga, kereta;

    Tiket(int nik, String nama, String email, String asal, String tujuan, int tanggal, int bulan, int tahun, int jam, int dewasa, int bayi, int harga, int kereta) {
        this.nik = nik;
        this.nama = nama;
        this.email = email;
        this.asal = asal;
        this.tujuan = tujuan;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
        this.jam = jam;
        this.dewasa = dewasa;
        this.bayi = bayi;
        this.harga = harga;
        this.kereta = kereta;
    }
}

public class TiketCRUD {
    static ArrayList<Tiket> tiketList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("<<<<<< SELAMAT DATANG DI BLUP TRAIN >>>>>>\n");
            System.out.print("1. Create\n2. Read\n3. Update\n4. Delete\n5. Exit\n");
            System.out.print("\nPilih no berapa: ");
            int pilihan = s.nextInt();
            s.nextLine(); // Membersihkan buffer
            System.out.println();

            switch (pilihan) {
                case 1 -> create(s);
                case 2 -> read();
                case 3 -> update(s);
                case 4 -> delete(s);
                case 5 -> {
                    System.out.println("Terima kasih telah menggunakan Blup Train!");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println("\n\n");
        }
    }

    static void create(Scanner s) {
        System.out.println("<<<<<<< REGISTRASI >>>>>>>>>>>");
        System.out.print("Nama: ");
        String nama = s.nextLine();
        System.out.print("NIK: ");
        int nik = s.nextInt();
        s.nextLine(); // Membersihkan buffer
        System.out.print("Email: ");
        String email = s.nextLine();
        
        System.out.print("Asal Stasiun: ");
        String asal = s.nextLine();
        System.out.print("Tujuan Stasiun: ");
        String tujuan = s.nextLine();

        System.out.print("Tanggal (dd mm yyyy): ");
        int tanggal = s.nextInt();
        int bulan = s.nextInt();
        int tahun = s.nextInt();
        System.out.print("Jam Keberangkatan (1=08:00, 2=12:00, 3=16:00): ");
        int jam = s.nextInt();

        System.out.print("Kereta (1=Ekonomi, 2=Eksekutif): ");
        int kereta = s.nextInt();
        System.out.print("Penumpang Dewasa: ");
        int dewasa = s.nextInt();
        System.out.print("Penumpang Anak: ");
        int bayi = s.nextInt();

        int harga = (kereta == 1 ? 60000 : 120000) * (dewasa + bayi);
        tiketList.add(new Tiket(nik, nama, email, asal, tujuan, tanggal, bulan, tahun, jam, dewasa, bayi, harga, kereta));
        System.out.println("Tiket berhasil dibuat!");
    }

    static void read() {
        if (tiketList.isEmpty()) {
            System.out.println("Belum ada data tiket.");
            return;
        }

        System.out.println("Daftar Tiket:");
        for (Tiket t : tiketList) {
            System.out.println("NIK: " + t.nik + ", Nama: " + t.nama + ", Asal: " + t.asal + ", Tujuan: " + t.tujuan + ", Harga: Rp." + t.harga);
        }
    }

    static void update(Scanner s) {
        System.out.print("Masukkan NIK tiket yang ingin diupdate: ");
        int nik = s.nextInt();
        s.nextLine(); // Membersihkan buffer

        for (Tiket t : tiketList) {
            if (t.nik == nik) {
                System.out.println("Data ditemukan. Masukkan data baru atau tekan Enter untuk melewati.");
                
                System.out.print("Nama baru (sebelumnya: " + t.nama + "): ");
                String namaBaru = s.nextLine();
                if (!namaBaru.isEmpty()) t.nama = namaBaru;

                System.out.print("Email baru (sebelumnya: " + t.email + "): ");
                String emailBaru = s.nextLine();
                if (!emailBaru.isEmpty()) t.email = emailBaru;

                System.out.print("Asal baru (sebelumnya: " + t.asal + "): ");
                String asalBaru = s.nextLine();
                if (!asalBaru.isEmpty()) t.asal = asalBaru;

                System.out.print("Tujuan baru (sebelumnya: " + t.tujuan + "): ");
                String tujuanBaru = s.nextLine();
                if (!tujuanBaru.isEmpty()) t.tujuan = tujuanBaru;

                System.out.println("Data berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Data dengan NIK tersebut tidak ditemukan.");
    }

    static void delete(Scanner s) {
        System.out.print("Masukkan NIK tiket yang ingin dihapus: ");
        int nik = s.nextInt();
        s.nextLine(); // Membersihkan buffer

        tiketList.removeIf(t -> t.nik == nik);
        System.out.println("Tiket berhasil dihapus.");
    }
}
