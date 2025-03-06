package br.com.moreiracruz.java.basico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperadoresLogicosTest {

    OperadoresLogicos operadores = new OperadoresLogicos();

    @Test
    void testAndLogico() {
        assertTrue(operadores.andLogico(true, true)); // true && true = true
        assertFalse(operadores.andLogico(true, false)); // true && false = false
        assertFalse(operadores.andLogico(false, true)); // false && true = false
        assertFalse(operadores.andLogico(false, false)); // false && false = false
    }

    @Test
    void testOrLogico() {
        assertTrue(operadores.orLogico(true, true)); // true || true = true
        assertTrue(operadores.orLogico(true, false)); // true || false = true
        assertTrue(operadores.orLogico(false, true)); // false || true = true
        assertFalse(operadores.orLogico(false, false)); // false || false = false
    }

    @Test
    void testNotLogico() {
        assertFalse(operadores.notLogico(true)); // !true = false
        assertTrue(operadores.notLogico(false)); // !false = true
    }

    @Test
    void testXorLogico() {
        assertFalse(operadores.xorLogico(true, true)); // true ^ true = false
        assertTrue(operadores.xorLogico(true, false)); // true ^ false = true
        assertTrue(operadores.xorLogico(false, true)); // false ^ true = true
        assertFalse(operadores.xorLogico(false, false)); // false ^ false = false
    }

    @Test
    void testAndSemCurtoCircuito() {
        assertTrue(operadores.andSemCurtoCircuito(true, true)); // true & true = true
        assertFalse(operadores.andSemCurtoCircuito(true, false)); // true & false = false
        assertFalse(operadores.andSemCurtoCircuito(false, true)); // false & true = false
        assertFalse(operadores.andSemCurtoCircuito(false, false)); // false & false = false
    }

    @Test
    void testOrSemCurtoCircuito() {
        assertTrue(operadores.orSemCurtoCircuito(true, true)); // true | true = true
        assertTrue(operadores.orSemCurtoCircuito(true, false)); // true | false = true
        assertTrue(operadores.orSemCurtoCircuito(false, true)); // false | true = true
        assertFalse(operadores.orSemCurtoCircuito(false, false)); // false | false = false
    }

}
