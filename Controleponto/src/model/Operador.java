package model;

import model.Funcionario;

public class Operador extends Funcionario {
    private double valorHora;

    public Operador(int idFunc, String nome, String email, String documento, double valorHora) {
        super(idFunc, nome, email, documento);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
