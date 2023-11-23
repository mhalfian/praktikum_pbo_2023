package tugas;
import java.util.Scanner;
public class CetakNama {
	private int jmlCetak;
    private String nama;

    public int getJmlCetak(){
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak){
        this.jmlCetak = jmlCetak;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void cetak(String nama){
        System.out.println("Nama Anda: "+ nama);
        System.out.println("Hasil Cetak :");
        for (int i = 1; i <= jmlCetak; i++){
            System.out.println(i + ". " + nama);
        }
    }

    public void cetak(int jmlCetak, String nama){
        setJmlCetak(jmlCetak);
        cetak(nama);
    }
    public static void main(String[] args){
        CetakNama aplikasi = new CetakNama();
        Scanner input = new Scanner(System.in);

        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan nama anda: ");
        String nama = input.nextLine();
        aplikasi.setNama(nama);

        System.out.print("Mau cetak nama berapa kali? : ");
        int jmlCetak = input.nextInt();
        aplikasi.cetak(jmlCetak, nama);
        input.close();

    }
}
