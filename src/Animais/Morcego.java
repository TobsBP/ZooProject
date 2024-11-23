package Animais;

import Interfaces.Mamifero;
import Interfaces.Voar;

public class Morcego extends Animal implements Voar , Mamifero {
    public Morcego(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {

    }

    @Override
    public void alimento() {
        System.out.println("Os morcegos podem ser tanto herbivoros quanto carnivoros!");

    }

    @Override
    public void cuidador() {

    }

    @Override
    public void sangue() {

        System.out.println("O Morcego é um animal de Sangue Quente!");
    }

    @Override
    public void mamar() {

    }

    @Override
    public void voar() {

    }
}
