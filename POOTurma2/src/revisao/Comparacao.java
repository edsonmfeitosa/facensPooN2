
package Revisao;


public class Comparacao {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 2;
        System.out.println(n1 == n2);
        
        String nome1 = "Edson";
        String nome2 = "Edson";
        System.out.println(nome1 == nome2);
        
        Double x1 = 2d;
        Double x2 = 2d;
        System.out.println(x1.equals(x2));
        //comparar o valor de um int com um Double
        System.out.println(x1 == n1);
    }
}
