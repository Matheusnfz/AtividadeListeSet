package exercicio6.application;
import exercicio6.entities.Produto;

import java.sql.SQLSyntaxErrorException;
import java.util.HashSet;
import java.util.Set;

public class Main {

    //Crie uma classe Produto com os atributos id, nome, e preco.
    // Implemente a sobrescrita dos métodos equals e hashCode de
    // maneira adequada, de modo que dois objetos Produto sejam
    // considerados iguais se tiverem o mesmo id. Em seguida, crie
    // um Set de Produto e adicione vários objetos a ele, incluindo
    // alguns com IDs repetidos. Verifique se o Set mantém apenas produtos
    // únicos, ou seja, aqueles com IDs distintos.

    public static void main(String[] args) {

        Set<Produto> produtos = new HashSet<>();

        produtos.add(new Produto(1, "Produto 1", 10));
        produtos.add(new Produto(2, "Produto 1", 20));
        produtos.add(new Produto(3, "Produto 1", 30));
        produtos.add(new Produto(4, "Produto 1", 40));
        produtos.add(new Produto(5, "Produto 1", 50));


        System.out.println("Produtos que estão no Set: ");

        for(Produto produto : produtos){
            System.out.println(produto);
        }

    }

}
