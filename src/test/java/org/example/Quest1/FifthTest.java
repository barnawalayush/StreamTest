package org.example.Quest1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FifthTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testMain() {
        Fifth.main(new String[]{});

        assertEquals("HR 50000\n" +
                "DEV 200000\n" +
                "MGR 10000\n" +
                "FINANCE 50000\n", outputStream.toString());
    }

}