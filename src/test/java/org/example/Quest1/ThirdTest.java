package org.example.Quest1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ThirdTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testMain() {
        Third.main(new String[]{});

        assertEquals("Antonio 40\n" +
                "Bob 40\n" +
                "Jessica 28\n" +
                "Nerissa 34\n" +
                "Sherlock 48\n" +
                "Sherlock 48\n" +
                "Bob 40\n" +
                "Antonio 40\n" +
                "Nerissa 34\n" +
                "Jessica 28\n", outputStream.toString());
    }
}