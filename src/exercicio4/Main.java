package exercicio4;

import java.util.*;

public class Main {

    //Crie um programa que solicite ao usuário que insira uma lista de nomes.
    // Armazene esses nomes em uma List e ordene-os em ordem alfabética. Depois,
    // converta a List para um Set para remover possíveis duplicatas e exiba o
    // conjunto de nomes ordenados.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        List<String> lista = new ArrayList<>();

        System.out.println("Quantos nomes você deseja inserir?");

        int quantidade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite os nomes:");

        for (int i = 0; i < quantidade; i++) {
            String nome = sc.nextLine();
            lista.add(nome);
        }


        Collections.sort(lista);


        Set<String> conjunto = new HashSet<>(lista);

        List<String> listaSemDuplicatas = new ArrayList<>(conjunto);
        Collections.sort(listaSemDuplicatas);


        System.out.println("Conjunto de nomes ordenado e sem duplicatas: " + listaSemDuplicatas);


        sc.close();
    }
}