//Olá, meu nome é Luís e esse é meu código sobre tabuada.

package com.mycompany.tarefanumeros;
import java.util.Scanner;

public class TarefaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        //Por conta de eu ter atribuido o valor da variavel "número" = 0, não é possivel ter a tabuada do 0 nesse código.
        
        while (numero <= 0) {
            try {
                System.out.print("Digite o número que você deseja saber a tabuada: ");
                numero = scanner.nextInt();
                
            } catch (Exception e) {
                System.out.println("O valor digitado não é válido, digite outro por favor.");
                scanner.next();
                continue;
            }
        }
  
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
        System.out.println("Obrigado por utilizar nosso código.");
    }
}  