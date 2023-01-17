public class Login {
    String username;
    String password;
    Login(){
        this.username = "q";
        this.password = "q";
    }

    Login(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setAdminUsername(String username) {
        this.username = username;
    }

    public void setAdminpassword(String password) {
        this.password = password;
    }
}
