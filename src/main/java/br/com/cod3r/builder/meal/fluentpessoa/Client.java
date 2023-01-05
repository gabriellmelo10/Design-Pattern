package br.com.cod3r.builder.meal.fluentpessoa;

import br.com.cod3r.builder.meal.fluentpessoa.model.Pessoa;
import br.com.cod3r.builder.meal.fluentpessoa.model.builder.PessoaBuilder;

public class Client {

    public static void main(String[] args) {
        Pessoa pessoaNome = new PessoaBuilder("1234567891011")
            .andNome("José da Silva Melo")
            .dadosPessoa();
            System.out.println(pessoaNome);

            Pessoa pessoaCPF = new PessoaBuilder("1234567891011")
                .dadosPessoa();
                System.out.println(pessoaCPF);
            
            Pessoa pessoaEstadoCivil = new PessoaBuilder("1234567891011")
                .andNome("José da Silva Melo")
                .andEstadoCivil("Solteiro(a)")
                .dadosPessoa();
                System.out.println(pessoaEstadoCivil);

            Pessoa pessoaFull = new PessoaBuilder("1234567891011")
                .andNome("José da Silva Melo")
                .andEstadoCivil("Casado")
                .andSexo("M")
                .dadosPessoa();
                System.out.println(pessoaFull);
    }
    
}
