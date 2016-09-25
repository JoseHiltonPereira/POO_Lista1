package exercicio_2;
import java.util.Scanner;

public class Exercicio_2 {
	public static void main (String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número para obter seu fatorial: ");
		
		int fatorial = teclado.nextInt();
		
		
		Fatorial fat = new Fatorial();
		
		fat.fatori(fatorial, fatorial);
		teclado.close();
	}
	
	
	
}