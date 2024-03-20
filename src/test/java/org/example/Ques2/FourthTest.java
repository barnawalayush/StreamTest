package org.example.Ques2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FourthTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testMain() {
        Fourth.main(new String[]{});

        assertEquals("BOB\n" +
                "AYUSH\n" +
                "SHERLOCK\n" +
                "ANTONIO\n" +
                "JESSICA\n", outputStream.toString());
    }
}