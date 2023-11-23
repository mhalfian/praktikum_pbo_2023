package tugas;

public class Tester {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(4.0);
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
        System.out.println("Luas Persegi: " + persegi.hitungLuas());

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(5.0);
        persegiPanjang.setLebar(3.0);
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
    }
}




