import java.util.Calendar;
import java.util.Scanner;

public class Acao {
    Calendar data;
    String local;
    Morador morador;
    Visitante visitante;

    // Construtor caso não seja passado nenhum morador ou visitante já existentes
    public Acao(){ 
        Scanner s = new Scanner(System.in); 
        this.data = Calendar.getInstance();
        System.out.println("Digite o local: ");
        this.local = s.nextLine();
        this.morador = new Morador();
        this.visitante = new Visitante();
        s.close();
    }

    // Construtor caso seja passado um morador, mas não um visitante já existente
    public Acao(Morador m) { 
        Scanner s = new Scanner(System.in);
        this.data = Calendar.getInstance();
        System.out.println("Digite o local: ");
        this.local = s.nextLine();
        this.morador = m;
        this.visitante = new Visitante();
        s.close();
    }

    // Construtor caso seja passado um morador e um visitante já existentes
    public Acao(Morador m, Visitante v){ 
        Scanner s = new Scanner(System.in);
        this.data = Calendar.getInstance();
        System.out.println("Digite o local: ");
        this.local = s.nextLine();
        this.morador = m;
        this.visitante = v;
        s.close();
    }
}