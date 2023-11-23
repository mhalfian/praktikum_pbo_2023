package tugas;
import java.util.Scanner;
public class TandanyaKamu {
    private int yearBirth;
    private int yearNow;
    private String red;

    public TandanyaKamu(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur() {
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur) {
        if (umur >= 0 && umur <= 5) {
            red = "LAGI LUCU-LUCUNYA";
        } else if (umur > 5 && umur <= 10) {
            red = "MASIH ANAK-ANAK";
        } else if (umur > 10 && umur <= 13) {
            red = "MASIH REMAJA";
        } else if (umur > 13 && umur <= 19) {
            red = "ALAY";
        } else if (umur > 19 && umur <= 29) {
            red = "LAGI GALAU NYARI JODOH";
        } else if (umur > 29 && umur <= 35) {
            red = "LAGI SIBUK NYARI UANG";
        } else if (umur > 35 && umur <= 150) {
            red = "SUDAH TUA";
        } else {
            red = "TIDAK TERDETEKSI KEHIDUPAN";
        }
        return red;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Tahun Lahir Anda: ");
        int yearBirth = scanner.nextInt();
        TandanyaKamu age = new TandanyaKamu(2023);
        age.setYearBirth(yearBirth);

        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda: " + age.getYearBirth());
        System.out.println("Hari ini tahun: " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
}
