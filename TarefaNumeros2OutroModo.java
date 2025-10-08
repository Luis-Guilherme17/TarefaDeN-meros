//Olá, meu nome é Luís e esse é meu código sobre pular um número.

package com.mycompany.tarefanumeros2outromodo;
import java.util.Scanner;

public class TarefaNumeros2OutroModo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        while (numero <= 0) {
            try {
                System.out.print("Digite o número que você deseja pular de 1 até 100: ");
                numero = scanner.nextInt();
                
            } catch (Exception e) {
                System.out.println("O valor digitado não é válido, digite outro por favor.");
                scanner.next();
                continue;
            }
        }
  
        System.out.println("A ordem ficou assim: ");
        
       for (int i = 1; i <= 100; i+= numero) {
        System.out.println(i + ".");
    }

        scanner.close();
        System.out.println("Obrigado por utilizar nosso código.");
    }
}  