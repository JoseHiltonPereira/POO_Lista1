package exercicio_230;

import java.util.Scanner;

public class SeparandoDigitos {
	
	public void Separa() {
		
		Scanner teclado = new Scanner(System.in);
		while(true){
		System.out.print("Digite um número de 5 digitos: ");
		int num = teclado.nextInt();
		
		String letra = Integer.toString(num);
		
		
		if (letra.length()==5) {


			System.out.print((num/10000)%10+"   ");
			System.out.print((num/1000)%10+"   ");
			System.out.print((num/100)%10+"   ");
			System.out.print((num/10)%10+"   ");
			System.out.print(num%10+"   ");
			break;
		}  if (letra.length()<5){ 
			System.out.println("O número digitado tem menos de 5 digitos digite novamente.");
			}
		else{
			System.out.println("O número digitado tem mais de 5 digitos digite novamente.");
		}
				
			}
		teclado.close();
		} 
		
		
		

	}


