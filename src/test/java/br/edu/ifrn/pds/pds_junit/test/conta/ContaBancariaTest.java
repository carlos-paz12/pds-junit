package br.edu.ifrn.pds.pds_junit.test.conta;

import br.edu.ifrn.pds.pds_junit.conta.ContaBancaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContaBancariaTest {

    @Test
    public void deveriaRetornarSaldoDe1000() {
        ContaBancaria contaBancaria = new ContaBancaria(1000);

        assertEquals(1000, contaBancaria.consultarSaldo());
    }

    @Test
    public void deveriaDepositar1000() {
        ContaBancaria contaBancaria = new ContaBancaria(1000);
        contaBancaria.depositar(1000);

        assertEquals(2000, contaBancaria.consultarSaldo());
    }

    @Test
    public void deveriaLancarExcecaoAoDepositar() {
        assertThrows(IllegalArgumentException.class,() -> new ContaBancaria ().depositar(-20));
    }

}
