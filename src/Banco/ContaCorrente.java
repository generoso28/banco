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
class ContaCorrente extends Conta implements Tributavel{
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
    @Override
     void atualiza(double taxa) {
// utilize o método deposita para aplicar a taxa Conta Corrente ao saldo
 super.deposita(this.getSaldo()*(taxa*2));
}
     @Override
     public void deposita(double valor){
         super.deposita(valor-1);
     }
}
