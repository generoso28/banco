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
public class Conta {
    
    int numero;
    private Cliente titular = new Cliente();
    private double saldo; 
    private double limite; 

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void deposita(double valor){
        this.saldo = this.saldo + valor;
        
    }
    public boolean saque(double valor){
        if(valor<=saldo){
             this.saldo = this.saldo - valor;
             System.out.println("Operação realizada com sucesso! ");
             return true;
        }
        else{
            System.out.println("Saldo Insuficinte! saldo: "+this.saldo);
            return false;
        }
    }
    public void transfere(Conta destino, double valor){

if(this.saque(valor) == true){
    destino.deposita(valor);
}
    
}
void atualiza(double taxa) {
this.saldo = this.saldo +(this.saldo * taxa);}
}