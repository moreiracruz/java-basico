package br.com.moreiracruz.java.basico;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringDemoTest {

    private StringDemo demo = new StringDemo();

    @Test
    void testConcatenar() {
        assertEquals("HelloWorld", demo.concatenar("Hello", "World"));
    }

    @Test
    void testContem() {
        assertTrue(demo.contem("HelloWorld", "Hello"));
        assertFalse(demo.contem("HelloWorld", "Hi"));
    }

    @Test
    void testParaMaiusculas() {
        assertEquals("HELLO", demo.paraMaiusculas("hello"));
    }

    @Test
    void testParaMinusculas() {
        assertEquals("hello", demo.paraMinusculas("HELLO"));
    }

    @Test
    void testComprimento() {
        assertEquals(5, demo.comprimento("Hello"));
    }

    @Test
    void testSubstituir() {
        assertEquals("HellaWarld", demo.substituir("HelloWorld", "o", "a"));
    }

    @Test
    void testDividir() {
        String[] esperado = {"Hello", "World"};
        assertArrayEquals(esperado, demo.dividir("Hello World", " "));
    }

    @Test
    void testTrim() {
        assertEquals("Hello", demo.trim("  Hello  "));
    }

    @Test
    void testComecaCom() {
        assertTrue(demo.comecaCom("HelloWorld", "Hello"));
        assertFalse(demo.comecaCom("HelloWorld", "World"));
    }

    @Test
    void testTerminaCom() {
        assertTrue(demo.terminaCom("HelloWorld", "World"));
        assertFalse(demo.terminaCom("HelloWorld", "Hello"));
    }

    @Test
    void testCaractereEm() {
        assertEquals('e', demo.caractereEm("Hello", 1));
    }

    @Test
    void testIndiceDe() {
        assertEquals(5, demo.indiceDe("HelloWorld", "World"));
    }

    @Test
    void testUltimoIndiceDe() {
        assertEquals(6, demo.ultimoIndiceDe("HelloWorld", "o"));
    }

    @Test
    void testEstaVazia() {
        assertTrue(demo.estaVazia(""));
        assertFalse(demo.estaVazia("Hello"));
    }

    @Test
    void testEqualsIgnoreCase() {
        assertTrue(demo.equalsIgnoreCase("Hello", "HELLO"));
        assertFalse(demo.equalsIgnoreCase("Hello", "Hi"));
    }

    @Test
    void testComparar() {
        assertTrue(demo.comparar("apple", "banana") < 0);
        assertTrue(demo.comparar("banana", "apple") > 0);
        assertEquals(0, demo.comparar("apple", "apple"));
    }

    @Test
    void testSubstring() {
        assertEquals("World", demo.substring("HelloWorld", 5));
        assertEquals("Hello", demo.substring("HelloWorld", 0, 5));
    }

    @Test
    void testFormatar() {
        assertEquals("Hello, World!", demo.formatar("Hello, %s!", "World"));
    }

    @Test
    void testJuntar() {
        assertEquals("one,two,three", demo.juntar(",", "one", "two", "three"));
    }

    @Test
    void testCorresponde() {
        assertTrue(demo.corresponde("12345", "\\d+"));
        assertFalse(demo.corresponde("abcde", "\\d+"));
    }

    @Test
    void testParaArrayDeCaracteres() {
        assertArrayEquals(new char[]{'H', 'e', 'l', 'l', 'o'}, demo.paraArrayDeCaracteres("Hello"));
    }

    @Test
    void testRepetir() {
        assertEquals("HelloHelloHello", demo.repetir("Hello", 3));
    }

}
