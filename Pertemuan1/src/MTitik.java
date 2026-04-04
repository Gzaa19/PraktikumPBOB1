public class MTitik {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Titik==========");
        // Membuat titik T1
        System.out.println("Titik T1: ");
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        Titik reflekX = T1.getRefleksiX();
        reflekX.printTitik();
        Titik reflekY = T1.getRefleksiY();
        reflekY.printTitik();
        System.out.println("Berada di kuadran: " + T1.getKuadran());
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat());

        System.out.println("Titik T1: ");
        Titik T2 = new Titik();
        T2.setAbsis(3);
        T2.setOrdinat(4);
        T2.printTitik();
        T2.geser(3, 4);
        T2.printTitik();
        Titik ReflekX = T2.getRefleksiX();
        ReflekX.printTitik();
        Titik ReflekY = T2.getRefleksiY();
        ReflekY.printTitik();
        System.out.println("Berada di kuadran: " + T2.getKuadran());
        System.out.println("Jarak ke pusat: " + T2.getJarakPusat());
    }
}