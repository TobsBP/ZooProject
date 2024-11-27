package Visitante;

import Animais.*;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Visitantes {
    Aguia aguiaINFO = new Aguia("Aguia", 1, "macho");
    Arara araraINFO = new Arara("Arara", 2, "macho");
    Crocodilo crocodiloINFO = new Crocodilo("Crocodilo", 3, "macho");
    Gorila gorilaINFO = new Gorila("Gorila", 4, "macho");
    Jabuti jabutiINFO = new Jabuti("Jabuti", 5, "macho");
    Lobo loboINFO = new Lobo("Lobo", 6, "macho");
    Morcego morcegoINFO = new Morcego("Morcego", 7, "macho");
    Ornitorrinco ornitorrincoINFO = new Ornitorrinco("Ornitorrinco", 8, "macho");
    Pinguim pinguimINFO = new Pinguim("Pinguim", 9, "macho");
    Ra raINFO = new Ra("Ra", 10, "macho");
    Salamandra salamandraINFO = new Salamandra("Salamandra", 11, "macho");
    Sapo sapoINFO = new Sapo("Sapo", 12, "macho");
    Sucuri sucuriINFO = new Sucuri("Sucuri", 13, "macho");
    Set<Animal> animaisInfo = new HashSet<>();
    int escolha;
    Scanner sc = new Scanner(System.in);

            System.out.println("Olá, seja muito bem-vindo ao nosso Zoo!");
            System.out.println("Hoje estamos com uma variedade de animais! Quais você gostaria de ver?");
            while(true){
        System.out.println("Escolha uma opcao: ");
        System.out.println("1 - Aguia");
        System.out.println("2 - Arara");
        System.out.println("3 - Crocodilo");
        System.out.println("4 - Gorila");
        System.out.println("5 - Jabuti");
        System.out.println("6 - Lobo");
        System.out.println("7 - Morcego");
        System.out.println("8 - Ornitorrinco");
        System.out.println("9 - Pinguim");
        System.out.println("10 - Salamandra");
        System.out.println("11 - Sapo");
        System.out.println("12 - Sucuri");
        escolha = sc.nextInt();
        if(escolha == 1){
            animaisInfo.add(aguiaINFO);
        }
        else if(escolha == 2){
            animaisInfo.add(araraINFO);
        }
        else if(escolha == 3){
            animaisInfo.add(crocodiloINFO);
        }
        else if(escolha == 4){
            animaisInfo.add(gorilaINFO);
        }
        else if(escolha == 5){
            animaisInfo.add(jabutiINFO);
        }
        else if(escolha == 6){
            animaisInfo.add(loboINFO);
        }
        else if(escolha == 7){
            animaisInfo.add(morcegoINFO);
        }
        else if(escolha == 8){
            animaisInfo.add(ornitorrincoINFO);
        }
        else if(escolha == 9){
            animaisInfo.add(pinguimINFO);
        }
        else if(escolha == 10){
            animaisInfo.add(salamandraINFO);
        }
        else if(escolha == 11){
            animaisInfo.add(sapoINFO);
        }
        else if(escolha == 12){
            animaisInfo.add(sucuriINFO);
        }
        else
        {
            System.out.println("Opção não encontrada.");
        }
        System.out.println("Gostaria de escolher outro animal? (Digite 0 para Não, digite qualquer outro número para Sim). ");
        escolha = sc.nextInt();
        if(escolha == 0){
            break;
        }

    }
        System.out.println("Muito bom! Aqui estão as informações e algumas curiosidades dos animais que você escolheu:");

        for(Animal animal : animaisInfo){
        animal.getInfo();
        System.out.println("");
    }

        System.out.println("Dvirta-se em seu passeio!");
        sc.close();
}
