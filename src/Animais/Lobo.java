package Animais;

import Interfaces.Mamifero;
import Interfaces.Terrestre;

public class Lobo extends Animal implements Terrestre , Mamifero {
    public Lobo(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    @Override
    public void local() {
        System.out.println("O lobo é um animal carnivoro!");
    }

    @Override
    public void alimento() {
        System.out.println("O lobo é um animal carnivoro!");

    }

    @Override
    public void sangue() {
        System.out.println("O lobo é um animal de Sangue quente!");

    }

    @Override
    public void mamar() {
        System.out.println("Os lobos normalmente amamentam seus filhotes por cerca de 6 a 8 semanas");

    }

    @Override
    public void terrestre() {
        System.out.println("Os lobos, apesar de poderem nadar por corto períodos de tempo, tendem evitar a água, preferindo o meio terrestre.");

    }

    public void getInfo(){
        terrestre();
        mamar();
    }
}
