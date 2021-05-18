package com.company.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square a = new Square(5);

    @Test
    void content() {
        assertEquals(25, a.content());
    }

    @Test
    void perimeter() {
        assertEquals(20, a.perimeter());

    }
}