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
    public abstract void local();
    public abstract void alimento();
    public abstract void sangue();

    public String getNome() {
        return nome;
    }

    public abstract void getInfo();   // eu testei em um codigo a parte, TEM QUE SER ABSTRACT
    // eu preciso incerir local e alimento e sangue em cada getInfo de cada classe, se não, nao aparece o local, sangue e alimento
}
