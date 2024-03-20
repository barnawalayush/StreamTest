package org.example.Quest1;

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

//        assertEquals("{MGR=1, FINANCE=1, HR=1, DEV=2}\n", outputStream.toString());
    }
}