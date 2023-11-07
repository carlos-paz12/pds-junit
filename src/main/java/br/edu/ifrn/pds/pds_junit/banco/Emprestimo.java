package br.edu.ifrn.pds.pds_junit.banco;

public class Emprestimo {

    private float valorParcela;
    private int qtdParcelas;

    public Emprestimo(float valorParcela, int qtdParcelas) {
        this.valorParcela = valorParcela;
        this.qtdParcelas = qtdParcelas;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

}
