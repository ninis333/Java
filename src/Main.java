<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao= 0;

        while (opcao != 5) {
            System.out.println("----MENU----");
            System.out.println("1- Cadastar nome");
            System.out.println("2- Listar nomes");
            System.out.println("3- Atualizar um nome");
            System.out.println("4- Excluir um nome");
            System.out.print("5- Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite seu nome:");
                    String nome = scanner.nextLine();
                    nomes.add(nome);
                    System.out.println("Nome cadastrado com sucesso!");
                    break;

                case 2:
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum nome cadastrado");
                    }
                    else {
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println(i + "-" + nomes.get(i));
                        }
                }
                    break;

                case 3:
                    if(nomes.isEmpty()){
                        System.out.println("Lista vazia");
                    }
                    else {
                        System.out.println("Digite o indice do nome desejado para atualizar");
                        int indice = scanner.nextInt();
                        scanner.nextLine();

                        if (indice >= 0 && indice < nomes.size()){
                            System.out.println("Digite o nome novo:");
                            String novoNome = scanner.nextLine();
                            nomes.set(indice, novoNome);
                            System.out.println("Nome atualizado com sucesso");
                        }
                        else{
                            System.out.println("indice inválido");
                        }

                    }
                    break;

                case 4:
                    if(nomes.isEmpty()){
                        System.out.println("Lista vazia");
                    }
                    else {
                        System.out.println("Digite o indice do nome desejado para Excluir");
                        int indice = scanner.nextInt();

                        if (indice >= 0 && indice < nomes.size()){
                            nomes.remove(indice);
                            System.out.println("Nome excluido com sucesso");
                        }
                        else{
                            System.out.println("indice inválido");
                        }

                    }
                    break;

                case 5:
                    System.out.println("Saindo..");
                    break;

                default:
                    System.out.println("Opção inválida");

            }
        }

        scanner.close();

    }

=======
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
>>>>>>> 4cfef8da5d42126ee4612bc3e8c2c38b09031fa5
}