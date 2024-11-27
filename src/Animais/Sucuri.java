package Animais;

import Interfaces.Aquatico;
import Interfaces.Reptil;

public class Sucuri extends Animal implements Reptil , Aquatico {
    public Sucuri(String nome, int idade, String sexo) {

        super(nome, idade, sexo);
    }
    
    @Override
    public void local() {
        System.out.println("As Sucuris estão localizadas na parte Oeste do Zoo!");
    }

    @Override
    public void alimento() {
        System.out.println("As Sucuris sao animais carnivoros!");

    }

    @Override
    public void sangue() {
        System.out.println("A Sucuri possui Sangue Frio!");

    }

    @Override
    public void nadar() {
        System.out.println("As Sucuris possuem uma incrível capacidade de nado, podendo ficar ate 30 minutos submersas!");
    }

    @Override
    public void escamasPlacas() {
        System.out.println("As Sucuris precisam trocar de pele de tempos em tempos para poderem crescer, esse processo é chamado de ecdise.");

    }

    public void getInfo(){
        nadar();
        escamasPlacas();
    }
}
