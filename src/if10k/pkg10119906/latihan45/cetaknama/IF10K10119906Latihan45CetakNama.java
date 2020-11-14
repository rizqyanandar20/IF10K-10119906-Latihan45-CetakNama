/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan45.cetaknama;
import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class IF10K10119906Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.print("Masukan nama anda : ");
        String nama = scanner.nextLine();
        System.out.print("Mau cetak nama berapa kali ? : ");
        int jmlCetak = scanner.nextInt();
        printer.cetak(nama, jmlCetak);

        
    }
}
