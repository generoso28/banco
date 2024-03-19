/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

/**
 *
 * @author lucas
 */
public class Casa {
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;
    public void pinta(String s) {
        this.cor = s;
    }
    
    int quantasPortasEstaoAbertas(){
        int cont=0;
        if (porta1.estaAberta()==true){
            cont++;
        }
        if (porta2.estaAberta()==true){
        cont++;}
        if (porta3.estaAberta()==true){
        cont++;}
        return cont;
}
    
}
