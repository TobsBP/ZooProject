package Animais;

import Interfaces.Aquatico;
import Interfaces.Aves;
import Interfaces.Ovos;

public class Pinguim extends Animal implements Aves , Aquatico , Ovos {
    public Pinguim(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {

    }

    @Override
    public void alimento() {
        System.out.println("Os pinguins sao animais carnivoros!");

    }

    @Override
    public void cuidador() {

    }

    @Override
    public void sangue() {
        System.out.println("O pinguim é um animal de Sangue Quente!");

    }

    @Override
    public void nadar() {

    }

    @Override
    public void penagem() {

    }

    @Override
    public void botaOvo() {

    }
}
