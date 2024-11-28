package Funcionarios;

import java.text.StringCharacterIterator;

public class Funcionario {
    
    private String nome;
    private int idade;
    private int strick;
    public String afazeres;

    public Funcionario(String nome, int idade, String afazeres) {
         this.nome = nome;
         this.idade = idade;  
         this.afazeres = afazeres;
    }

    public void getInfoAdmin() {
        System.out.println("Funcionario: " + nome + " Idade: " + idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getAfazeres() {
        return afazeres;
    }
}