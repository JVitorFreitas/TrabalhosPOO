package model;

public class Livro {

    //1. Atributos
    private String titulo;
    private String autor;
    private Boolean disponivel;

    //2. Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    //3. Métodos
    public void emprestar(){
        if(disponivel){
            this.disponivel = false;
            System.out.println("Livro emprestado com Sucesso! \n");
        }
        else
            System.out.println("Livro ja está emprestado!! \n");
    }
    public void devolver(){
        this.disponivel = true;
    }

    public String getLivro(){
        return titulo;
    }

    @Override
    public String toString() {
        return  "================================" + '\n' +
                "titulo: " + titulo + '\n' +
                "autor: " + autor + '\n' +
                "Situação: " + (disponivel ? "Disponivel!" : "Emprestado") + '\n' ;
    }
}
