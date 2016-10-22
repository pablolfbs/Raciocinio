import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int controler = 0;
		boolean p = true, q = true, r = true;
		
		System.out.println("\nEsse programa irá resolver este problema --> Pv(Q^R)<->(PvQ)^(PvR)");
		System.out.println("Mas antes digite os valores das preposições P, Q e R.");
		System.out.println("\n\n!!!!!!Atenção!!!!!!\n\n");
		System.out.println("Para selecionar o valor VERDADEIRO: Digite o numero '1' e aperte [ENTER]");
		System.out.println("Para selecionar o valor FALSO: Digite o numero '0' e aperte [ENTER]");
		System.out.print("Aperte [ENTER] para continuar\n");
		String start = in.nextLine();
		p = Funcoes.pegaValor(controler);
		controler += 1;
		q = Funcoes.pegaValor(controler);
		controler += 1;
		r = Funcoes.pegaValor(controler);
		
	}

}
