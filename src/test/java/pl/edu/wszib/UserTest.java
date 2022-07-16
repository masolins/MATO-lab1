package pl.edu.wszib;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    @DisplayName("Should increase age after birthday")
    public void shouldIncreseAgeAfterBirthday(){
        //given - tworzymy uzytkownika - kryterium poczatkowe
        final User user = new User ("Malgorzata", "Solinska", 30);
        //when
        user.birthday();
        //then
        assertEquals(31, user.getAge());
    }
    @Test
    @DisplayName("Should increase age by 2")
    public void shouldIncreaseAgeByTwo(){
        final ExtendUser extendUser = new ExtendUser("Malgorzata", "solinska", 30);
        extendUser.extendedBirthday();
        assertEquals(32, extendUser.getAge());
    }

}