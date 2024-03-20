package org.example.Ques2;

import org.example.Quest1.Second;
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

        assertEquals("Bob\n" +
                "John\n" +
                "Antonio\n", outputStream.toString());
    }

}