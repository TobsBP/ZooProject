package Animais;

import Interfaces.Mamifero;
import Interfaces.Terrestre;

public class Gorila extends Animal implements Terrestre , Mamifero {
    public Gorila(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {

    }

    @Override
    public void alimento() {
        System.out.println("Os gorilas sao animais herbivoros!");

    }

    @Override
    public void cuidador() {

    }

    @Override
    public void sangue() {
        System.out.println("O Gorila é um animal de Sangue Quente!");

    }

    @Override
    public void mamar() {

    }

    @Override
    public void terrestre() {

    }
}
