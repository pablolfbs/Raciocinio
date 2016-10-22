import java.util.Scanner;

public class Funcoes {

	public static boolean pegaValor(int controler) {

		Scanner in = new Scanner(System.in);
		int valor;

		if (controler == 0) {
			System.out.print("Digite o valor de 'P':");
			valor = in.nextInt();
			if (valor == 1) {
				return true;
			} else {
				return false;
			}
		}
		if (controler == 1) {
			System.out.print("Digite o valor de 'Q':");
			valor = in.nextInt();
			if (valor == 1) {
				return true;
			} else {
				return false;
			}
		}
		if (controler == 2) {
			System.out.print("Digite o valor de 'R':");
			valor = in.nextInt();
			if (valor == 1) {
				return true;
			} else {
				return false;
			}
		}
		
	return true;
	}
	
	public static void intro(){
		Scanner in = new Scanner (System.in);
		System.out.println("\nEsse programa irá resolver este problema --> Pv(Q^R)<->(PvQ)^(PvR)");
		System.out.println("Mas antes digite os valores das preposições P, Q e R.");
		System.out.println("\n\n!!!!!!Atenção!!!!!!\n\n");
		System.out.println("Para selecionar o valor VERDADEIRO: Digite o numero '1' e aperte [ENTER]");
		System.out.println("Para selecionar o valor FALSO: Digite o numero '0' e aperte [ENTER]");
		System.out.print("Aperte [ENTER] para continuar\n");
		String start = in.nextLine();
	}

}

