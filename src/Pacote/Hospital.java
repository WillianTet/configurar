/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WILLIAN
 */
public class Hospital {
    private String nome;
    private String endereco;
    private int numero;
    List<Empregado> empregados;
    List<Paciente> pacientes;
    List<Apartamento> apartamentos;

    public Hospital(String nome, String endereco, int numero) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        empregados = new ArrayList();
        pacientes = new ArrayList();
        apartamentos = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Empregado> getEmpregados() {
        return null;
    }

    public void addEmpregados(Empregado empregados) {
        this.empregados.add(empregados);
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void addPacientes(Paciente pacientes) {
        this.pacientes.add(pacientes);
    }

    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(int andar, int numero, int qtdLeito, String descricao, String tipo) {
        Apartamento apartamento = new Apartamento(andar, numero, qtdLeito, descricao, tipo);
        this.apartamentos.add(apartamento);
    }
    
    
    
    
    
}
