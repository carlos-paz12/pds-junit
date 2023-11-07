package br.edu.ifrn.pds.pds_junit.test.banco;

import br.edu.ifrn.pds.pds_junit.banco.Banco;
import br.edu.ifrn.pds.pds_junit.banco.Emprestimo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BancoTest {

    @Test
    public void deveriaRetornarEmprestimoValido() {
        Banco banco = new Banco();
        Emprestimo emprestimo = banco.solicitarEmprestimo(3000, 1);
        Emprestimo emprestimoEsperado = new Emprestimo(3000, 0.01f, 250.01f, 12);

        assertEquals(emprestimoEsperado, emprestimo);
    }

}
