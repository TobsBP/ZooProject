package Animais;

import Interfaces.Aquatico;
import Interfaces.Ovos;
import Interfaces.Reptil;

public class Sucuri extends Animal implements Reptil , Ovos , Aquatico {
    public Sucuri(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {

    }

    @Override
    public void alimento() {
        System.out.println("As Sucuris sao animais carnivoros!");

    }

    @Override
    public void cuidador() {

    }

    @Override
    public void sangue() {
        System.out.println("A Sucuri possui Sangue Frio!");

    }

    @Override
    public void nadar() {

    }

    @Override
    public void botaOvo() {

    }

    @Override
    public void escamasPlacas() {

    }
}
