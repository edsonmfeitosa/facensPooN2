
package fundamentos.Listas;

import java.util.ArrayList;

public class Fornecedor {
    private String nome;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    public void addProduto(Produto produto){
        produtos.add(produto);
    }
    public void removeProduto(int indice){
        produtos.remove(indice);
    }
}
