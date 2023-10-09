package com.demoqa;
import org.junit.jupiter.api.*;

public class FirstJUnitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("    ####@beforeAll");
    }


    @AfterAll
    static void afterAll() {
        System.out.println("    ####@afterAll");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("    ####@beforeEach");
    }

    @AfterEach
    void beforEach() {
        System.out.println("    ####@aftereach");
    }

    @Test
    void firstTest() {
        Assertions.assertTrue(3 > 2);
        System.out.println("         ####@test 111");
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(3 > 2);
        System.out.println("         ####@test 222");
    }
}
