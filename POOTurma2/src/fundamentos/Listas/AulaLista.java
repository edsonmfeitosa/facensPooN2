
package fundamentos.Listas;

import java.util.ArrayList;

public class AulaLista {
    public static void main(String[] args) {
        /*
        //Array
        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        System.out.println(numeros[2]);
        System.out.println("tamanho do array: "+ 
                numeros.length);
        //numeros[3] = 10;
        
        //estrutura de repetição no array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        //estrutura para cada
        for (int numero : numeros) {
            System.out.println("---->"+ numero);
        }
        //chefe mandou colocar o número 10 no array
        int[] novoArray = new int[4];
        for (int i = 0; i < numeros.length; i++) {
            novoArray[i] = numeros[i]; 
        }
        novoArray[3] = 10;
       
        //Lista
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Edson");
        nomes.add("Renata");
        nomes.add("Victor");
        nomes.add("Vinícius");
        System.out.println(nomes);
        nomes.add(1, "Daniela");
        System.out.println(nomes);
        if (nomes.contains("Renata")) {
            System.out.println("A Renata está na lista");
        }
        System.out.println(nomes.get(1));
        System.out.println("Posição do Edson na lista: "+
                nomes.indexOf("Edson"));
        //excluir objetos da lista
        nomes.remove("Edson");
        System.out.println(nomes);
        nomes.remove(1);
        System.out.println(nomes);
        */
        Produto p1 = new Produto();
        p1.setNome("caneta");
        p1.setValor(3.5);
        p1.setDesconto(0);
        
        Produto p2 = new Produto();
        p2.setNome("lápis");
        p2.setValor(2.5);
        p2.setDesconto(0.5);
        
        Fornecedor f = new Fornecedor();
        f.setNome("Bic");
        f.addProduto(p1);
        f.addProduto(p2);
        
        Produto p3 = new Produto();
        p3.setNome("notebook");
        p3.setValor(5500);
        p3.setDesconto(0);
        
        Fornecedor f2 = new Fornecedor();
        f2.setNome("HP");
        f2.addProduto(p3);
        
        ArrayList<Fornecedor> fornecedores = 
                new ArrayList<>();
        fornecedores.add(f);
        fornecedores.add(f2);
        //estrutura de repetição para 
        //mostrar os fornecedores e produtos
        for (Fornecedor forn : fornecedores) {
            System.out.println("Nome: "+ forn.getNome());
            for (Produto produto : forn.getProdutos()) {
                System.out.println("--->Nome do produto: "+
                        produto.getNome());
                System.out.println("--->Valor do produto: "+
                        produto.getValor());
            }
        }
    }
}
