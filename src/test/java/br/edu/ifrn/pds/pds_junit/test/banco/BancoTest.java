package br.edu.ifrn.pds.pds_junit.test.banco;

import br.edu.ifrn.pds.pds_junit.banco.Banco;
import br.edu.ifrn.pds.pds_junit.banco.Emprestimo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class BancoTest {

    @Test
    public void deveriaRetornarEmprestimoValidoComValorAcimaOuIgual3000() {
        Banco banco = new Banco();
        Emprestimo emprestimo = banco.solicitarEmprestimo(3000, 1);
        Emprestimo emprestimoEsperado = new Emprestimo(3000, 0.01f, 252.5f, 12);

        assertEquals(emprestimoEsperado, emprestimo);
    }

    @Test
    public void deveriaRetornarEmprestimoValidoComValorAcimaDe8000() {
        Banco banco = new Banco();
        Emprestimo emprestimo = banco.solicitarEmprestimo(9000, 1);
        Emprestimo emprestimoEsperado = new Emprestimo(8500, 0.01f, 252.5f, 36);

        assertEquals(emprestimoEsperado, emprestimo);
    }

    @Test
    public void deveriaRetornarEmprestimoValidoComValorAcimaDe25000() {
        Banco banco = new Banco();
        Emprestimo emprestimo = banco.solicitarEmprestimo(50000, 8);
        Emprestimo emprestimoEsperado = new Emprestimo(50000, 0.08f, 900f, 60);

        assertEquals(emprestimoEsperado, emprestimo);
    }

    @Test
    public void deveriaRetornarEmprestimoValidoComValorAcimaDe50000() {
        Banco banco = new Banco();
        Emprestimo emprestimo = banco.solicitarEmprestimo(150000, 10);
        Emprestimo emprestimoEsperado = new Emprestimo(150000, 0.1f, 1375f, 120);

        assertEquals(emprestimoEsperado, emprestimo);
    }

}
