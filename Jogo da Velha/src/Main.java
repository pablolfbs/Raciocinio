import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String jogador1 = null, jogador2 = null;
		int counter = 0;// DEFININDO O VALOR PR�VIO DE COUNTER PARA QUE HAJA SOMENTE 9 JOGADAS
		boolean deuvelha = false;
		String[][] tabuleiro = Utility.montaTabuleiro(3);
		
		Utility.mostraTabuleiro(tabuleiro);
		Introducao.mostraPainel();
		jogador1 = Introducao.pegaNome(jogador1);
		jogador2 = Introducao.pegaNome(jogador1);
		Introducao.confirmacao(jogador1, jogador2);
		Utility.mostraTabuleiro(tabuleiro);
		while (counter < 9) {
			// ------------------JOGADA DO PRIMEIRO JOGADOR------------------------------
			Jogadas.fazJogadaJogador1(tabuleiro,jogador1);
			counter = counter + 1;// A CADA JOGADA EU ADICIONO 1 AO CONTADOR
			deuvelha = Verifica_Ganhador.verificaJogador1(tabuleiro);//VERIFICA SE ESSA JOGADA � A JOGADA CAMPE�
			if (deuvelha == true) {
				Utility.mostraTabuleiro(tabuleiro);// O TABULEIRO AQUI � MOSTRADO PELA �LTIMA VEZ
				System.out.println("\n\n\n------>!!!PARAB�NS " + jogador1.toUpperCase().trim() + " VOC� GANHOU!!!<------");
				break;
			}
			if (counter == 9) {// VERIFICO SE A �LTIMA JOGADA � A �LTIMA
				Utility.mostraTabuleiro(tabuleiro);// O TABULEIRO AQUI � MOSTRADO PELA �LTIMA VEZ
				break;
			}
			Utility.mostraTabuleiro(tabuleiro);
			// -----------------JOGADA DO SEGUNDO JOGADOR---------------------------------
			Jogadas.fazJogadaJogador2(tabuleiro,jogador2);
			counter = counter + 1;// A CADA JOGADA EU ADICIONO 1 AO CONTADOR
			deuvelha = Verifica_Ganhador.verificaJogador2(tabuleiro);//VERIFICA SE ESSA JOGADA � A JOGADA CAMPE�
			if (deuvelha == true) {
				Utility.mostraTabuleiro(tabuleiro);// O TABULEIRO AQUI � MOSTRADO PELA �LTIMA VEZ
				System.out.println("\n\n\n------>!!!PARAB�NS " + jogador2.toUpperCase().trim() + " VOC� GANHOU!!!<------");
				break;
			}
			if (counter == 9) {// VERIFICO SE A �LTIMA JOGADA � A �LTIMA
				Utility.mostraTabuleiro(tabuleiro);// O TABULEIRO AQUI � MOSTRADO PELA �LTIMA VEZ
				break;
			}
			Utility.mostraTabuleiro(tabuleiro);
		}
		Utility.verificaDeuVelha(deuvelha);
		Utility.finalizacao();
		in.close();
	}

}
