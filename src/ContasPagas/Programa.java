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
public class Programa {
    public static void main(String[] args) {
        Produto pro=new Produto();
        Cliente cli=new Cliente();
        Conta conta1= new Conta();
        pro.setDescricaoProduto("Teste");
        pro.setValorProduto(100.0);
        cli.setCpf("000.111.999-88");
        cli.setNomeCliente("Lucas");
        conta1.setDataPagamento("28/06/2019");
        conta1.setDataVencimento("30/06/2019");
        conta1.setIdConta("1");
        
        conta1.visualizarConta();
    }
}
