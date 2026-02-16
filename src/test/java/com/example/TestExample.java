
package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestExample {


    @Test
    public void testIndexReturnsConsistentResult() {
        Example example = new Example();
        String first = example.index();
        String second = example.index();
        assertEquals(first, second);
    }
    
    @Test
    public void testIndexReturnsGreeting() {
        GreetingService service = new FormalGreetingService();
        Example example = new Example(service);
        String result = example.index();
        assertEquals("Greetings from Spring Boot!", result);
    }

    // --- GreetingService unit tests ---

    @Test
    public void testGreetWithName() {
        GreetingService service = new FormalGreetingService();
        String result = service.greet("Alice");
        assertEquals("Hello, Alice formally!", result);
    }

    @Test
    public void testGreetWithEmptyName() {
        GreetingService service = new FormalGreetingService();
        String result = service.greet("");
        assertEquals("Hello, World formally!", result);
    }

    @Test
    public void testGreetWithNull() {
        GreetingService service = new FormalGreetingService();
        String result = service.greet(null);
        assertEquals("Hello, World formally!", result);
    }

    // --- Controller greeting endpoint tests ---

    @Test
    public void testGreetingEndpointWithName() {
        GreetingService service = new FormalGreetingService();
        Example example = new Example(service);
        String result = example.index("Bob");
        assertEquals("Hello, Bob formally!", result);
    }

    @Test
    public void testGreetingEndpointWithEmptyName() {
        GreetingService service = new FormalGreetingService();
        Example example = new Example(service);
        String result = example.index("");
        assertEquals("Hello, World formally!", result);
    }

}


