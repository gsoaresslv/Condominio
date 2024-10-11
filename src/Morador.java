import java.util.Scanner;

public class Morador extends Pessoa {
    String apartamento;

    public Morador() {
        super();
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o apartamento: ");
        this.apartamento = s.nextLine();
        s.close();
    }
}