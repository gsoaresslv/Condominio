import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {

        // Conexão com o banco de dados MySQL
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<Acao> acoes = new ArrayList<Acao>();
        Scanner s = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 5) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Nova Entrada");
            System.out.println("2 - Nova Ocorrência");
            System.out.println("3 - Listar Moradores");
            System.out.println("4 - Listar Visitantes");
            System.out.println("5 - Listar Entradas");
            System.out.println("6 - Listar Ocorrências");
            System.out.println("7 - Sair");
            opcao = s.nextInt();
            s.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    // Nova entrada
                    Entrada entrada = new Entrada();
                    acoes.add(entrada);
                    break;

                case 2:
                    // Nova ocorrência
                    Ocorrencia ocorrencia = new Ocorrencia();
                    acoes.add(ocorrencia);
                    break;
            
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        s.close();
    }
}