import java.util.Scanner;

public class Funcoes {

	public static boolean pegaValor(int controler) {

		Scanner in = new Scanner(System.in);
		int valor = 0;
		do{
		if (controler == 0) {
			System.out.print("Digite o valor de 'P':");
			valor = in.nextInt();
		}
		if (controler == 1) {
			System.out.print("Digite o valor de 'Q':");
			valor = in.nextInt();
		}
		if (controler == 2) {
			System.out.print("Digite o valor de 'R':");
			valor = in.nextInt();
		}
		if(valor>1 || valor<0){
			System.out.println("\nERROR: Por favor digite o numeor '1' para VERDADEIRO e '0' para FALSO.\n");
		}
		}while(valor>1 || valor<0);
		if (valor == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void intro() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nEsse programa irá resolver este problema --> Pv(Q^R)<->(PvQ)^(PvR)");
		System.out.println("Mas antes digite os valores das preposições P, Q e R.");
		System.out.println("\n\n!!!!!!Atenção!!!!!!\n\n");
		System.out.println("Para selecionar o valor VERDADEIRO: Digite o numero '1' e aperte [ENTER]");
		System.out.println("Para selecionar o valor FALSO: Digite o numero '0' e aperte [ENTER]");
		System.out.print("Aperte [ENTER] para continuar\n");
		String start = in.nextLine();
	}
	
	public static int mostraValores(boolean p, boolean q, boolean r) {
		Scanner in = new Scanner(System.in);
		System.out.println("\nAs suas escolhas ficaram desta maneira:");
		System.out.println("\nA preposição 'P' ficou com o valor:"+p);
		System.out.println("\nA preposição 'Q' ficou com o valor:"+q);
		System.out.println("\nA preposição 'R' ficou com o valor:"+r);
		System.out.println("\nVocê Confirma suas escolhas? [Digite '1' para SIM e '0' para NÃO]");
		int decision = in.nextInt();
		return decision;
	}

}
