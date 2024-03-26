package io;

import model.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaTeste {
    //Atributos;
    private List<Livro> listaLivros = new ArrayList<>();

    //Métodos;

    public static void main(String[] args) {
        BibliotecaTeste bibliotecaTeste = new BibliotecaTeste();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("======== Menu Principal ========");
            System.out.println("1. Cadastrar");
            System.out.println("2. Emprestar");
            System.out.println("3. Devolver");
            System.out.println("4. Listar Livros");
            System.out.println("9. Sair");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao){
                case 1:
                    bibliotecaTeste.cadastrarLivro();
                    break;
                case 2:
                    bibliotecaTeste.execEmprestar();
                    break;
                case 3:
                    bibliotecaTeste.execDevolver();
                    break;
                case 4:
                    bibliotecaTeste.listarLivros();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);

    }
    void cadastrarLivro() {
        Scanner sc = new Scanner(System.in);
           System.out.println("\n======== Cadastro de Livros ========\n");
           System.out.println("Digite o Titulo do livro: ");
           String titulo = sc.nextLine();
           System.out.println("Digite o Autor do livro: ");
           String autor = sc.nextLine();
           if (titulo.isEmpty() || autor.isEmpty()) {
               System.out.println("ERRO! Titulo ou Autor Invalidos!\n");
               System.out.println("Os campos não podem estar vazios!");
               return;
           }
           Livro livro = new Livro(titulo, autor);
           listaLivros.add(livro);
           System.out.println("Livro Cadastrado com Sucesso!!\n");

    }
    void execEmprestar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Titulo do livro desejado: ");
        String procTitulo = sc.nextLine();
        for(Livro liv : listaLivros){
            if(liv.getLivro().equals(procTitulo)){
                liv.emprestar();
            }
        }
    }
    void execDevolver() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Titulo do livro desejado: ");
        String procTitulo = sc.nextLine();
        for (Livro liv : listaLivros) {
            if (liv.getLivro().equals(procTitulo)) {
                liv.devolver();
            }
        }
        System.out.println("Livro Devolvido!! \n");
    }
    void listarLivros(){
        for(Livro l : listaLivros){
            System.out.println(l);
        }
    }

}
