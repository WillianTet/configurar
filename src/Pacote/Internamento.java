/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote;

import java.util.Date;

/**
 *
 * @author WILLIAN
 */
public class Internamento {
    private Date entrada;
    private Date saida;
    private String hora;
    private String plano;
    private double valor;

    public Internamento(Date entrada, Date saida, String hora, String plano, double valor) {
        this.entrada = entrada;
        this.saida = saida;
        this.hora = hora;
        this.plano = plano;
        this.valor = valor;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
