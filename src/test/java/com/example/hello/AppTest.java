package com.example.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void greetsWorldByDefault() {
        assertEquals("Hello, World!", App.greeting(null));
        assertEquals("Hello, World!", App.greeting("   "));
    }

    @Test
    void greetsGivenName() {
        assertEquals("Hello, Nassos!", App.greeting("Nassos"));
    }
}
