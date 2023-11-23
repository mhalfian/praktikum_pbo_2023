package praktikum2;
import java.util.Scanner;

public class Pengkondisian {
	public static void main(String args[]) {
//		inisialisasi
		Scanner input = new Scanner(System.in);
		int angka1,angka2,hasil,perhitungan;
//		input user
		System.out.print("Masukan Angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan Angka 2 : ");
		angka2 = input.nextInt();
//		input perhitungan 
		System.out.print("Masukkan angka perhitungan : "
				+ "\n 1 : Pertambahan"
				+ "\n 2 : Pengurangan"
				+ "\n 3 : Perkalian"
				+ "\n 4 : Pembagian"
				+ "\n Masukan Perhitungan : ");
		perhitungan = input.nextInt();
//		pengkondisian
		if(perhitungan == 1) {
			hasil = angka1 + angka2;
			System.out.print("Hasilnya adalah : "+hasil);		
		} else if(perhitungan == 2) {
			hasil = angka1 - angka2;
			System.out.print("Hasilnya adalah : "+hasil);
		} else if(perhitungan == 3) {
			hasil = angka1 * angka2;
			System.out.print("Hasilnya adalah : "+hasil);
		} else if(perhitungan == 4) {
			hasil = angka1 / angka2;
			System.out.print("Hasilnya adalah : "+hasil);
		}
    }
	

}
