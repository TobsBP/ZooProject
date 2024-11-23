package Animais;

import Interfaces.Anfibio;
import Interfaces.Aquatico;
import Interfaces.Ovos;

public class Ra extends Animal implements Anfibio , Ovos , Aquatico {
    public Ra(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {

    }

    public void alimento() {
        System.out.println("As ras sao carnivoras!");
    }

    @Override
    public void cuidador() {

    }

    @Override
    public void sangue() {
        System.out.println("As ras sao animais de Sangue Frio!");

    }

    @Override
    public void fase() {

    }

    @Override
    public void nadar() {

    }

    @Override
    public void botaOvo() {

    }
}
