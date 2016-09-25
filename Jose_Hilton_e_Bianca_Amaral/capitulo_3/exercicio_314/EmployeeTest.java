package exercicio_314;

public class EmployeeTest {
	
	public static void main(String[] args){
		
		
		
		Employee a = new Employee("Marcos", "Ferreira", 3000);
		System.out.println("Objeto 1:\nNome: "+ a.getNome() +"\nSobrenome: " + a.getSobrenome() +"\nSalario anual: "+  a.getSalariomensal()*12);
		
		Employee b = new Employee("Luana", "Paes", 2500);
		System.out.println("\nObjeto 2:\nNome: "+ b.getNome() +"\nSobrenome: " + b.getSobrenome() +"\nSalario anual: "+  b.getSalariomensal()*12);
	
		double objeto1 = 0.10 * (a.getSalariomensal()*12);
		objeto1 += (a.getSalariomensal()*12);
		
		double objeto2 = 0.10 * (b.getSalariomensal()*12);
		objeto2 += (b.getSalariomensal()*12);
		
		
		
		System.out.println("\nObjeto 1 com acrescimo de 10%:\nNome: "+ a.getNome() +"\nSobrenome: " + a.getSobrenome() +"\nSalario anual: "+ objeto1 );
		System.out.println("\nObjeto 2 com acrescimo de 10%:\nNome: "+ b.getNome() +"\nSobrenome: " + b.getSobrenome() +"\nSalario anual: "+ objeto2 );
	}
}
