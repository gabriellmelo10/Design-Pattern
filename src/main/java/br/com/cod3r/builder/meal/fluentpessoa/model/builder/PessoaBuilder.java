package br.com.cod3r.builder.meal.fluentpessoa.model.builder;

import br.com.cod3r.builder.meal.fluentpessoa.model.Pessoa;

public class PessoaBuilder {

    private String nome;
    private String cpf;
    private String estadoCivil;
    private String sexo;

    public PessoaBuilder(String cpf) {
        this.cpf = cpf;
    }

    public PessoaBuilder andNome(String nome){
        this.nome = nome;
        return this;
    }

    public PessoaBuilder andEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
        return this;
    }

    public PessoaBuilder andSexo(String sexo){
        this.sexo = sexo;
        return this;
    }

    public Pessoa dadosPessoa(){
        return new Pessoa(nome, cpf, estadoCivil, sexo);
    }
    
}
