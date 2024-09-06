package exercicio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    //Crie um programa que solicite ao usuário uma lista de palavras.
    // Armazene essas palavras em um Set para garantir que cada palavra
    // apareça apenas uma vez. Em seguida, exiba a contagem de palavras únicas
    // e liste as palavras em ordem alfabética.

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Set<String> palavras = new HashSet<>();

            System.out.println("Digite algumas palavras ou digite 'fim' para encerrar: ");

            while (true){
                String palavra = sc.nextLine();

                if (palavra.equalsIgnoreCase("fim")) {
                    break;
                }
                else{
                    palavras.add(palavra);
                }

            }

            System.out.println();

            TreeSet<String> palavrasEmOrdem = new TreeSet<>(palavras);

            System.out.println("Quantidade de palavras únicas: "+ palavrasEmOrdem.size());

            System.out.println();

            System.out.println("Palavras em ordem alfabética: ");
            for( String palavra : palavrasEmOrdem ){
                System.out.println(palavra);

            }


        }


}
