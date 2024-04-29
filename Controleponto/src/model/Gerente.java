package model;

import model.Funcionario;

public class Gerente extends Funcionario {
    private String login;
    private String Senha;

    public Gerente(int idFunc, String nome, String email, String documento, String login, String senha) {
        super(idFunc, nome, email, documento);
        this.login = login;
        Senha = senha;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return Senha;
    }
    public void setSenha(String senha) {
        Senha = senha;
    }
}
