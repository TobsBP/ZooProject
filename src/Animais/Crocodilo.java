package Animais;

import Interfaces.Aquatico;
import Interfaces.Ovos;
import Interfaces.Reptil;

public class Crocodilo extends Animal implements Reptil , Ovos , Aquatico {
    public Crocodilo(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {

    }

    @Override
    public void alimento() {
        System.out.println("O Crocodilo é um animal carnivoro!");

    }

    @Override
    public void cuidador() {

    }

    @Override
    public void sangue() {
        System.out.println("O Sangue dos Crocodilos é Frio!");

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
