/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author lucas
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Lucas");
        f1.setSalario(1000);
        f1.setRg("UF-000.111.222");
        f1.setData("20/12/2009");
        f1.setDepartamento("Vendas");
        f1.setValorVenda(2000);
        f1.bonifica(100);
        f1.setFaltas(10);
        f1.mostra();
    }
}
