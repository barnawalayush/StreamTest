package org.example.Ques2;

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
    void testMain() {
        Second.main(new String[]{});

//        assertEquals("Name: Bob, City: Ballia\n" +
//                "Name: John, City: Aurangabad\n" +
//                "Name: Sherlock, City: Hyderabad\n", outputStream.toString());
    }

}