package exercicio_215;

import java.util.Scanner;

public class Aritmetica {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite dois n�meros inteiros.\nPrimeiro n�mero: ");
		
		int num1 = teclado.nextInt();
		
		System.out.print("Segundo n�mero: ");
		
		int num2= teclado.nextInt();
		
		Calculo calculo = new Calculo();
		
		calculo.soma(num1, num2);
		calculo.produto(num1, num2);
		calculo.diferenca(num1, num2);
		calculo.quociente(num1, num2);
		
		teclado.close();
	}
}
