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
class ContaPoupanca extends Conta {
void atualiza(double taxa) {
// utilize o método deposita para aplicar a taxa da Poupança ao saldo
super.deposita(this.getSaldo()*taxa*3);}

}
