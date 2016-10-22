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

}
