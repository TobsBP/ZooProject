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
    public void alimento() {
        System.out.println("As Salamandras são carnivoras!");

    }


    @Override
    public void sangue() {
        System.out.println("As Salamandras possuem Sangue Frio!");

    }

    @Override
    public void fase() {
        System.out.println("As Salamandras possuem uma vida em fases, sendo cerca de seus primeiros 2 a 6 meses inteiramente aquaticos!");

    }

    @Override
    public void nadar() {
        System.out.println("As Salamandras, obrigatoriamente, precisam viver em um meio aquatico ou em um local extremamente úmido, ou morreram!");

    }

    @Override
    public void botaOvo() {
        System.out.println("As Salamandras botam seus ovos na água, a falta de úmidade pode acarretar na morte do feto!");

    }

    @Override
    public void veneno() {
        System.out.println("As Salamandras são extremamente venenosas, com glândulas de veneno espalhadas por toda a sua pele!");

    }
}
