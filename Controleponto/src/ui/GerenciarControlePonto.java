package ui;


import model.*;

import java.util.ArrayList;
import java.util.List;
/*
    Olá! Meu nome é joão Vitor Freitas!
    Este projeto foi criado sendo um desafio proposto pelo professor MAROMO.
    É um controle de ponto, gerado para controlar o horario de chegada e de saida de diversos funcionarios,
    com cargos diferentes.

 */
public class GerenciarControlePonto {
    ControlePonto ponto;
    public GerenciarControlePonto(){
        ponto = new ControlePonto();
    }
    public static void main(String[] args) {
        GerenciarControlePonto gerenciar = new GerenciarControlePonto();


        //Aqui Instanciei os 3 Funcionarios:
        Gerente carlos = new Gerente(123, "Gerente Carlos", "carlos.com.br","5123456789-10", "marci,", "123" );
        Secretaria mariana = new Secretaria(124, "Secretaria mariana", "marina.com.br", "159.852.654.88", "19999999990", "12345");
        Operador marina = new Operador(125, "Telefonista Marina", "marina@gmail.com", "987.654.321.12", 2000.00);


        // Fiz esse for pra não ficar repitindo o SLEEP diverssas vezes.
        for(int i = 0; i < 6; i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            switch (i) {
                case 0:
                    gerenciar.entrada(carlos);
                    break;
                case 1:
                    gerenciar.entrada(mariana);
                    break;
                case 2:
                    gerenciar.entrada(marina);
                    break;
                case 3:
                    gerenciar.saida(carlos);;
                    break;
                case 4:
                    gerenciar.saida(mariana);
                    break;
                case 5:
                    gerenciar.saida(marina);
                    break;
            }
        }
        gerenciar.ponto.listar();
    }

    public void entrada(Funcionario f){
        String data =  ponto.registraEntrada(f);
        System.out.println("Entrada de " + f.getNome() + "\n" + data + "\n");
    }
    public void saida(Funcionario f){
        String data =  ponto.registraSaida(f);
        System.out.println("Saida de " + f.getNome() + "\n" + data + "\n");

    }


}


