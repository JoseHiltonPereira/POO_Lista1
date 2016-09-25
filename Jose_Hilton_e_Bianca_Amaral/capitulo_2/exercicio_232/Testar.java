package exercicio_232;

import java.util.Scanner;

public class Testar {
	public void Numeros(){
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		int positivo=0;
		int negativo=0;
		int zero=0;
		
		while(cont<5){
			cont++;
			System.out.print("Insira o "+cont+"º número: ");
			int num = teclado.nextInt();
			if(num < 0){
				negativo++;
			}
			if(num>0){
				positivo++;
			}
			if(num ==0){
				zero++;
			}
		}
		System.out.print("Quantidade de números positivos: "+positivo+" "
				+ "\nQuandidade de números negativos: "+negativo+"\nQuantidade de zeros: "+zero);
		teclado.close();
	}
}
