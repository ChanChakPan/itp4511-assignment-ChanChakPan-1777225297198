class User {
    String name;
    
    User(String name) {
        this.name = name;
    }

    void login() {
        System.out.println(name + " has logged into the Enterprise System.");
    }
}

public class Main {
    public static void main(String[] args) {
        User myUser = new User("Alice");
        myUser.login();
    }
}