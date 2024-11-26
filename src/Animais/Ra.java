package Animais;

import Interfaces.Anfibio;
import Interfaces.Aquatico;
import Interfaces.Ovos;

public class Ra extends Animal implements Anfibio , Ovos , Aquatico {
    public Ra(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }


    public void alimento() {
        System.out.println("As rãs sao carnivoras!");
    }

    @Override
    public void sangue() {
        System.out.println("As rãs sao animais de Sangue Frio!");

    }

    @Override
    public void fase() {
        System.out.println("As rãs possuem 3 fases de vida: ovo, girino e adulta!");
    }

    @Override
    public void nadar() {
        System.out.println("As rãs, obrigatoriamente, precisam viver em um meio aquatico ou em um local extremamente úmido, ou morreram!");

    }

    @Override
    public void botaOvo() {
        System.out.println("As rãs botam seus ovos na água, a falta de úmidade pode acarretar na morte do feto");

    }
}
