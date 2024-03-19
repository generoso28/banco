package Banco;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    void roda(Conta c) {
        System.out.println("Saldo anterior: "+c.getSaldo());
        c.atualiza(selic);
        System.out.println("Saldo final: "+c.getSaldo());
        saldoTotal += c.getSaldo();
    }
    public double getSaldoTotal() {
        return saldoTotal;
    }
}
