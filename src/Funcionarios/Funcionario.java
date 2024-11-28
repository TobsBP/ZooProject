package Funcionarios;

public class Funcionario {
    
    private String nome;
    private int idade;
    private int strick;
    private int senha;

    public Funcionario(String nome, int idade , int strick, int senha){
         this.nome = nome;
         this.idade = idade;  
         this.strick = strick; 
         this.senha = senha;
    }

    public void getInfoAdmin() {
        System.out.println("Funcionario: " + nome + " Idade: " + idade + " Strick: " + strick + " Senha: " + senha);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

}