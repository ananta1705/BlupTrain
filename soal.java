import java.util.Scanner;
public class soal {
    public static void main(String[] args) {
        int pilihan;
        int harga = 60000;
        int harga1 = 120000;
        int harga2 = 85000;
        int nik = 0;
        String nama = "";
        String email = "";
        int bayi;
        String lanjut = "";
        String asal = "";
        String tujuan = "";
        int tanggal = 0;
        int bulan = 0;
        int tahun = 0;
        int jam = 0;
        int dewasa = 0;
        int kereta = 0;

        Scanner s = new Scanner (System.in);
        System.out.println("<<<<<<SELAMAT DATANG DI BLUP TRAIN>>>>>>\n");
        System.out.print(" 1. create\n 2. read\n 3. update\n 4. delete\n");
        System.out.print("\nPilih no berapa: ");
        pilihan = s.nextInt();
        s.nextLine();// Membersihkan buffer setelah nextInt()
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        if (pilihan == 1){
            System.out.println("<<<<<<< REGISTRASI >>>>>>>>>>>");
            System.out.print("Nama: ");
            nama = s.nextLine();
            System.out.print("NIK: ");
            nik = s.nextInt();
            s.nextLine(); // Membersihkan buffer setelah nextInt()
            System.out.print("Email: ");
            email = s.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

            System.out.println("<<<<<< KATEGORI >>>>>>");
            System.out.println("list asal dan tujuan:\n1. Purwokerto -> Purworejo\n2. Purwokerto -> Yogyakarta\n3. Purworejo -> Purwokerto\n4. Yogyakarta -> Purwokerto\n5. Purworejo -> Yogyakarta\n6. Yogyakarta -> Purworejo\n");
            System.out.print("Asal stasiun: ");
            asal = s.nextLine();
            System.out.print("Tujuan stasiun: ");
            tujuan = s.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

            System.out.println("------ Jadwal Keberangkatan ------");
            System.out.print("Masukkan tanggal: ");
            tanggal = s.nextInt();
            System.out.print("Masukkan bulan (angka): ");
            bulan = s.nextInt();
            System.out.print("Masukkan tahun: ");
            tahun = s.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

            System.out.print("jam keberangkatan:\n1. 08.00\n2. 12.00\n3. 16.00\njam berapa:  ");
            jam = s.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

            System.out.println("<<<<<<< KERETA DAN KURSI >>>>>>");
            System.out.print("Pilih kereta:\n1. Ekonomi\n2. eksekutive\npilih nomor berapa: ");
            kereta = s.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

            System.out.println("<<<<<< ISI DATA PENUMPANG >>>>>>");
            System.out.print("Dewasa: ");
            dewasa = s.nextInt();
            if (kereta == 1){
                harga = harga * dewasa;
                System.out.print("Anak (umur diatas 3 tahun): ");
                bayi = s.nextInt();
                harga = (harga * dewasa) + (harga * bayi);
                tiket obj = new tiket();
                obj.read(nama, nik, email, asal, tujuan, tanggal, bulan, tahun, jam, dewasa, bayi, harga, kereta);
                
            }else{
            harga = 2 * harga * dewasa;
            System.out.print("Anak (umur diatas 3 tahun): ");
            bayi = s.nextInt();
            harga = 2 * ((harga * dewasa) + (harga * bayi));
            tiket obj = new tiket();
            obj.read(nama, nik, email, asal, tujuan, tanggal, bulan, tahun, jam, dewasa, bayi, harga, kereta);
                
            }
            
                
            
        } else if (pilihan == 3) {
            System.out.println("<<<<<<< UPDATE DATA TIKET >>>>>>>>>>>");
            System.out.print("Masukkan NIK tiket yang ingin diupdate: ");
            int nikCari = s.nextInt();
            s.nextLine(); // Membersihkan buffer setelah nextInt()

            if (nikCari == nik) { // Pastikan NIK cocok
                System.out.println("\nData ditemukan. Silakan masukkan data baru atau tekan Enter untuk melewati.");

                System.out.print("Nama sebelumnya: " + nama + ". Nama baru: ");
                String namaBaru = s.nextLine();
                if (!namaBaru.isEmpty()) {
                    nama = namaBaru;
                }

                System.out.print("Email sebelumnya: " + email + ". Email baru: ");
                String emailBaru = s.nextLine();
                if (!emailBaru.isEmpty()) {
                    email = emailBaru;
                }

                System.out.println("<<<<<< KATEGORI >>>>>>");
                System.out.println("list asal dan tujuan:\n1. Purwokerto -> Purworejo\n2. Purwokerto -> Yogyakarta\n3. Purworejo -> Purwokerto\n4. Yogyakarta -> Purwokerto\n5. Purworejo -> Yogyakarta\n6. Yogyakarta -> Purworejo\n");
                System.out.print("Asal sebelumnya: " + asal + ". Asal baru: ");
                String asalBaru = s.nextLine();
                if (!asalBaru.isEmpty()) {
                    asal = asalBaru;
                }

                System.out.print("Tujuan sebelumnya: " + tujuan + ". Tujuan baru: ");
                String tujuanBaru = s.nextLine();
                if (!tujuanBaru.isEmpty()) {
                    tujuan = tujuanBaru;
                }

                System.out.println("\nData berhasil diperbarui!");
            } else {
                System.out.println("\nData dengan NIK tersebut tidak ditemukan.");
            }
        }
    }
    
    static void read(String nama, int nik, String email, String asal, String tujuan, int tanggal, int bulan, int tahun, int jam, int dewasa, int bayi, int harga, int kereta) {
        Scanner s = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("<<<<<<< INFORMASI TIKET >>>>>>>>>>>");
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Email: " + email);
        System.out.println("Asal Stasiun: " + asal);
        System.out.println("Tujuan Stasiun: " + tujuan);
        System.out.println("Tanggal Keberangkatan: " + tanggal + "/" + bulan + "/" + tahun);
    
        // Menentukan jam keberangkatan berdasarkan input
        String jamKeberangkatan;
        switch (jam) {
            case 1 -> jamKeberangkatan = "08.00";
            case 2 -> jamKeberangkatan = "12.00";
            case 3 -> jamKeberangkatan = "16.00";
            default -> jamKeberangkatan = "Tidak Valid";
        }
        System.out.println("Jam Keberangkatan: " + jamKeberangkatan);
    
        // Menentukan kategori kereta
        String kategoriKereta = (kereta == 1) ? "Ekonomi" : (kereta == 2) ? "Eksekutif" : "Tidak Valid";
        System.out.println("Kategori Kereta: " + kategoriKereta);
        System.out.println("Tiket Dewasa: " + dewasa);
        System.out.println("Tiket Anak: " + bayi);
        System.out.println("Total Tiket: " + (dewasa + bayi));
        System.out.println("Total Harga: Rp. " + harga);
        System.out.println("\nPembayaran menggunakan BlupTrainPay. QR pembayaran akan dikirim ke email Anda.");
        System.out.println("----------------------------------------------");
    
        // Konfirmasi Lanjut
        System.out.print("Lanjutkan? (Y/N): ");
        char lanjut = s.next().toUpperCase().charAt(0); // Konversi ke uppercase untuk menyederhanakan kondisi
        if (lanjut == 'Y') {
            System.out.print("Apakah sudah melakukan pembayaran? (Y/N): ");
            char bayar = s.next().toUpperCase().charAt(0);
            if (bayar == 'Y') {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("<<<<<< E-TICKET >>>>>>");
                System.out.println("E-Ticket Anda sudah dikirim ke email Anda. Terima kasih telah menggunakan layanan kami!");
            } else {
                System.out.println("Silakan melakukan pembayaran terlebih dahulu.");
            }
        } else {
            System.out.println("Baik, terima kasih. Jika siap untuk dilanjutkan, silakan melakukan registrasi ulang.");
        }
    }
    
    
    }
