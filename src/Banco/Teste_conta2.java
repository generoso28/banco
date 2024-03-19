/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author 11191013761
 */
public class Teste_conta2 {
    public static void main(String[] args) {
        Conta joao = new Conta(); 
        joao.deposita(1000);
        Conta maria = new Conta(); 
        maria.deposita(500);
        joao.transfere(maria, 2000);
        System.out.println("Saldo de Maria: "+maria.getSaldo());
        System.out.println("Saldo de João: "+joao.getSaldo());

        
    }
    
}
