package br.com.cod3r.builder.meal.fluentpessoa.model;

public class Pessoa {

    private String nome;
    private String cpf;
    private String estadoCivil;
    private String sexo;

    public Pessoa(String nome, String cpf, String estadoCivil, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "Pessoa [nome=" + getNome() + ", cpf=" + getCpf() + ", estadoCivil=" + getEstadoCivil() + ", sexo=" + getSexo() + "]";
    }
    
}
