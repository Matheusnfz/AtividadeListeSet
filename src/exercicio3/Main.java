package exercicio3;

import java.util.*;

public class Main {

    //Crie um programa que receba uma lista de números inteiros do usuário.
    // Utilize um Set para remover os números duplicados da lista e, em seguida,
    // exiba a lista original e a lista sem duplicatas.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        System.out.println("Por gentileza, digite a quantidade de números que deseja adicionar: ");

        int quantidade = sc.nextInt();

        System.out.println("Digite o número: ");
        for (int i = 0; i < quantidade; i ++){
            int resposta = sc.nextInt();
            lista.add(resposta);

        }

        Set<Integer> conjuntoSemDuplicatas = new HashSet<>(lista);

        System.out.println("Lista original: " + lista);

        System.out.println("Lista sem duplicatas: " + conjuntoSemDuplicatas);


        sc.close();

    }

}
