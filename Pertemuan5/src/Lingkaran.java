/**
 * Nama File : Lingkaran.java
 * Deskripsi : Subclass dari BangunDatar untuk representasi Lingkaran
 * Pembuat   : Gaza Al Ghozali Chansa
 * Tanggal   : 18 Maret 2026
 */
public class Lingkaran extends BangunDatar implements IResize{
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jejari * jejari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jejari;
    }

    @Override
    public void zoomIn(){
        jejari =jejari * 1.1;
    }

    @Override
    public void zoomOut(){
        jejari =jejari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jejari = jejari * percent / 100.0;
    }

    public double getJejari(){
        return jejari;
    }
}