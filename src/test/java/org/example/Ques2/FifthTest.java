package org.example.Ques2;

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

        assertEquals("{Allahabad=[Sherlock], New York=[John], Aurangabad=[John], Hyderabad=[Bob, Sherlock]}\n", outputStream.toString());
    }

}