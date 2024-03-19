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
public class TesteCasa {
    public static void main(String args[]) {
        Casa casa1 = new Casa();
        casa1.pinta("Branco");
        Porta p1 = new Porta();
        Porta p2 = new Porta();
        Porta p3 = new Porta();
        casa1.porta1=p1;
        casa1.porta2=p2;
        casa1.porta3=p3;
        casa1.pinta("Amarelo");
        casa1.porta1.abre();
        casa1.porta2.abre();
        casa1.porta3.abre();
        casa1.porta2.fecha();
        System.out.println("Portas abertas: "+casa1.quantasPortasEstaoAbertas());
        
    }
}
