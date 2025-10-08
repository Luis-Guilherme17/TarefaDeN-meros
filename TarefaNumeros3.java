//Olá, meu nome é Luís e esse é meu código sobre cronômetro.

package com.mycompany.tarefanumeros3;
import java.util.Scanner;

public class TarefaNumeros3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cronometro = 0;

        while (cronometro <= 0) {
            try {
                System.out.print("Digite o número que você deseja colocar no cronômetro: ");
                cronometro = scanner.nextInt();
                
            } catch (Exception e) {
                System.out.println("O valor digitado não é válido, digite outro por favor.");
                scanner.next();
                continue;
            }
        }
  
        System.out.println("Contagem: "); 
        
       for (int i = 0; i <= cronometro ; i++) {
       if (i == cronometro) {    
    }
       System.out.println(i + "s .");
    }
       
        scanner.close();
        System.out.println("Obrigado por utilizar nosso código.");
    }
  }  
