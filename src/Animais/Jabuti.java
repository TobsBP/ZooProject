package Animais;

import Interfaces.Ovos;
import Interfaces.Reptil;
import Interfaces.Terrestre;

public class Jabuti extends Animal implements Reptil , Ovos , Terrestre {
    public Jabuti(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {

    }

    @Override
    public void alimento() {
        System.out.println("Os jabutis sao animais herbivoros!");

    }

    @Override
    public void cuidador() {

    }

    @Override
    public void sangue() {
        System.out.println("Os jabutis possuem Sangue Frio!");

    }

    @Override
    public void botaOvo() {

    }

    @Override
    public void escamasPlacas() {

    }

    @Override
    public void terrestre() {

    }
}
