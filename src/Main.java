import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import Animais.*;
import Funcionarios.*;
import Exception.Erro;

public class Main {
    public static void main(String[] args) throws Exception, Erro {
        // Caminho para o arquivo
        Path path = Paths.get("src/Infos/animais.txt");
        Path path2 = Paths.get("src/Infos/FuncionarioStatus.txt");

        // Lê todas as linhas do arquivo
        List<String> dados = Files.readAllLines(path);
        List<String> dados2 = Files.readAllLines(path2);

        // Conjunto para armazenar os animais
        Set<Animal> animais = new HashSet<>();

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

        // Conjunto para armazenar os funcionários
        Set<Funcionario> funcionarios = new HashSet<>();

        // Processa cada linha do arquivo
        for (String dado : dados2) {
            String[] partes = dado.split(",");
            String nome = partes[0].trim();
            int idade = Integer.parseInt(partes[1].trim());
            String afazeres = partes[2].trim();
            funcionarios.add(new Funcionario(nome, idade, afazeres));
        }

        Scanner sc = new Scanner(System.in);
        int op;

        do {
            // Menu principal
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1- Funcionario");
            System.out.println("2- Admin");
            System.out.println("3- Visitante");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    // Submenu Funcionario
                    int opFuncionario;
                    do {
                        menuFuncionario();
                        opFuncionario = sc.nextInt();
                        sc.nextLine(); // Consumir quebra de linha
                        switch (opFuncionario) {
                            case 1:
                                System.out.println("Animais listados:");
                                listarAnimais(animais);
                                break;
                            case 2:
                                System.out.println("Digite seu nome para ver seus Afazeres:");
                                String nomeAfazeres = sc.nextLine();
                                funcAfazeres(funcionarios, nomeAfazeres);
                                break;
                            case 3:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (opFuncionario != 3);
                    break;

                case 2:
                    // Submenu Admin
                    int opAdmin;
                    do {
                        menuAdmin();
                        opAdmin = sc.nextInt();
                        sc.nextLine(); // Consumir quebra de linha
                        switch (opAdmin) {
                            case 0:
                                System.out.println("Animais listados:");
                                listarAnimais(animais);
                                break;
                            case 1:
                                System.out.println("Adicionar animal");
                                System.out.print("Digite o nome do animal: ");
                                String nome = sc.nextLine();

                                System.out.print("Qual o sexo do animal (1 - Macho, 2 - Fêmea): ");
                                String sexo = sc.nextInt() == 1 ? "Macho" : "Fêmea";
                                sc.nextLine(); // Consumir quebra de linha

                                System.out.print("Digite a idade do animal: ");
                                int idade = sc.nextInt();
                                sc.nextLine(); // Consumir quebra de linha

                                String dadosAnimal = nome + "," + sexo + "," + idade + System.lineSeparator();
                                try {
                                    Files.writeString(path, dadosAnimal, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                                    
                                    System.out.println("Animal adicionado com sucesso!");
                                } catch (Exception e) {
                                    System.out.println("Erro ao adicionar animal: " + e.getMessage());
                                }
                                break;

                            case 2:
                                System.out.println("Digite o nome do animal a ser removido:");
                                String nomeRemover = sc.nextLine();
                                System.out.print("Digite a idade do animal a ser removido: ");
                                int idadeRemover = sc.nextInt();
                                sc.nextLine(); // Consumir quebra de linha

                                try {
                                    removerAnimal(nomeRemover, idadeRemover);
                                    System.out.println("Animal removido com sucesso.");
                                } catch (Exception e) {
                                    System.out.println("Erro ao remover animal: " + e.getMessage());
                                }
                                break;

                            case 3:
                                System.out.println("Listar funcionários:");
                                listarFuncionarios(funcionarios);
                                break;

                            case 4:
                                System.out.print("Digite o nome do funcionário a ser demitido:");
                                String nomeRemover_func = sc.nextLine();
                                System.out.print("Digite a idade do funcionário a ser demitido: ");
                                int idadeRemover_func = sc.nextInt();
                                removerFucionario(nomeRemover_func, idadeRemover_func, funcionarios);
                                break;
                            case 5:
                                System.out.println("Contratar pessoa");
                                System.out.print("Digite o nome da pessoa: ");
                                String nome_newFunc = sc.nextLine();

                                System.out.print("Qual a idade da pessoa:");
                                int idade_newFunc = sc.nextInt();
                                sc.nextLine(); // Consumir quebra de linha

                                System.out.print("Qual a atividade da pessoa:");
                                String atividade = sc.nextLine();
                                sc.nextLine(); // Consumir quebra de linha

                                String dadosPessoa = nome_newFunc + "," + idade_newFunc + "," + atividade + System.lineSeparator();
                                try {
                                    Files.writeString(path2, dadosPessoa, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                                    System.out.println("Pessoa adicionado com sucesso!");
                                    funcionarios.add(new Funcionario(nome_newFunc, idade_newFunc, atividade));
                                } catch (Exception e) {
                                    System.out.println("Erro ao adicionar pessoa: " + e.getMessage());
                                }
                                break;
                            case 6:
                                System.out.println("Voltando ao menu principal...");
                                break;

                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (opAdmin != 6);
                    break;

                case 3:
                    // Submenu Visitante
                    int opVisitante;
                    do {
                        menuVisitante();
                        opVisitante = sc.nextInt();
                        sc.nextLine(); // Consumir quebra de linha
                        switch (opVisitante) {
                            case 1:
                                System.out.println("Animais listados:");
                                listarAnimais(animais);
                                break;
                            case 2:
                                System.out.print("Digite o nome do animal que deseja saber mais: ");
                                String nomeAnimal = sc.nextLine();
                                funcAnimais(nomeAnimal, animais);
                                break;
                            case 3:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (opVisitante != 3);
                    break;

                case 4:
                    System.out.println("Saindo... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 4);

        sc.close();
    }

    private static void menuFuncionario() {
        System.out.println("\n===== MENU FUNCIONÁRIO =====");
        System.out.println("1- Listar Animais");
        System.out.println("2- Meus afazeres");
        System.out.println("3- Voltar");
        System.out.print("Escolha uma opção: ");
    }

    private static void menuAdmin() {
        System.out.println("\n===== MENU ADMIN =====");
        System.out.println("0- Listar Animais");
        System.out.println("1- Adicionar Animal");
        System.out.println("2- Remover Animal");
        System.out.println("3- Listar Funcionários");
        System.out.println("4- Demitir Funcionário");
        System.out.println("5- Contratar Funcionário");
        System.out.println("6- Voltar");
        System.out.print("Escolha uma opção: ");
    }

    private static void menuVisitante() {
        System.out.println("\n===== MENU VISITANTE =====");
        System.out.println("1- Listar Animais");
        System.out.println("2- Buscar Informações sobre Animal");
        System.out.println("3- Voltar");
        System.out.print("Escolha uma opção: ");
    }

    public static void listarAnimais(Set<Animal> animais) {
        for (Animal animal : animais) {
            System.out.println(animal.getNome());
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

    public static void funcAnimais(String nome, Set<Animal> animais) {
        for (Animal animal : animais) {
            if (animal.getNome().equals(nome)) {
                animal.getInfo();
            }
        }
    }

    public static void listarFuncionarios(Set<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            funcionario.getInfoAdmin();
        }
    }

    public static Set<Funcionario> removerFucionario(String nome, int idade, Set<Funcionario> funcionarios) {
        try {
            Path path = Paths.get("src/Infos/FuncionarioStatus.txt");
            // Lê todas as linhas do arquivo
            List<String> linhas = Files.readAllLines(path);
            List<String> novasLinhas = new ArrayList<>();
    
            // Remove a linha que contém o nome e a idade
            for (String linha : linhas) {
                String[] dados = linha.split(",");
                String nome_fun = dados[0];
                int idade_fun = Integer.parseInt(dados[1]);
    
                // Se o nome ou a idade não corresponderem, mantenha a linha
                if (!(nome.equals(nome_fun) && idade == idade_fun)) {
                    novasLinhas.add(linha);
                }
            }

            for (Funcionario funcionario : funcionarios) {
                if (nome.equals(funcionario.getNome()) && idade == funcionario.getIdade()) {
                    funcionarios.remove(funcionario);
                } 
            }
    
            // Escreve as linhas atualizadas no arquivo
            Files.write(path, novasLinhas, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    
        } catch (IOException e) {
            System.out.println("Erro ao remover o funcionario.");
        }
        return funcionarios;
    }

    public static void funcAfazeres(Set<Funcionario> funcionarios, String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (nome.equals(funcionario.getNome())){
                System.out.println( funcionario.getAfazeres());
            }
        }
    }
}