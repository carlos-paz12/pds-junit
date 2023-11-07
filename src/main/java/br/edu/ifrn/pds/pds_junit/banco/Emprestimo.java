package br.edu.ifrn.pds.pds_junit.banco;

import java.util.Objects;

public class Emprestimo {

    private float valorTotal, taxaJurosDecimal, valorParcela;
    private int qtdParcelas;

    public Emprestimo(float valorTotal, float taxaJurosDecimal, float valorParcela, int qtdParcelas) {
        this.valorTotal = valorTotal;
        this.taxaJurosDecimal = taxaJurosDecimal;
        this.valorParcela = valorParcela;
        this.qtdParcelas = qtdParcelas;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public float getTaxaJurosDecimal() {
        return taxaJurosDecimal;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Emprestimo that = (Emprestimo) o;
        return Float.compare(that.valorTotal, valorTotal) == 0 &&
               Float.compare(that.taxaJurosDecimal, taxaJurosDecimal) == 0 &&
               Float.compare(that.valorParcela, valorParcela) == 0 &&
               qtdParcelas == that.qtdParcelas;
    }

}
