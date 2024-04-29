package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ControlePonto {
    List<RegistroPonto> listaPonto = new ArrayList<>();
    public String registraEntrada(Funcionario func){
        LocalDateTime agora = LocalDateTime.now();
        LocalDate Data = LocalDate.now();
        LocalDateTime HoraEntrada = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy \nHH:mm:ss", new Locale("pt", "BR"));
        RegistroPonto registro = new RegistroPonto(func,Data,HoraEntrada);
        listaPonto.add(registro);
        String dataFormatada = agora.format(formatador);

        return dataFormatada;
    }
    public String registraSaida(Funcionario f){

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime HoraSaida = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy \nHH:mm:ss", new Locale("pt", "BR"));
        for (RegistroPonto reg : listaPonto){
            if(reg.getFunc() == f){
                if (reg.getHoraSaida() == null) {
                    reg.setHoraSaida(HoraSaida);
                }
            }
        }
        String dataFormatada = agora.format(formatador);

        return dataFormatada;
    }

    //Esta função foi criada com o unico intuido de verificar se a lista de registros estavafuncionando:
    public void listar(){
        for(RegistroPonto reg : listaPonto){
            System.out.println(reg);
        }
    }


    public ControlePonto(){
    }
}
