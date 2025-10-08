//Olá, meu nome é Luís e esse é meu código sobre tirar números múltiplos de uma ordem.

package com.mycompany.tarefanumeros4;
import java.util.Scanner;

public class TarefaNumeros4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Venha conferir a ordem dos 30 primerios números sem os múltiplos de 4!!");
        
        System.out.println("A ordem ficou assim: ");
        
       for (int i = 1; i <= 30; i++) {
       if (i % 4 == 0) {
        continue;
    }
        System.out.println( i + ".");
    }

        scanner.close();
        System.out.println("Obrigado por utilizar nosso código.");
    }
}  
