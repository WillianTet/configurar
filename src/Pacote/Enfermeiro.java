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
public class Enfermeiro extends Empregado{
    private String corem;
    private String formacao;

    public Enfermeiro(String corem, String formacao, String nome, String endereco, int fone, String email, Date nascimento, String especialidade, double salario) {
        super(nome, endereco, fone, email, nascimento, especialidade, salario);
        this.corem = corem;
        this.formacao = formacao;
    }

    public String getCorem() {
        return corem;
    }

    public void setCorem(String corem) {
        this.corem = corem;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    
}
