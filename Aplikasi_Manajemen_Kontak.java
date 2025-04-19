import java.util.Scanner;
import java.util.ArrayList;

public class Aplikasi_Manajemen_Kontak {

    public static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        boolean status = true;

        ArrayList<String> daftarNama = new ArrayList<>();
        ArrayList<String> daftarNomor = new ArrayList<>();
        ArrayList<String> daftarEmail = new ArrayList<>();

        while(status){
            System.out.println("=== Aplikasi manajemen Kontak ===");
            String[] arrayMenu = {"Tambah kontak", "Tampilkan kontak", "Hapus kontak", "Keluar"};
            for (int  i = 0; i < arrayMenu.length; i++){
                System.out.println((i + 1) +". " + arrayMenu[i]);
            }

            System.out.print("PILIH MENU : "); //! kode mengoperasikan pilihan menu
            byte pilihanMenu = -1; //? ini digunakan untuk menghindari error

            try { 
                pilihanMenu = input.nextByte();
                input.nextLine();
            } catch (Exception e) {
                for(int i = 0; i < 3; i++){
                    System.out.print(".");
                    delay();
                }
                System.out.println("\nInput tidak valid masukkan angka antara (1-4)");
                input.nextLine();
                continue;
            }

            switch(pilihanMenu) {
                case 1 :
                    boolean caseSatu = true;

                    while(caseSatu){
                        System.out.print("Masukkan nama Kontak : ");
                        String namaKontak = input.nextLine();
                        daftarNama.add(namaKontak);

                        System.out.print("Masukkan nomor Kontak : ");
                        String nomorKontak = input.nextLine();
                        daftarNomor.add(nomorKontak);

                        System.out.print("Masukkan Email Kontak : ");
                        String email = input.nextLine();
                        daftarEmail.add(email);

                        for(int i = 0; i < 3; i++) {
                            System.out.print(".");
                            delay();
                        }

                        System.out.println("\nData kontak berhasil dimasukkan !");

                        System.out.print("Ingin input kontak lagi ? (y/n) : ");
                        char choice = input.next().charAt(0);
                        input.nextLine();

                        if (choice == 'y' || choice == 'Y'){
                            caseSatu = true;
                        } else if (choice == 'n' || choice == 'N') {
                            caseSatu = false;
                        }
                        System.out.println();
                    }
                    break;
                case 2 :
                    System.out.print("Sedang memuat catatan");
                    for(int i = 0; i < 3; i++){
                        System.out.print(".");
                        delay();
                    }

                    System.out.println();

                    if(daftarNama.isEmpty() && daftarNomor.isEmpty() && daftarEmail.isEmpty()){
                        System.out.println("Kontak kosong");
                    } else {
                        for (int i = 0; i < 1; i++) {
                            System.out.println(".");
                            delay();
                        }
                        for (int i = 0; i < daftarNama.size(); i++){
                            System.out.println("\nKontak ke - " + (i + 1) );
                            System.out.println("Nama kontak : " + daftarNama.get(i));
                            System.out.println("Nomor kontak : " + daftarNomor.get(i));
                            System.out.println("Email kontak : " + daftarEmail.get(i));
                        }
                        for (int i = 0; i < 25; i++){
                            System.out.print("-");
                        }
                        System.out.println("\n");
                    }              
                    break;
                case 3 :
                    boolean hapusKontak = true;
                    while(hapusKontak) {
                        if (daftarNama.isEmpty() && daftarNomor.isEmpty() && daftarEmail.isEmpty()){
                            System.out.println("Kontak kosong");
                        } else {
                            for (int i = 0; i < daftarNama.size(); i++){
                                System.out.println((i + 1) + (". ") + daftarNama.get(i) + " ");
                            }

                            System.out.println("Pilih kontak yang ingin dihapus");
                            byte erase = input.nextByte();
                            input.nextLine();

                            if(erase >= 1 && erase <= daftarNama.size()){
                                daftarNama.remove(erase -1);
                                daftarNomor.remove(erase -1);
                                daftarEmail.remove(erase -1);
                                System.out.println("Kontak berhasil dihapus! ");
                            } else {
                                System.out.println("nomor yang dimasukkan tidak valid");
                            }

                            System.out.println("ingin menghapus kontak lagi? (y/n) : ");
                            char hapusSemua = input.next().charAt(0);
                            input.nextLine();
                            if (hapusSemua == 'y' || hapusSemua == 'Y'){
                                hapusKontak = true;
                            } else {
                                for (int i = 0; i < 3; i++){
                                    System.out.print(".");
                                    delay();
                                }
                                hapusKontak = false;
                            }

                        } 
                    }
                    break;
                case 4 :
                    for(int i = 0; i < 3; i++){
                        System.out.print(".");
                        delay();
                    }
                    status = false;
                    break;
                default :
                    System.out.println("Pilihan sistem tidak tersedia, silahkan pilih (1-4)");
                    status = true;
                    break;
            }
        }
        

        //! kode untuk logout aplikasi
        System.out.println("Apakah kamu ingin keluar aplikasi? (y/n) : ");
        char keluarAplikasi = input.next().charAt(0);
        input.nextLine();

        if(keluarAplikasi == 'y' || keluarAplikasi == 'Y') {
            System.out.println("Terimakasih sudah menggunakan aplikasi !");
            input.close();
        } else if (keluarAplikasi == 'n' || keluarAplikasi == 'N') {
            status = true;
        } else {
            System.out.println("Input tidak valid silahkan masukkan (y/n) ! :");
            keluarAplikasi = input.next().charAt(0);
        }   
    }
}