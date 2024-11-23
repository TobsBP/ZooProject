package Animais;

import Interfaces.Aquatico;
import Interfaces.Mamifero;
import Interfaces.Ovos;
import Interfaces.Veneno;

public class Ornitorrinco extends Animal implements Aquatico, Ovos, Mamifero , Veneno {
    public Ornitorrinco(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {

    }

    @Override
    public void alimento() {
        System.out.println("Os ornitorrincos sao animais carnivoros!");

    }

    @Override
    public void cuidador() {

    }

    @Override
    public void sangue() {

        System.out.println("O ornitorrinco é um animal de Sangue Quente!");
    }

    @Override
    public void nadar() {

    }

    @Override
    public void mamar() {

    }

    @Override
    public void botaOvo() {

    }

    @Override
    public void veneno() {

    }
}
