import java.util.Scanner;

public class Pessoa {
    String nome, cpf, rg;

    public Pessoa() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        this.nome = s.nextLine();
        System.out.println("Digite o CPF: ");
        this.cpf = s.nextLine();
        System.out.println("Digite o RG: ");
        this.rg = s.nextLine();
        s.close();
    }
}