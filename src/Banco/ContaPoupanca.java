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

    @Override
    void atualiza(double taxa) {
        super.deposita(this.getSaldo() * taxa * 3);
    }
}
