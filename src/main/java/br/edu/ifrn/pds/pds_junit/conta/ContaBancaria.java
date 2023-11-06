package br.edu.ifrn.pds.pds_junit.conta;

public class ContaBancaria {

    private float saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(float saldo) {
        this.saldo = saldo;
    }

    public float consultarSaldo() {
        return saldo;
    }

    public void depositar(float valorDeposito) {
        verificarSeNegativo(valorDeposito);

        this.saldo += valorDeposito;
    }

    public float sacar(float valorSaque) {
        verificarSeMaiorQueSaldo(valorSaque);
        verificarSeNegativo(valorSaque);

        this.saldo -= valorSaque;
        return valorSaque;
    }

    public void transferir(ContaBancaria contaDestino, float valorTransferencia) {
        if (contaDestino.equals(this))
            throw new IllegalArgumentException("Não é possível fazer tranferência para a mesma conta...");

        verificarSeMaiorQueSaldo(valorTransferencia);
        verificarSeNegativo(valorTransferencia);

        contaDestino.depositar(valorTransferencia);
        this.saldo -= valorTransferencia;
    }

    private void verificarSeNegativo(float valor) {
        if (valor <= 0)
            throw new IllegalArgumentException("Impossível realização operação com valor menor ou igual a zero...");
    }

    private void verificarSeMaiorQueSaldo(float valor) {
        if (valor > saldo)
            throw new IllegalArgumentException("Impossível realização operação com valor maior que o saldo em conta...");
    }

}
