package Animais;

import Interfaces.Aquatico;
import Interfaces.Aves;
import Interfaces.Ovos;

public class Pinguim extends Animal implements Aves , Aquatico , Ovos {
    public Pinguim(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void alimento() {
        System.out.println("Os pinguins sao animais carnivoros!");

    }

    @Override
    public void sangue() {
        System.out.println("O pinguim é um animal de Sangue Quente!");

    }

    @Override
    public void nadar() {
        System.out.println("Os pinguins nadar por longos períodos de tempo, mas seu tempo máximo de subermsão é de 3 minutos.");

    }

    @Override
    public void penagem() {
        System.out.println("Os pinguins possuem uma penagem preta e branca com leves tons de amarelo");

    }

    @Override
    public void botaOvo() {
        System.out.println("Os pinguins são capazes de botar ovos enormes, medindo cerca de 13,5 cm x 9,5 cm!");

    }
}
