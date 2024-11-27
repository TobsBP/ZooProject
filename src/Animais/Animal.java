package Animais;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String sexo;

    public Animal(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public abstract void alimento();
    public abstract void sangue();

    public String getNome() {
        return nome;
    }

    public void getInfo() {
        alimento();
        sangue();
        local();
    }
}
