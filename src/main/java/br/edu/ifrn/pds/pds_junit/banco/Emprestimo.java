package br.edu.ifrn.pds.pds_junit.banco;

public class Emprestimo {

    private float valorTotal, taxaJuros, valorParcela;
    private int qtdParcelas;

    public Emprestimo(float valorTotal, float taxaJuros, float valorParcela, int qtdParcelas) {
        this.valorTotal = valorTotal;
        this.taxaJuros = taxaJuros;
        this.valorParcela = valorParcela;
        this.qtdParcelas = qtdParcelas;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public float getTaxaJuros() {
        return taxaJuros;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

}
