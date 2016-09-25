package exercicio_316;

import java.util.Scanner;



public class HeartRatesTeste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = teclado.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = teclado.nextLine();
		
		System.out.print("Digite mes de nascimento: ");
		int mes = teclado.nextInt();
		
		System.out.print("Digite o dia de nascimento: ");
		int dia = teclado.nextInt();
		
		System.out.print("Digite o ano de nascimento: ");
		int ano = teclado.nextInt();
		
		System.out.println("Digite a data de hoje.");
		System.out.print("Digite o mes atual: ");
		int mesatual = teclado.nextInt();
		
		System.out.print("Digite o dia atual: ");
		int diaatual = teclado.nextInt();
		
		System.out.print("Digite o ano atual: ");
		int anoatual = teclado.nextInt();
		HeartRates heart = new HeartRates(nome, sobrenome, mes, dia, ano);
		
		System.out.print("\nNome: "+ heart.getNome()+"\nSobrenome: "+ 
		heart.getSobrenome()+"\nData de nascimento: "+heart.getMes()+"/"+heart.getDia()+"/"+
				heart.getAno()+"\nIdade: "+ heart.Idade(heart.getAno(), anoatual, mesatual, diaatual)+"\nFrequencia Cardiaca Maxima: "+
		heart.Calculomaxima(heart.Idade(heart.getAno(), anoatual, mesatual, diaatual)));
		System.out.printf("\nFrequencia Cardiaca Alvo: %.0f",heart.Alvo1(heart.Calculomaxima(heart.Idade(heart.getAno(), anoatual, mesatual, diaatual))));
		
		System.out.printf(" Até %.0f",heart.Alvo2(heart.Calculomaxima(heart.Idade(heart.getAno(), anoatual, mesatual, diaatual))));
		teclado.close();
	}

}
