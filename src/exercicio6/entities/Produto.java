package exercicio6.entities;

import java.util.Objects;

public class Produto {

    private int id;
    private String name;
    private double preco;

    public Produto(){

    }

    public Produto(int id, String name, double preco) {
        this.id = id;
        this.name = name;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produto produto = (Produto) obj;
        return id == produto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preco=" + preco +
                '}';
    }
}
