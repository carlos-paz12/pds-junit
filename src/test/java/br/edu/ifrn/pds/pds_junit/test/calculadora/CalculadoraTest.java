package br.edu.ifrn.pds.pds_junit.test.calculadora;

import br.edu.ifrn.pds.pds_junit.calculadora.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void deveriaSomar1E2() {
        Calculadora calculadora = new Calculadora();

        assertEquals(3, calculadora.somar(1, 2));
    }

    @Test
    public void deveriaSubtrair5De10() {
        Calculadora calculadora = new Calculadora();

        assertEquals(5, calculadora.subtrair(10, 5));
    }

}
