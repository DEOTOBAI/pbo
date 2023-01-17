import java.util.Scanner;
import java.util.Date;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        //String usernamelogin, passwordlogin;
        String nama=null, type=null;
        int lama=0,total=0, harga=0;
        int pilih1,pilih2;

        Scanner sca = new Scanner(System.in);
        Date date = new Date();
        Login adm1 = new Login();
        Meja pc1 = new Regular();
        Meja pc2 = new Vip();
        Meja pc3 = new Premium();
        Meja pc4 = new Regular();
        Meja pc5 = new Vip();
        Meja pc6 = new Premium();
        Member mem1 = new Member();
        Member mem2 = new Member();
        Pc spek1 = new Pc("1A");
        spek1.addkomponen(new CPU("I5 110000"), new VGA("RTX 2060"));

        mem1.setNama("Andi");
        mem2.setNama("Budi");

        java.io.File file = new java.io.File("struk.txt");


        while(true){
            System.out.println("\nMenu Login");
            System.out.print("Username: "); String usernamelogin = sca.nextLine();
            System.out.print("Password: "); String passwordlogin = sca.nextLine();

            if(usernamelogin.equals(adm1.username) && passwordlogin.equals(adm1.password)){
                System.out.println("\nLogin Berhasil");
                System.out.println(date.toString());
                do{
                    Display.menu1();
                    pilih1 = sca.nextInt();
                    if (pilih1 < 1) {
                        throw new ArithmeticException("Angka tidak boleh kurang dari 1");
                    }


                    switch (pilih1){
                        case 1:
                            do{
                                mem1.dispalymem();
                                nama = mem1.getNama();
                                Display.menu2();
                                pilih2 = sca.nextInt();
                                switch (pilih2){
                                    case 1:
                                        System.out.print("Input lama: ");
                                        lama = sca.nextInt();
                                        pc1.setLama(lama);
                                        pc1.displaypc();
                                        type = pc1.type();
                                        lama = pc1.getLama();
                                        harga = pc1.harga();
                                        total = pc1.totharga(lama);
                                        break;
                                    case 2:
                                        System.out.print("Input lama: ");
                                        lama = sca.nextInt();
                                        pc2.setLama(lama);
                                        pc2.displaypc();
                                        type = pc2.type();
                                        lama = pc2.getLama();
                                        harga = pc2.harga();
                                        total = pc2.totharga(lama);
                                        break;
                                    case 3:
                                        System.out.print("Input lama: ");
                                        lama = sca.nextInt();
                                        pc3.setLama(lama);
                                        pc3.displaypc();
                                        type = pc3.type();
                                        lama = pc3.getLama();
                                        harga = pc3.harga();
                                        total = pc3.totharga(lama);
                                        break;
                                    default:
                                        System.out.println("Jenis PC yang tersedia hanya 3");
                                        break;
                                }
                            }while(pilih2 > 3);
                            break;

                        case 2:
                            do{
                                mem2.dispalymem();
                                nama = mem2.getNama();
                                Display.menu2();
                                pilih2 = sca.nextInt();
                                switch (pilih2){
                                    case 1:
                                        System.out.print("Input lama: ");
                                        lama = sca.nextInt();
                                        pc4.setLama(lama);
                                        pc4.displaypc();
                                        type = pc4.type();
                                        lama = pc4.getLama();
                                        harga = pc4.harga();
                                        total = pc4.totharga(lama);
                                        break;
                                    case 2:
                                        System.out.print("Input lama: ");
                                        lama = sca.nextInt();
                                        pc5.setLama(lama);
                                        pc5.displaypc();
                                        type = pc5.type();
                                        lama = pc5.getLama();
                                        harga = pc5.harga();
                                        total = pc5.totharga(lama);
                                        break;
                                    case 3:
                                        System.out.print("Input lama: ");
                                        lama = sca.nextInt();
                                        pc6.setLama(lama);
                                        pc6.displaypc();
                                        type = pc6.type();
                                        lama = pc6.getLama();
                                        harga = pc6.harga();
                                        total = pc6.totharga(lama);
                                        break;
                                    default:
                                        System.out.println("Jenis PC yang tersedia hanya 3");
                                        break;
                                }
                            }while(pilih2 > 3);
                            break;



                        default:
                            System.out.println("Jumlah member cuma 2");
                            break;

                    }
                } while (pilih1 > 2);

                System.out.println("\n==================");
                System.out.println("Nama Member: "+ nama);
                System.out.println("Type Pc: "+ type);
                System.out.println("Harga perjam: "+ harga);
                System.out.println("Lama Main: "+ lama+ " jam");
                System.out.println("Total Harga: "+ total);
                spek1.displaypc();

                try {
                    java.io.PrintWriter output = new java.io.PrintWriter(file);
                    output.println("\n==================");
                    output.println("Nama Member: " + nama);
                    output.println("Type Pc: " + type);
                    output.println("Harga perjam: " + harga);
                    output.println("Lama Main: " + lama+ " jam");
                    output.println("Total Harga: " + total);
                    output.close();
                }catch (FileNotFoundException e){
                        e.printStackTrace();
                }

                break;
            }else {
                System.out.println("Login gagal");
            }
        }
    }
}