package Animais;

import Interfaces.Ovos;
import Interfaces.Reptil;
import Interfaces.Terrestre;

public class Jabuti extends Animal implements Reptil , Ovos , Terrestre {
    public Jabuti(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {
        System.out.println("Os jabutis estão localizados na parte Norte do Zoo!");
    }

    @Override
    public void alimento() {
        System.out.println("Os jabutis sao animais herbivoros!");

    }

    @Override
    public void sangue() {
        System.out.println("Os jabutis possuem Sangue Frio!");

    }

    @Override
    public void botaOvo() {
        System.out.println("Os jabutis botam ovos do tamanho aproximado de uma bolinha de tênis de mesa!");

    }

    @Override
    public void escamasPlacas() {
        System.out.println("Como todo réptil, os jabutis possuem escamas por todo corpo, mas o que mais se destaca nelas é seu casco incrivelmente resistênte!");

    }

    @Override
    public void terrestre() {
        System.out.println("Os jabutis, diferentes de seus parentes, são incapazes de nadar, logo estes são exclusivamente terrestres.");

    }

    @Override
    public void getInfo(){
        local();
        alimento();
        sangue();
        terrestre();
        escamasPlacas();
        botaOvo();
    }
}
