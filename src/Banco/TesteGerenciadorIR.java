package Banco;

public class TesteGerenciadorIR {
    public static void main(String[] args) {
        GerenciadorIR gerenciador = new GerenciadorIR();
        SeguroVida sv = new SeguroVida();
        gerenciador.adiciona(sv);
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);
        System.out.println(gerenciador.getTotal());
        System.out.printf("O saldo é: %.2f", cc.getSaldo());
    }
}
