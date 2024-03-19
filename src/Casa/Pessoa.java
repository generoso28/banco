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
public class Pessoa {
    String nome;
    int idade, aniversários;
    
    
    void fazAniversário(){
        idade=idade+aniversários;
    }
    void mostra(){
        System.out.println("Nome "+this.nome);
        System.out.println("Idade= "+this.idade);
    }
    public static void main(String[] args) {
        Pessoa pessoa1=new Pessoa();
        pessoa1.nome="Lucas";
        pessoa1.idade=16;
        pessoa1.aniversários=5;
        pessoa1.fazAniversário();
        pessoa1.mostra();
    }
}

