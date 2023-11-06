package br.edu.ifrn.pds.pds_junit.test.conta;

import br.edu.ifrn.pds.pds_junit.conta.ContaBancaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void deveriaLancarMensagemCorretaAoDepositar() {
        try {

            new ContaBancaria(1000).depositar(-50);

            fail("Não lançou exceção correta");

        } catch (IllegalArgumentException e) {

            assertEquals("Impossível realização operação com valor menor ou igual a zero...", e.getMessage());

        }
    }

    @Test
    public void deveriaSacar400() {
        ContaBancaria contaBancaria = new ContaBancaria(1000);

        assertEquals(400, contaBancaria.sacar(400));
    }

    @Test
    public void deveriaDiminuirSaldoAoSacar400() {
        ContaBancaria contaBancaria = new ContaBancaria(800);
        contaBancaria.sacar(400);

        assertEquals(400, contaBancaria.consultarSaldo());
    }

    @Test
    public void deveriaLancarExcecaoAoSacarValorNegativo() {
        assertThrows(IllegalArgumentException.class,() -> new ContaBancaria(1000).sacar(-40));
    }

    @Test
    public void deveriaLancarExcecaoAoSacarValorMaiorQueSaldo() {
        assertThrows(IllegalArgumentException.class,() -> new ContaBancaria(1000).sacar(1500));
    }

}
