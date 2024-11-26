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
<<<<<<< HEAD
=======
        System.out.println("Os Sapos estão localizados na zona Norte do Zoo!");
>>>>>>> 37a12ed40ff669fe7fa6e9cbb120b2d5ac7f4f36

    }

    @Override
    public void alimento() {
<<<<<<< HEAD
        System.out.println("Os Sapos sao carnivoro!");

    }

    @Override
    public void cuidador() {
=======
        System.out.println("Os Sapos são carnivoro!");
>>>>>>> 37a12ed40ff669fe7fa6e9cbb120b2d5ac7f4f36

    }

    @Override
    public void sangue() {
<<<<<<< HEAD
        System.out.println("Os Sapos sao animais de Sangue Frio!");
=======
        System.out.println("Os Sapos são animais de Sangue Frio!");
>>>>>>> 37a12ed40ff669fe7fa6e9cbb120b2d5ac7f4f36

    }

    @Override
    public void fase() {
<<<<<<< HEAD
=======
        System.out.println("Os Sapos possuem 3 fases de vida: ovo, girino e adulta!");
>>>>>>> 37a12ed40ff669fe7fa6e9cbb120b2d5ac7f4f36

    }

    @Override
    public void botaOvo() {
<<<<<<< HEAD

=======
        System.out.println("Os Sapos botam seus ovos na água, a falta de úmidade pode acarretar na morte do feto");
>>>>>>> 37a12ed40ff669fe7fa6e9cbb120b2d5ac7f4f36
    }

    @Override
    public void veneno() {
<<<<<<< HEAD
=======
        System.out.println("Os Sapos são venenosos, com glândulas de veneno espalhadas por toda a sua pele!");
>>>>>>> 37a12ed40ff669fe7fa6e9cbb120b2d5ac7f4f36

    }

    @Override
    public void nadar() {
<<<<<<< HEAD

=======
        System.out.println("Os Sapos, obrigatoriamente, precisam viver em um meio aquatico ou em um local extremamente úmido, ou morreram!");
>>>>>>> 37a12ed40ff669fe7fa6e9cbb120b2d5ac7f4f36
    }
}
