package Animais;

import Interfaces.Anfibio;
import Interfaces.Aquatico;
import Interfaces.Ovos;
import Interfaces.Veneno;

public class Salamandra extends Animal implements Anfibio , Ovos, Aquatico, Veneno {
    public Salamandra(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {

    }

    @Override
    public void alimento() {
        System.out.println("As Salamandras sao carnivoras!");

    }

    @Override
    public void cuidador() {

    }

    @Override
    public void sangue() {
        System.out.println("As Salamandras possuem Sangue Frio!");

    }

    @Override
    public void fase() {

    }

    @Override
    public void nadar() {

    }

    @Override
    public void botaOvo() {

    }

    @Override
    public void veneno() {

    }
}
