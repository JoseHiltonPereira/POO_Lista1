package exercicio_224;

public class Testar {

    private int maior = 0;
    private int menor = 1000000000;
    
public void testar(int num){
        
        if (num > maior) maior = num;
        if (num < menor) menor = num;
    }

    public int getMaior() {
        return maior;
    }

    public void setMaior(int maior) {
        this.maior = maior;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }
    
}
