package org.example.Quest1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SecondTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void main() {
        Second.main(new String[]{});

        assertEquals("Female\n" +
                "2 Jessica 28 10000 female MGR\n" +
                "4 Nerissa 34 200000 female DEV\n" +
                "\n" +
                "Female\n" +
                "1 Bob 40 100000 male DEV\n" +
                "3 Sherlock 48 50000 male HR\n" +
                "5 Antonio 40 30000 male FINANCE\n", outputStream.toString());
    }
}