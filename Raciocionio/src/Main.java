import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int controler = 0;
		boolean p = true, q = true, r = true;
		
		Funcoes.intro();
		p = Funcoes.pegaValor(controler);
		controler += 1;
		q = Funcoes.pegaValor(controler);
		controler += 1;
		r = Funcoes.pegaValor(controler);
		Funcoes.mostraValores(p,q,r);
		boolean qANDr = Equacoes.first(q,r);
		boolean pORq = Equacoes.second(p,q);
		boolean pORr = Equacoes.third(p,r);
		boolean p_OR_qANDr = Equacoes.fourth(p,qANDr);
		boolean pORq_AND_pORr = Equacoes.fiveth(pORq, pORr);
		
		
	}

}
