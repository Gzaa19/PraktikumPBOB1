public class BangunDatar{
    // Atribut
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    // Konstruktor tidak berparameter
    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Method getJmlSisi
    public int getJmlSisi(){
        return jmlSisi;
    }

    // Method setJmlSisi
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    // Method getWarna
    public String getWarna(){
        return warna;
    }

    // Method setWarna
    public void setWarna (String warna){
        this.warna = warna;
    }

    // Method getBorder
    public String getBorder(){
        return border;
    }

    // Method setBorder
    public void setBorder (String border){
        this.border = border;
    }

    // Method printInfo
    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}