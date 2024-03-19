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
public class Funcionario {
    private double salario, valorVenda;
    private int faltas;
    private String nome, departamento,data,rg;
    private boolean situação=true;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isSituação() {
        return situação;
    }

    public void setSituação(boolean situação) {
        this.situação = situação;
    }
void bonifica(double aumento) {
if (valorVenda>1000){
    salario=salario+aumento;
}
}
void demite() {
if (faltas>10){
situação=false;
}
else if (faltas<=10){
    situação=true;
}
}
void mostra(){
    System.out.println("Nome: "+this.getNome());
    System.out.println("Departamento: "+this.getDepartamento());
    System.out.println("Data: "+this.getData());
    System.out.println("RG: "+this.getRg());
    System.out.println("Faltas: "+this.getFaltas());
    System.out.println("Valor de vendas: "+getValorVenda());
    System.out.println("Salário: "+this.getSalario());
    System.out.println("Situação: "+this.isSituação());
}
}