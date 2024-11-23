package Animais;

import Interfaces.Mamifero;
import Interfaces.Terrestre;

public class Lobo extends Animal implements Terrestre , Mamifero {
    public Lobo(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    @Override
    public void local() {

    }

    @Override
    public void alimento() {
        System.out.println("O lobo é um animal carnivoro!");

    }

    @Override
    public void cuidador() {

    }

    @Override
    public void sangue() {
        System.out.println("O lobo é um animal de Sangue quente!");

    }

    @Override
    public void mamar() {

    }

    @Override
    public void terrestre() {

    }
}
