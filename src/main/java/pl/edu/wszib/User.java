package pl.edu.wszib;

public class User {
    private final String firstname;
    private final String lastname;
    protected int age;
    //private int age;

    public User(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void birthday(){
        this.age += 1;
    }
}
