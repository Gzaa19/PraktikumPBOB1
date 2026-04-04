public class Persegi extends BangunDatar{
    // Atribut tambahan untuk Persegi
    private double sisi;

    // Konstruktor default
    public Persegi() {
        setJmlSisi(4); // Persegi selalu memiliki 4 sisi
    }

    // Konstruktor berparameter
    public Persegi(double sisi, String warna, String border) {
        super(4,warna,border);
        this.sisi = sisi;
    }

    // Getter dan Setter untuk sisi
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}