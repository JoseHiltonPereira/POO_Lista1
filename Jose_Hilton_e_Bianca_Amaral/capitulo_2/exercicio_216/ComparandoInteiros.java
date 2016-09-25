package exercicio_216;

import java.util.Scanner;

public class ComparandoInteiros {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira dois números inteiros. \nInsira o primeiro número: ");
		int num1 = teclado.nextInt();
		System.out.print("Insira o segundo número: ");
		int num2 = teclado.nextInt();
		
		Compara compara = new Compara();
		compara.compara(num1, num2);
		teclado.close();
	}
}
