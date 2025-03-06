package br.com.moreiracruz.java.basico;

public class OperadoresLogicos {

    // Método para demonstrar o operador AND (&&)
    public boolean andLogico(boolean a, boolean b) {
        return a && b;
    }

    // Método para demonstrar o operador OR (||)
    public boolean orLogico(boolean a, boolean b) {
        return a || b;
    }

    // Método para demonstrar o operador NOT (!)
    public boolean notLogico(boolean a) {
        return !a;
    }

    // Método para demonstrar o operador XOR (^)
    public boolean xorLogico(boolean a, boolean b) {
        return a ^ b;
    }

    // Método para demonstrar o operador AND sem curto-circuito (&)
    public boolean andSemCurtoCircuito(boolean a, boolean b) {
        return a & b;
    }

    // Método para demonstrar o operador OR sem curto-circuito (|)
    public boolean orSemCurtoCircuito(boolean a, boolean b) {
        return a | b;
    }

}
