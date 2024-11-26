import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import Animais.*;
import Exception.Erro;
import Func.DateTime;
import Funcionarios.Funcionario;

public class Main {
    public static void main(String[] args) throws Exception, Erro {
        // Caminho para o arquivo
        Path path = Paths.get("src/Infos/animais.txt");

        // Lê todas as linhas do arquivo
        List<String> dados = Files.readAllLines(path);

        // Conjunto para armazenar os animais
        Set<Animal> animais = new HashSet<>();

        DateTime dta = new DateTime();
        System.out.println("Horario:" + dta.time_dateNow());

        // Processa cada linha do arquivo
        for (String dado : dados) {
            String[] partes = dado.split(","); // Divide os dados por vírgula
            String nome = partes[0].trim(); // Nome do animal
            String sexo = partes[1].trim(); // Sexo do animal
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

        System.out.println("1- Funcionario");
        System.out.println("2- Admin");
        System.out.println("3- Sair");

        op = sc.nextInt();

        if (op == 1) {
            do {
                menuFuncionario();
                sc.nextLine(); // Quebra de linha
                op = sc.nextInt();
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

                        try {
                            Files.writeString(path, dadosAnimal, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                        } catch (NullPointerException e) {
                            throw new Erro("Dados invalidos");
                        }

                        break;
                    case 3:
                        System.out.println("Digite o nome do animal a ser removido:");
                        String nomeRemover = sc.nextLine();

                        System.out.println("Digite a idade do animal a ser removido:");
                        int idadeRemover = sc.nextInt();

                        try {
                            removerAnimal(nomeRemover, idadeRemover);
                            System.out.println("Animal removido.");
                        } catch (NullPointerException e) {
                            throw new Erro("Dados invalidos");
                        }

                        break;
                    case 4:
                        System.out.println("Sair");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (op != 5);
        } else {
            sc.nextLine(); // Quebra de linha
            do {
                menuAdmin();
                op = sc.nextInt();
                sc.nextLine(); // Quebra de linha
                switch (op) {
                    case 0:
                        System.out.println("Animais listados");
                        listarAnimais();
                        break;
                    case 1:
                        System.out.println("Adicionar animal");

                        System.out.print("Digite o nome do animal: ");
                        String nome = sc.nextLine();

                        System.out.println("Qual o sexo do animal (1 - Macho, 2 - Fêmea): ");
                        String sexo = sc.nextInt() == 1 ? "Macho" : "Fêmea";
                        sc.nextLine(); // Quebra de linha

                        System.out.println("Digite a idade do animal: ");
                        int idade = sc.nextInt();

                        String dadosAnimal = nome + "," + sexo + "," + idade + System.lineSeparator();

                        try {
                            Files.writeString(path, dadosAnimal, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                        } catch (NullPointerException e) {
                            throw new Erro("Dados invalidos");
                        }

                        break;
                    case 2:
                        System.out.println("Digite o nome do animal a ser removido:");
                        String nomeRemover = sc.nextLine();

                        System.out.println("Digite a idade do animal a ser removido:");
                        int idadeRemover = sc.nextInt();

                        try {
                            removerAnimal(nomeRemover, idadeRemover);
                            System.out.println("Animal removido.");
                        } catch (NullPointerException e) {
                            throw new Erro("Dados invalidos");
                        }

                        break;
                    case 3:
                        System.out.println("Listar funcionarios");
                        // listarFuncionario();
                        break;
                    case 4:
                        System.out.println("Demitir funcionario");
                        // demitrFuncionario();
                        break;
                    case 5:
                        System.out.println("Contratar funcionario");
                        // contratarFuncionario();
                        break;
                    case 6:
                        System.out.println("Sair");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (op != 6);
        }
        sc.close();
    }

    public static void menuFuncionario() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Listar animais");
        System.out.println("2 - Afazeres");
        System.out.println("3 - Sair");
    }

    public static void menuAdmin() {
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Listar animais");
        System.out.println("1 - Adcionar animal");
        System.out.println("2 - Remover animal");
        System.out.println("3 - Listar funcionarios");
        System.out.println("4 - Demitir funcionario");
        System.out.println("5 - Contratar funcionario");
        System.out.println("6 - Sair");
    }

    public static void menuVisitante() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Listar animais");
        System.out.println("2 - Sobre qual animal deseja aprender?");
        System.out.println("2 - Sair");
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