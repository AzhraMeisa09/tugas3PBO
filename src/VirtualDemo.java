import java.util.*;
import java.text.*;

public class VirtualDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;
        Date hariSekarang = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("E, dd/MM/yyyy");
        SimpleDateFormat waktu = new SimpleDateFormat("HH:mm:ss a zzz");

        do {
            try {
                System.out.print("Masukkan kode barang\t\t: ");
                String nomorFaktur = scanner.next();

                System.out.print("Masukkan nama pelanggan\t\t: ");
                String namaPelanggan = scanner.next();

                System.out.print("Masukkan nomor HP pelanggan\t: ");
                String nomorHP = scanner.next();

                System.out.print("Masukkan alamat pelanggan\t: ");
                scanner.nextLine(); 
                String alamatPelanggan = scanner.nextLine();

                System.out.print("Masukkan nama barang\t\t: ");
                String namaBarang = scanner.next();

                System.out.print("Masukkan harga barang\t\t: ");
                double hargaBarang = scanner.nextDouble();

                System.out.print("Masukkan jumlah barang\t\t: ");
                int jumlahBeli = scanner.nextInt();

                // Membuat objek Invoice
                Invoice invoice = new Invoice(nomorFaktur, namaPelanggan, nomorHP, alamatPelanggan, namaBarang, hargaBarang, jumlahBeli);

                // Menampilkan detail Invoice dan total bayar
                System.out.println("==============================================");
                System.out.println("\t\tAB MART");
                System.out.println("----------------------------------------------");
                System.out.println("Tanggal\t\t: " + tanggal.format(hariSekarang));
                System.out.println("Waktu\t\t: " + waktu.format(hariSekarang));
                System.out.println("==============================================");
                System.out.println("\t\tDATA PELANGGAN\t");
                System.out.println("----------------------------------------------");
                System.out.println(invoice);
                System.out.println("TOTAL BAYAR\t: " + invoice.hitungTotalBayar());
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Kasir\t\t: MEISA");

                inputValid = true; // Jika tidak terjadi exception, keluar dari perulangan

            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input \n");
                System.out.println("========== Masukan Ulang ==========\n");
                scanner.nextLine(); 
            }
        } while (!inputValid);

        scanner.close();
    }
}
