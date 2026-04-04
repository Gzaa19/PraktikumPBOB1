/**
 * Nama File : Main.java
 * Deskripsi : Main class untuk testing objek BangunDatar, Persegi, dan Lingkaran
 * Pembuat   : Gaza Al Ghozali Chansa
 * Tanggal   : 18 Maret 2026
 */
public class Main {
    public static void main(String[] args) {
        // Langkah 3: Pembuatan objek
        
        // KODE BERMASALAH (Harus di-comment agar program bisa jalan)
        // BangunDatar B1 = new BangunDatar(); 
        
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14); // Diubah dari L1 ke L2 karena duplikasi nama variabel

        // Menampilkan Luas dan Keliling
        System.out.println("Luas P1 (Persegi 10): " + P1.getLuas());
        System.out.println("Luas L1 (Lingkaran 7): " + L1.getLuas());

        // Langkah 5: Memanggil method dari langkah 4
        System.out.println("\n--- Pengujian Method Perbandingan ---");
        
        // Membandingkan objek yang berbeda (Persegi vs Lingkaran)
        boolean cekLuas = P1.isEqualLuas(L1);
        System.out.println("Apakah Luas P1 sama dengan L1? " + cekLuas);
        
        // Contoh perbandingan yang bernilai true (Persegi 10x10 vs Persegi 10x10)
        BangunDatar P3 = new Persegi(10);
        System.out.println("Apakah Luas P1 sama dengan P3? " + P1.isEqualLuas(P3));

        // Langkah Pengujian Interface IResize
        System.out.println("\n--- Pengujian Interface IResize ---");
        System.out.println("Luas P2 awal: " + P2.getLuas());
        P2.zoomIn();
        System.out.println("Luas P2 setelah zoomIn (1.1x): " + P2.getLuas());
        P2.zoomOut();
        System.out.println("Luas P2 setelah zoomOut (0.9x): " + P2.getLuas());
        P2.zoom(200);
        System.out.println("Luas P2 setelah zoom 200%: " + P2.getLuas());

        System.out.println("\nLuas L2 awal: " + L2.getLuas());
        L2.zoomIn();
        System.out.println("Luas L2 setelah zoomIn (1.1x): " + L2.getLuas());
        L2.zoom(50);
        System.out.println("Luas L2 setelah zoom 50%: " + L2.getLuas());
    }
}