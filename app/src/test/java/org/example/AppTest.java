package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testZipIntegers() {
        assertEquals(
            List.of(1, 2, 3, 4, 5, 6),
            ListZipping.zip(List.of(1, 3, 5), List.of(2, 4, 6))
        );
    }

    @Test
    void testZipStringsDifferentSizes() {
        assertEquals(
            List.of("Red", "White", "Green", "Black", "Blue", "Orange", "Pink"),
            ListZipping.zip(
                List.of("Red", "Green", "Blue"),
                List.of("White", "Black", "Orange", "Pink")
            )
        );
    }
}
