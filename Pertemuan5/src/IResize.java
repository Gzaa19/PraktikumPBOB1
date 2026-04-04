public interface IResize {
    // menambah ukuran lebih besar
    public void zoomIn();
    // menambah ukuran lebih kecil
    public void zoomOut();
    // menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}
