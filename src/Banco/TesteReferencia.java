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
public class TesteReferencia {
    public static void main(String[] args) {
        Conta c1= new Conta();
        Cliente cli1 = new Cliente();
        c1.getTitular().setNome("Lucas Caixeta Generoso");
        c1.getTitular().setCpf("118.840.496-21");
        c1.getTitular().setEndereco("Rua Airton Rodrigues Leite, 353");
        c1.getTitular().setDataNascimento("28/06/2003");
        c1.getTitular().mostraDados();
    }
}
