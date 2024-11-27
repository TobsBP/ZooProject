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
        System.out.println("As Araras estão localizadas na parte Sul do Zoo!");
    }

    @Override
    public void alimento() {
        System.out.println("A arara é um animal herbivoro!");

    }


    @Override
    public void sangue() {
        System.out.println("As Araras são Animais de Sangue Quente!");

    }

    @Override
    public void penagem() {
        System.out.println("As Araras são possuem penagens com cores vibrantes e variadas, como azul, vermelho e verde!");

    }

    @Override
    public void botaOvo() {
        System.out.println("As Araras são capazes de botar ovos com tonalidades variadas, como verde ou azul!");

    }

    @Override
    public void voar() {
        System.out.println("As Araras podem voar e manter voo por cerca de 2 horas seguidas!");

    }

    public void getInfo(){
        botaOvo();
        penagem();
        voar();
    }
}
