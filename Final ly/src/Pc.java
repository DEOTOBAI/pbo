public class Pc{
    private String idpc;
    private CPU cpu;
    private VGA vga;

    public Pc(String idpc) {
        this.idpc = idpc;
    }

    public void addkomponen(CPU cpu, VGA vga){
        this.vga = vga;
        this.cpu = cpu;
    }


    public void displaypc(){

        System.out.println("ID PC: "+ this.idpc);
        System.out.println("Spesifikasi:");
        System.out.println("CPU: "+ cpu.getNama());
        System.out.println("VGA: "+ vga.getNama());
    }
}
