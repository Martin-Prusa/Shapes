package com.company.logic;

import com.company.logic.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle a = new Rectangle(5, 8);
    private Rectangle b = new Rectangle(4, 20);

    @Test
    void content() {
        assertEquals(40, a.content());
        assertEquals(80, b.content());
    }

    @Test
    void perimeter() {
        assertEquals(26, a.perimeter());
        assertEquals(48, b.perimeter());
    }
}