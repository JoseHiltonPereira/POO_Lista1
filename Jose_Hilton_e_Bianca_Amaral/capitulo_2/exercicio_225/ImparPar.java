package exercicio_225;

import java.util.Scanner;


public class ImparPar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Resto resto = new Resto();
        System.out.print("Impar ou Par. \nDigite um número: ");
        int num = teclado.nextInt();
        resto.Descobre(num);
        teclado.close();
    }

}
