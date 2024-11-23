package Animais;

import Interfaces.Aves;
import Interfaces.Ovos;
import Interfaces.Voar;

public class Aguia extends Animal implements Voar, Ovos, Aves {
    public Aguia(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {

    }

    @Override
    public void alimento() {
        System.out.println("A aguia é um animal carnivoro!");

    }

    @Override
    public void cuidador() {

    }

    @Override
    public void sangue() {
        System.out.println("A Aguia é um animal de Sangue Quente!");

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
