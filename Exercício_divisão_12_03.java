package exercício_divisão;

import java.util.Scanner;

public class Exercício_divisão {

    public static void main(String[] args) {
        
        int dividendo, divisor;
        double divisao;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o dividendo: ");
        dividendo = teclado.nextInt();
        
        System.out.println("Digite o divisor: ");
        divisor = teclado.nextInt();
        
        divisao = dividendo / divisor;
        
        System.out.println("A divisão é: " + divisao);
        
    }
    
}
