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
public class Porta {
    String cor;
private boolean aberta;
private double dimensaoX, dimensaoY, dimensaoZ;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


void abre(){
        this.aberta=true;
}

void fecha(){
        this.aberta=false;            
}
public void pinta (String s){
    this.cor=s;
}
boolean estaAberta(){
        return this.aberta;
}   

}
