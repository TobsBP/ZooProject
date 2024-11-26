import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import Animais.*;
import Exception.Erro;
import Func.DateTime;
import Funcionarios.Funcionario;

public class Main {
    public static void main(String[] args) throws Exception , Erro {
        // Caminho para o arquivo
        Path path = Paths.get("src/Infos/animais.txt");

        // Lê todas as linhas do arquivo
        List<String> dados = Files.readAllLines(path);

        // Conjunto para armazenar os animais
        Set<Animal> animais = new HashSet<>();
        Set<Funcionario> funcionarios = new HashSet<>();

            DateTime dta = new DateTime(); 
            System.out.println("Horario:" + dta.time_dateNow()); 

            Path path1 = Paths.get("src/Infos/FuncionarioStatus.txt");

            List<String> dados1 = Files.readAllLines(path1);

            for (String dado1 : dados1) {
                String[] partes = dado1.split(","); // Divide os dados por vírgula
                String nome_fun = partes[0].trim();   // Nome do Funcionario
                int  idade_fun =Integer.parseInt(partes[1].trim());   // Idade do funcionario 
                int strik = Integer.parseInt(partes[2].trim()); // quantidade de strik
            }



        // Processa cada linha do arquivo
        for (String dado : dados) {
            String[] partes = dado.split(","); // Divide os dados por vírgula
            String nome = partes[0].trim();   // Nome do animal
            String sexo = partes[1].trim();   // Sexo do animal
            int idade = Integer.parseInt(partes[2].trim()); // Idade do animal


            // Cria uma instância de Animal e adiciona ao conjunto
            switch (nome) {
                case "Lobo":
                    Lobo lobo = new Lobo(nome, idade, sexo);
                    animais.add(lobo);   
                break;
                case "Aguia":
                    Aguia aguia = new Aguia(nome, idade, sexo);
                    animais.add(aguia);   
                break;
                case "Morcego":
                    Morcego morcego = new Morcego(nome, idade, sexo);
                    animais.add(morcego);   
                break;
                case "Gorila":
                    Gorila gorila = new Gorila(nome, idade, sexo);
                    animais.add(gorila);   
                break;
                case "Arara":
                    Arara arara = new Arara(nome, idade, sexo);
                    animais.add(arara);   
                break;
                case "Sapo":
                    Sapo sapo = new Sapo(nome, idade, sexo);
                    animais.add(sapo);   
                break;
                case "Pinguim":
                    Pinguim pinguim = new Pinguim(nome, idade, sexo);
                    animais.add(pinguim);   
                break;
                case "Jabuti":
                    Jabuti jabuti = new Jabuti(nome, idade, sexo);
                    animais.add(jabuti);   
                break;
                case "Crocodilo":
                    Crocodilo crocodilo = new Crocodilo(nome, idade, sexo);
                    animais.add(crocodilo);   
                break;
                case "Ornitorrinco":
                    Ornitorrinco ornitorrinco = new Ornitorrinco(nome, idade, sexo);
                    animais.add(ornitorrinco);   
                break;
                case "Ra":
                    Ra ra = new Ra(nome, idade, sexo);
                    animais.add(ra);   
                break;
                case "Salamandra":
                    Salamandra salamandra = new Salamandra(nome, idade, sexo);
                    animais.add(salamandra);   
                break;
                default:
                    System.out.println("Animal desconhecido: " + nome);
                    break;
            }

        }

        Scanner sc = new Scanner(System.in);
        int op;
        
        do {
            menu();
            op = sc.nextInt();
            sc.nextLine(); // Quebra de linha
            switch (op) {
                case 1:
                    System.out.println("Animais listados");
                    listarAnimais();
                    break;
                case 2:
                    System.out.println("Adicionar animal");
        
                    System.out.print("Digite o nome do animal: ");
                    String nome = sc.nextLine();
                    
                    System.out.println("Qual o sexo do animal (1 - Macho, 2 - Fêmea): ");
                    String sexo = sc.nextInt() == 1 ? "Macho" : "Fêmea";
                    sc.nextLine(); // Quebra de linha
                    
                    System.out.println("Digite a idade do animal: ");
                    int idade = sc.nextInt();
                    
                    String dadosAnimal = nome + "," + sexo + "," + idade + System.lineSeparator();

                    try { // peço que de uma olhada da aqui...

                        Files.writeString(path, dadosAnimal, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                    }catch (NullPointerException e)
                    {
                        throw new Erro("Dados invalidos");
                    }  // ...ate aqui tobias e confirme que esta tudo certo

                    break;
                case 3:
                    System.out.println("Digite o nome do animal a ser removido:");
                    String nomeRemover = sc.nextLine();

                    System.out.println("Digite a idade do animal a ser removido:");
                    int idadeRemover = sc.nextInt();

                    try {  // mesmo esquema tobias...
                        removerAnimal(nomeRemover, idadeRemover);
                        System.out.println("Animal removido.");
                    }
                    catch (NullPointerException e)
                    {
                        throw new Erro("Dados invalidos");
                    } // me avisa se tiver feito errado, tenho bastante dificuldade em checked e unchecked.

                    break;
                case 4:
                    System.out.println("Alterar animal");
                    
                    break;
                case 5:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }    
        } while (op != 5);
        
        sc.close();        
}

    public static void menu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Listar animais");
        System.out.println("2 - Adcionar animal");
        System.out.println("3 - Remover animal");
        System.out.println("4 - Alterar animal");
        System.out.println("5 - Sair");
    }

    public static void listarAnimais() {
        try {
            List<String> animais = Files.readAllLines(Paths.get("src/Infos/animais.txt"));
            for (String animal : animais) {
                System.out.println(animal);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar animais: " + e.getMessage());
        }
    }

    public static void removerAnimal(String nomeAnimal, int idadeAnimal) {
        try {
            Path path = Paths.get("src/Infos/animais.txt");
            // Lê todas as linhas do arquivo
            List<String> linhas = Files.readAllLines(path);
            List<String> novasLinhas = new ArrayList<>();
    
            // Remove a linha que contém o nome e a idade
            for (String linha : linhas) {
                String[] dados = linha.split(",");
                String nome = dados[0];
                int idade = Integer.parseInt(dados[2]);
    
                // Se o nome ou a idade não corresponderem, mantenha a linha
                if (!(nome.equals(nomeAnimal) && idade == idadeAnimal)) {
                    novasLinhas.add(linha);
                }
            }
    
            // Escreve as linhas atualizadas no arquivo
            Files.write(path, novasLinhas, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    
        } catch (IOException e) {
            System.out.println("Erro ao remover o animal.");
        }
    }
    

}