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
public class TestePorta {
    public static void main (String args[]){
Porta p1 = new Porta();
p1.abre();
p1.pinta("Azul");
    System.out.println("A cor da Porta é: "+p1.getCor());
    System.out.println("A porta está aberta ou fechada? "+(p1.estaAberta()==true?"Aberta":"Fechada"));
}

}
