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
        System.out.println("As Aguias estão localizadas no setor Sul do Zoo!");
    }

    @Override
    public void alimento() {
        System.out.println("As Aguias são animais carnivoro!");

    }

    @Override
    public void sangue() {
        System.out.println("A Aguia é um animal de Sangue Quente!");

    }

    @Override
    public void penagem() {
        System.out.println("A penagem das Aguias variam do marrom escuro ao dourado!");

    }

    @Override
    public void botaOvo() {
        System.out.println("As Aguias são capazes de botar ovos, possuindo muitas vezes mais de 4 cm de largura!");

    }

    @Override
    public void voar() {
        System.out.println("As Aguias podem voar por mais de 8 horas seguidas!");

    }

    @Override
    public void getInfo(){
        local();
        alimento();
        sangue();
        penagem();
        botaOvo();
        voar();
    }
}
