
public class Main {

	public static void main(String[] args) {
		
		int controler = 0;
		boolean p = true, q = true, r = true;
		
		System.out.println("Esse programa irá resolver este problema");
		
		p = Funcoes.pegaValor(controler);
		controler += 1;
		q = Funcoes.pegaValor(controler);
		controler += 1;
		r = Funcoes.pegaValor(controler);
		
	}

}
