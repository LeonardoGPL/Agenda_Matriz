package agenda;

import java.util.Scanner;

public class matrix_agenda {
	public static void main(String[] args) {
		Scanner batman = new Scanner(System.in);
//inserindo variaveis 
		String ag[][] = new String[10][5];// criando matriz
		int l, c;
//criando laço de repetição
		for (l = 0; l < 3; l++) {
			System.out.print("Digite seu nome: ");// exibir na tela
			ag[l][0] = batman.nextLine();// atribuindo valor digitado pelo usuario

			System.out.print("Digite seu endereço: ");
			ag[l][1] = batman.nextLine();

			System.out.print("Digite seu codigo postal: ");
			ag[l][2] = batman.nextLine();

			System.out.print("Digite seu bairro: ");
			ag[l][3] = batman.nextLine();

			System.out.print("Digite seu telefone: ");
			ag[l][4] = batman.nextLine();
		}

		System.out.printf("\n   Nome, Endereço, Codigo Postal, Bairro, Telefone	");// exibir na tela
		for (l = 0; l < 3; l++) {
			System.out.printf("\n %d", l);

			for (c = 0; c < 5; c++) {
				System.out.printf(" %s,", ag[l][c]);
			}
		}

	}
}