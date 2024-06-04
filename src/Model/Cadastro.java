/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author André
 */
public class Cadastro {
    protected int Id;
    protected String nome;
    protected String endereco;
    protected double salario;
    protected String Pix;
    protected String CNPJ;
    protected String CPF;
    protected String Telefone;
    protected String Estadocivil;
    protected String ChavePix;
    protected String Funcao;     
    protected String Banco;

     public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }
    
  public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }
    public void setId(int Id) {
        this.Id = Id;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getChavePix() {
        return ChavePix;
    }

    public void setChavePix(String ChavePix) {
        this.ChavePix = ChavePix;
    }

    public String getPix() {
        return Pix;
    }

    public void setPix(String Pix) {
        this.Pix = Pix;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEstadocivil() {
        return Estadocivil;
    }

    public void setEstadocivil(String Estadocivil) {
        this.Estadocivil = Estadocivil;
    }
     public void setNome(String n) {
        nome = n;
    }

    public void setEndereco(String e) {
        endereco = e;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSalario() {
        return salario;
    }

    public double getsalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
