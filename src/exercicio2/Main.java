package exercicio2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    // Escreva um programa que solicite ao usuário dois conjuntos (Set) de
    // números inteiros. Verifique se o segundo conjunto é um
    // subconjunto do primeiro, ou seja, se todos os elementos do segundo
    // conjunto estão presentes no primeiro. Exiba uma mensagem indicando o
    // resultado da verificação.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        System.out.println("Digite a quantidade de elementos do primeiro conjunto: ");
        int tamanhoConjunto1 = sc.nextInt();

        System.out.println("Digite os elementos do primeiro conjunto: ");
        for ( int i = 0; i < tamanhoConjunto1; i ++){
            System.out.println("Elemento " + i + ": ");
            int valor = sc.nextInt();
            conjunto1.add(valor);
        }

        System.out.println("Agora digite a quantidade de elementos do segundo conjunto: ");
        int tamanhoConjunto2 = sc.nextInt();

        System.out.println("Digite os elementos do primeiro conjunto: ");
        for ( int i = 0; i < tamanhoConjunto2; i++){
            System.out.println("Elemento " + i + ": ");
            int valor = sc.nextInt();
            conjunto2.add(valor);

        }

        boolean isSubconjunto = conjunto1.containsAll(conjunto2);

        if(isSubconjunto){
            System.out.println("O segundo conjunto é o subconjunto do primeiro");
        }
        else {
            System.out.println("O segundo conjunto não é o subconjunto do primeiro");
        }

        sc.close();

    }

}
