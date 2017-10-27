/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote;

import java.util.*;

/**
 *
 * @author WILLIAN
 */
public class Apartamento {
   private int andar;
   private int numero;
   private int qtdLeito;
   private String descricao;
   private String tipo;
   private List<Leito> leitos;

    public Apartamento(int andar, int numero, int qtdLeito, String descricao, String tipo) {
        this.andar = andar;
        this.numero = numero;
        this.qtdLeito = qtdLeito;
        this.descricao = descricao;
        this.tipo = tipo;
        this.leitos = new ArrayList();
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQtdLeito() {
        return qtdLeito;
    }

    public void setQtdLeito(int qtdLeito) {
        this.qtdLeito = qtdLeito;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Leito> getLeitos() {
        return leitos;
    }

    public void addLeitos(int numero, String descricao, String tipo) {
        Leito leito = new Leito(numero, descricao, tipo);
        this.leitos.add(leito);
    }
    
   
   
    
    
}
