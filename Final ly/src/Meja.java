public abstract class Meja implements Detail{
    int lama;

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }

    public void displaypc(){
        System.out.println("PC "+ this.type() );
        System.out.println("lama: "+ this.getLama());
        System.out.println("Total: "+ this.totharga(lama));
    }
}
