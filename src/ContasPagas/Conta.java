/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContasPagas;

/**
 *
 * @author lucas
 */
public class Conta {
    private String idConta, dataVencimento,dataPagamento;
    Produto pro = new Produto();
    Cliente cli = new Cliente();

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    void visualizarConta(){
        System.out.println("Identificador: "+idConta);
        System.out.println("Nome: "+pro.getDescricaoProduto());
        System.out.println("Nome do cliente: "+cli.getNomeCliente());
        System.out.println("CPF: "+cli.getCpf());
        System.out.println("Valor: "+pro.getValorProduto());
        System.out.println("Data de vencimento: "+dataVencimento);
        System.out.println("Data de pagamento: "+dataPagamento);
    }
}
