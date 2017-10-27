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
public class Empregado {
    private String nome;
    private String endereco;
    private int fone;
    private String email;
    private Date nascimento;
    private String especialidade;
    private double salario;

    public Empregado(String nome, String endereco, int fone, String email, Date nascimento, String especialidade, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.email = email;
        this.nascimento = nascimento;
        this.especialidade = especialidade;
        this.salario = salario;
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

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    

    
}
