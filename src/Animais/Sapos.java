package Animais;

import Interfaces.Anfibio;
import Interfaces.Aquatico;
import Interfaces.Ovos;
import Interfaces.Veneno;

public class Sapos extends Animal implements Anfibio , Veneno , Ovos , Aquatico {


    public Sapos(String especie) {
        super(especie);
    }

    @Override
    public void local() {

    }

    @Override
    public void alimento() {

    }

    @Override
    public void cuidador() {

    }

    @Override
    public void sangue() {
        System.out.println("Os Sapos sao animais de Sangue Frio!");

    }

    @Override
    public void fase() {

    }

    @Override
    public void botaOvo() {

    }

    @Override
    public void veneno() {

    }

    @Override
    public void nadar() {

    }
}
