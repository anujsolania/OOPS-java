// public
// private
// protected
// default

// import bank.*;

class Account {
    String name;
    String email;

    private String password;

    //getter 
    String getpass() {
        return this.password;
    }

    //setter
    void setpass(String pass) {
        this.password = pass;
    }
}


public class AccessModifiers {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.name = "savings";
        acc.email = "abc@gmail.com";
        acc.setpass("huluuu");

        System.out.println(acc.getpass());

    }
}