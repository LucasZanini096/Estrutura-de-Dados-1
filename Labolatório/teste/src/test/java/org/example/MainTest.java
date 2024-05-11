package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void teste() {
        java.lang.String testString = "Hello World";

        assertEquals("Hello World", testString );

    }

    private void assertEquals(java.lang.String helloWorld, java.lang.String testString) {
    }
}