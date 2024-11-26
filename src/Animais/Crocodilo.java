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
        System.out.println("Os Crocodilos estão localizados na parte Norte do Zoo!");

    }


    @Override
    public void alimento() {
        System.out.println("O Crocodilo é um animal carnivoro!");

    }


    @Override
    public void sangue() {
        System.out.println("O Sangue dos Crocodilos é Frio!");

    }

    @Override
    public void nadar() {
        System.out.println("Os Crocodilos podem ficar até 2 horas submersos na água!");

    }

    @Override
    public void botaOvo() {
        System.out.println("Os Crocodilos podem botar ovos enormes, chegando ate a 10 cm de comprimento!");

    }

    @Override
    public void escamasPlacas() {
        System.out.println("As escamas de um Crocodilo são uma das mais resistentes do meio animal, podendo resister a impactos incríveis");

    }
}
