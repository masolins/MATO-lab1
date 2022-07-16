package pl.edu.wszib;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ExamplesJunitTest {

    @BeforeAll
    public static void setup(){
        System.out.println("setup");
    }
    @BeforeEach
    public void setupEach(){
        System.out.println("setup each");
    }

    @AfterAll
    public static void cleanup(){
        System.out.println("clean up");
    }

    @AfterEach
    public void cleanupEach(){
        System.out.println("clean up each");
    }

    @Test
    void test1(){
        System.out.println("First test");
    }

    @Test
    @DisplayName("Second test")
    void test2(){
        System.out.println("Second test");
    }

}