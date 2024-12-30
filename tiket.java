import java.util.Scanner;
public class tiket {
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
            String asal = s.nextLine();
            System.out.print("Tujuan stasiun: ");
            String tujuan = s.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

            System.out.println("------ Jadwal Keberangkatan ------");
            System.out.print("Masukkan tanggal: ");
            int tanggal = s.nextInt();
            System.out.print("Masukkan bulan (angka): ");
            int bulan = s.nextInt();
            System.out.print("Masukkan tahun: ");
            int tahun = s.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

            System.out.print("jam keberangkatan:\n1. 08.00\n2. 12.00\n3. 16.00\njam berapa:  ");
            int jam = s.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

            System.out.println("<<<<<<< KERETA DAN KURSI >>>>>>");
            System.out.print("Pilih kereta:\n1. Ekonomi\n2. eksekutive\npilih nomor berapa: ");
            int kereta = s.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

            System.out.println("<<<<<< ISI DATA PENUMPANG >>>>>>");
            System.out.print("Dewasa: ");
            int dewasa = s.nextInt();
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
            
                
            
        }
    
    }
    
     static void read (String nama, int nik, String email, String asal, String tujuan, int tanggal, int bulan, int tahun, int jam, int dewasa, int bayi, int harga, int kereta){
        char lanjut;
        Scanner s = new Scanner (System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("<<<<<<< REGISTRASI >>>>>>>>>>>");
        System.out.print("\nNama: "+ nama);
        System.out.print("\nNik: "+nik);
        System.out.print("\nEmail: "+ email);
        System.out.print("\nAsal Stasiun: "+asal);
        System.out.print("\ntujuan Stasiun: "+ tujuan);
        System.out.print("\nTanggal Keberangkatan: " + tanggal + "/" + bulan + "/" + tahun);
        
        if (jam==1) {
            System.out.print("\nJam Keberangkatan: 08.00");
        }else if (jam==2) {
            System.out.print("\nJam Keberangkatan: 12.00"); 
        }else if (jam==3) {
            System.out.print("\nJam Keberangkatan: 16.00");
        }else{
            System.out.print("\nJam Keberangkatan: 20.00");
        }
        System.out.print("\nKategori: "+ kereta);
        System.out.println("\nTiket Dewasa: "+ dewasa + "\nTiket Anak: " + bayi);
        System.out.println("Total tiket: " + (dewasa + bayi));
        System.out.print("\nTotal = Rp." + harga);
        System.out.println("\nPembayaran menggunakan BlupTrainPay\nQr pembayaran akan dikirim ke email anda");
        System.out.println("----------------------------------------------");
        System.out.print("Lanjutkan? (Y/N): ");
        lanjut = s.next().charAt(0);
        if (lanjut == 'Y' || lanjut == 'y'){
            System.out.print("apakah sudah melakukan pembayaran (Y/N): ");
            char bayar = s.next().charAt(0);
            if (bayar == 'Y' || bayar == 'y'){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("<<<<<< E-TICKET >>>>>>");
                System.out.print("E-Ticket anda sudah dikirim ke Email anda");
            }else{
                System.out.println("silahkan melakukan pembayaran terlebih dahulu");
            }
        }else{
            System.out.println("baik, terimaksih\njika sudah siap untuk dilanjutkan silahkan melakukan registrasi ulang");
        }
        
    }
    }
