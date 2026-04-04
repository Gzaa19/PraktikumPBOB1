/**
 * Nama File : BangunDatar.java
 * Deskripsi : Abstract class untuk representasi bangun datar umum
 * Pembuat   : Gaza Al Ghozali Chansa
 * Tanggal   : 18 Maret 2026
 */
public abstract class BangunDatar {
    
    // Langkah 2: Abstract methods
    public abstract double getLuas();
    public abstract double getKeliling();

    // Langkah 4: Method untuk membandingkan Luas
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    // Langkah 4: Method untuk membandingkan Keliling
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}