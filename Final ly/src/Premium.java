public class Premium extends Meja{
    int harga;
    String type;
    int totharga;

    @Override
    public int totharga(int lama) {
        totharga = lama * harga();
        return totharga;
    }

    @Override
    public int harga() {
        harga = 8000;
        return harga;
    }

    @Override
    public String type() {
        type = "Premium";
        return type;
    }
}
