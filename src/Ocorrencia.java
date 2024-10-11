import java.util.Scanner;

public class Ocorrencia extends Acao {
    String descricao;

    // Construtor caso não seja passado nenhum morador ou visitante já existentes
    public Ocorrencia(){ 
        super();
        Scanner s = new Scanner(System.in);
        System.out.println("Descreva a Ocorrência: ");
        this.descricao = s.nextLine();
        s.close();
    }

    // Construtor caso seja passado um morador, mas não um visitante já existente
    public Ocorrencia(Morador m) { 
        super(m);
        Scanner s = new Scanner(System.in);
        System.out.println("Descreva a Ocorrência: ");
        this.descricao = s.nextLine();
        s.close();
    }

    // Construtor caso seja passado um morador e um visitante já existentes
    public Ocorrencia(Morador m, Visitante v) { 
        super(m, v);
        Scanner s = new Scanner(System.in);
        System.out.println("Descreva a Ocorrência: ");
        this.descricao = s.nextLine();
        s.close();
    }
}