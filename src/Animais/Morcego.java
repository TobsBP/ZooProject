package Animais;

import Interfaces.Mamifero;
import Interfaces.Voar;

public class Morcego extends Animal implements Voar , Mamifero {
    public Morcego(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {
        System.out.println("Os Morcegos estão localizados na Sul do Zoo!");
    }

    @Override
    public void alimento() {
        System.out.println("Os Morcegos do nosso Zoo são todos frugívoros.");

    }


    @Override
    public void sangue() {

        System.out.println("O Morcego é um animal de Sangue Quente!");
    }

    @Override
    public void mamar() {
        System.out.println("Os Morcegos podem amamentar por cerca de 4 a 12 semanas");
    }

    @Override
    public void voar() {
        System.out.println("Morcegos podem manter incríveis 12 horas de voo seguidas!");

    }
    @Override
    public void getInfo(){
        local();
        alimento();
        sangue();
        voar();
        mamar();
    }
}
