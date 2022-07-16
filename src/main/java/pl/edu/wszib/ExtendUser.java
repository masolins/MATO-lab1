package pl.edu.wszib;

public class ExtendUser extends User{
    public ExtendUser(String firstname, String lastname, int age) {
        super(firstname, lastname, age);
    }
    public void extendedBirthday(){
        super.age += 2;
    }
}
