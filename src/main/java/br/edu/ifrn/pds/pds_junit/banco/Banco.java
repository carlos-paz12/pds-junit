package br.edu.ifrn.pds.pds_junit.banco;

public class Banco {

    public Emprestimo solicitarEmprestimo(float valorEmprestimo, float taxaJuros) {
        if (taxaJuros <= 0 || taxaJuros > 100)
            throw new IllegalArgumentException("Taxa de juros inválida.");

        int parcelas = 0;

        if (valorEmprestimo >= 3000 && valorEmprestimo <= 8000) {

            parcelas = 12;

        }
        else if (valorEmprestimo > 8000 && valorEmprestimo <= 25000) {

            parcelas = 36;

        }
        else if (valorEmprestimo > 25000 && valorEmprestimo <= 50000) {

            parcelas = 60;

        }
        else if (valorEmprestimo > 50000 && valorEmprestimo <= 150000) {

            parcelas = 120;

        }
        else {

            throw new IllegalArgumentException("Valor de empréstimo inválido.");

        }

        float valorParcela = valorEmprestimo / parcelas + taxaJuros;

        Emprestimo emprestimoSolicitado = new Emprestimo(valorEmprestimo, taxaJuros, valorParcela, parcelas);

        return emprestimoSolicitado;
    }

}
