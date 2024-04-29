package model;

import model.Funcionario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto{
    private long idRegistroPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public long getIdRegistroPonto() {
        return idRegistroPonto;
    }
    public void setIdRegistroPonto(long idRegistroPonto) {
        this.idRegistroPonto = idRegistroPonto;
    }

    public Funcionario getFunc() {
        return func;
    }
    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }
    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }
    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public RegistroPonto(Funcionario func, LocalDate dataRegistro, LocalDateTime horaEntrada) {
        this.idRegistroPonto++;
        this.func = func;
        this.dataRegistro = dataRegistro;
        this.horaEntrada = horaEntrada;
        this.horaSaida = null;
    }
    public RegistroPonto(LocalDateTime horaSaida){
        this.horaSaida = horaSaida;
    }
    public RegistroPonto(){
    }

    //Criei esta função apenas para testar se o Registro de ponto estava funcionando corretamente.
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n========== RegistroPonto ==========");
        sb.append("\nid: ").append(idRegistroPonto);
        sb.append("\nfunc: ").append(func);
        sb.append("\ndataRegistro: ").append(dataRegistro);
        sb.append("\nhoraEntrada: ").append(horaEntrada);
        sb.append("\nhoraSaida: ").append(horaSaida);
        sb.append('\n');
        return sb.toString();
    }


}
