package Animais;

import Interfaces.Anfibio;
import Interfaces.Aquatico;
import Interfaces.Ovos;
import Interfaces.Veneno;

public class Sapo extends Animal implements Anfibio , Veneno , Ovos , Aquatico {


    public Sapo(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }

    @Override
    public void local() {
        System.out.println("Os Sapos estão localizados na zona Norte do Zoo!");
    }

    @Override
    public void alimento() {
        System.out.println("Os Sapos sao carnivoro!");
    }

    @Override
    public void sangue() {
        System.out.println("Os Sapos sao animais de Sangue Frio!");
    }

    @Override
    public void fase() {
        System.out.println("Os Sapos possuem 3 fases de vida: ovo, girino e adulta!");

    }

    @Override
    public void botaOvo() {
        System.out.println("Os Sapos botam seus ovos na água, a falta de úmidade pode acarretar na morte do feto");
    }

    @Override
    public void veneno() {
        System.out.println("Os Sapos são venenosos, com glândulas de veneno espalhadas por toda a sua pele!");
    }

    @Override
    public void nadar() {
        System.out.println("Os Sapos, obrigatoriamente, precisam viver em um meio aquatico ou em um local extremamente úmido, ou morreram!");
    }

    @Override
    public void getInfo(){
        local();
        alimento();
        sangue();
        nadar();
        veneno();
        botaOvo();
        fase();
    }
}
