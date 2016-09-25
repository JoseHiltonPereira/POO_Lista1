package exercicio_224;
import java.util.Scanner;

public class MaioresMenores {

    public static void main(String[] args) {
        int cont = 0;
        Scanner teclado = new Scanner(System.in);
        Testar Mm = new Testar();
        while (cont < 5){
            cont+= 1;
            System.out.print("Insira o "+cont+"º número: ");
            int num = teclado.nextInt();
            Mm.testar(num);
            
        }
        System.out.println("O maior é: "+Mm.getMaior()+"\nO menor é: "+Mm.getMenor());
        teclado.close();
    }
    
}
