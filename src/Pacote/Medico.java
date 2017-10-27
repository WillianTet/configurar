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
public class Medico extends Empregado{
    private String crm;

    public Medico(String crm, String nome, String endereco, int fone, String email, Date nascimento, String especialidade, double salario) {
        super(nome, endereco, fone, email, nascimento, especialidade, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
    
    
    
}
