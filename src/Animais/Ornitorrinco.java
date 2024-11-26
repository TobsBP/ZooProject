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
    public void alimento() {
        System.out.println("Os ornitorrincos sao animais carnivoros!");

    }

    @Override
    public void sangue() {

        System.out.println("O ornitorrinco é um animal de Sangue Quente!");
    }

    @Override
    public void nadar() {
        System.out.println("Apesar de ser um animal adaptado a vida aquatica, os ornitorrincos podem ficar submersos por apenas 1 minuto.");
    }

    @Override
    public void mamar() {
        System.out.println("Os ornitorrincos amamentam seus filhotes por cerca de 4 meses.");

    }

    @Override
    public void botaOvo() {
        System.out.println("Os ornitorrincos são capazes de botar ovos com cerca de 2 cm de comprimento!");

    }

    @Override
    public void veneno() {
        System.out.println("Apesar dos ornitorrincos possuirem veneno, ele é incrivelmente fraco e os ornitorrincos, normalmente, apenas o usam contra outros machos na época de acasalamento.");

    }
}
