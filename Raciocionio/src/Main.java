import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int controler = 0;
		boolean p = true, q = true, r = true;

		Funcoes.intro();
		int decision = 0;
		do {
			p = Funcoes.pegaValor(controler);
			controler += 1;
			q = Funcoes.pegaValor(controler);
			controler += 1;
			r = Funcoes.pegaValor(controler);
			decision = Funcoes.mostraValores(p, q, r);
			if (decision == 0) {
				System.out.println("\nEnt�o digite os valores novamente por favor");
			}
		} while (decision == 0);
		boolean qANDr = Equacoes.first(q, r);
		boolean pORq = Equacoes.second(p, q);
		boolean pORr = Equacoes.third(p, r);
		boolean p_OR_qANDr = Equacoes.fourth(p, qANDr);
		boolean pORq_AND_pORr = Equacoes.fiveth(pORq, pORr);
		boolean equacaoFinal = Equacoes.sixth(p_OR_qANDr, pORq_AND_pORr);
		Funcoes.tabela(p, q, r, qANDr, pORq, pORr, p_OR_qANDr, pORq_AND_pORr, equacaoFinal);
	}

}
