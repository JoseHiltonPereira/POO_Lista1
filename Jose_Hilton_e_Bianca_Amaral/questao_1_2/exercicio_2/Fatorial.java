package exercicio_2;

public class Fatorial{
	public void fatori(int cont1, int fatorial){
		int resultado = 1;
		System.out.print("!" + fatorial +" = ");
		while (cont1 > 1){
			System.out.print(cont1 + " * ");
			resultado *= cont1;
			cont1--;
		}
		
		System.out.println("1" + " = " + resultado);
	}
}
