package Animais;

import Interfaces.Aves;
import Interfaces.Ovos;
import Interfaces.Voar;

public class Arara extends Animal implements Voar, Aves , Ovos {
    public Arara(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {

    }

    @Override
    public void alimento() {
        System.out.println("A arara é um animal herbivoro!");

    }

    @Override
    public void cuidador() {

    }

    @Override
    public void sangue() {
        System.out.println("As Araras sao Animais de Sangue Quente!");

    }

    @Override
    public void penagem() {

    }

    @Override
    public void botaOvo() {

    }

    @Override
    public void voar() {

    }
}
