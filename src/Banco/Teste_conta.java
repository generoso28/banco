/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;
import java.util.Scanner;
/**
 *
 * @author 11191013761
 */
public class Teste_conta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        System.out.println("Digite um valor: ");
        Conta c1 = new Conta();
        c1.deposita(entrada.nextDouble()); 
        
        System.out.println("Digite um valor para a conta dois: ");
        Conta c2 = new Conta();
        c2.deposita(entrada.nextDouble());
        System.out.println("Saldo da conta um: "+c1.getSaldo());
        System.out.println("Saldo da conta dois: "+c2.getSaldo());
        
        System.out.println("Digite um valor para saque: ");
        c2.saque(entrada.nextDouble());
        System.out.println("Saldo da conta dois após saque: "+c2.getSaldo());
        
        
      
       
        
    }
    
    
}
