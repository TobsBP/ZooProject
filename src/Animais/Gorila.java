package Animais;

import Interfaces.Mamifero;
import Interfaces.Terrestre;

public class Gorila extends Animal implements Terrestre , Mamifero {
    public Gorila(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {
        System.out.println("Os Gorilas estão localizados na parte Leste do Zoo!");
    }

    @Override
    public void alimento() {
        System.out.println("Os Gorilas sao animais herbivoros!");

    }

    @Override
    public void sangue() {
        System.out.println("O Gorila é um animal de Sangue Quente!");

    }

    @Override
    public void mamar() {
        System.out.println("Os Gorilas normalmente amamentam seus filhotes por cerca de 2 a 3 anos.");

    }

    @Override
    public void terrestre() {
        System.out.println("Os Gorilas são animais terrestre e totalmente incapazes de nadar devido a seu peso.");

    }

    public void getInfo(){
        terrestre();
        mamar();
    }
}
