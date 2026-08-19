
package Revisao;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaSaida {
    public static void main(String[] args) {
        
        System.out.println("Mostra um texto no console");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = teclado.nextLine();
        System.out.println("Olá "+ nome);
        System.out.println("Qual é sua idade? ");
        int idade = Integer.parseInt(teclado.nextLine());
        System.out.println("Sua idade é "+idade);
       
        
        teclado.close();
        
        
        /*
        JOptionPane.showMessageDialog(null, "Mostra um texto na tela");
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "Olá "+ nome);
        */
    }
}
