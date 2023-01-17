public class Member{
    String nama;
//    int billing;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    Member(){
        this.nama = "Bing Chilling";
        //this.billing = 0;
    }

//    public int getBilling(){
//        return this.billing = this.billing + Pc.getlama();
//    }


    void dispalymem(){
        System.out.println("\n"+nama);
    }
}
