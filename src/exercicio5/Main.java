package exercicio5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        System.out.println("Digite a quantidade de números que deseja no primeiro conjunto: ");

        int quantidade1  = sc.nextInt();

        System.out.println("Digite os números: ");
        for(int i = 0; i< quantidade1; i++){
            int resposta1 = sc.nextInt();
            conjunto1.add(resposta1);

        }


        System.out.println("Agora digite a quantindade de números que deseja no segundo conjunto: ");

        int quantidade2 = sc.nextInt();

        System.out.println("Digite os números: ");
        for (int i = 0; i < quantidade2; i ++){
            int resposta2 = sc.nextInt();
            conjunto2.add(resposta2);
        }


        Set<Integer> uniao = new HashSet<>(conjunto1);
        uniao.addAll(conjunto2);

        Set<Integer> interseccao = new HashSet<>(conjunto2);
        interseccao.retainAll(conjunto2);

        System.out.println("União dos conjuntos: " + uniao);
        System.out.println("Interseção dos conjuntos: " + interseccao);

        sc.close();



    }

}