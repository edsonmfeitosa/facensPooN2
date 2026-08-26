
package fundamentos.lista01;

import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Menu:
        1 – Criar pessoa
        2 – Mostrar pessoa
        3 – Sair
        */
        int opcao = 0;
        Scanner tec = new Scanner(System.in);
        Pessoa pe = new Pessoa();
        
        while (opcao != 3) 
        {            
            System.out.println("Menu:");
            System.out.println("1 – Criar pessoa");
            System.out.println("2 – Mostrar pessoa");
            System.out.println("3 – Sair");
            opcao = Integer.parseInt(tec.nextLine());
            switch (opcao) {
                case 1:
                    //System.out.println("Criar pessoa");
                    System.out.println("Digite o CPF");
                    pe.setCpf(tec.nextLine());
                    System.out.println("Digite o nome");
                    pe.setNome(tec.nextLine());
                    System.out.println("Digite sexo: M - Masculino | F - Feminino");
                    pe.setSexo(tec.nextLine().charAt(0));
                    System.out.println("Digite a idade");
                    pe.setIdade(Integer.parseInt(tec.nextLine()));
                    break;
                case 2:
                    System.out.println(pe.imprimir());
                    break; 
                case 3:
                    System.out.println("O sistema será fechado.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        
        tec.close();
    }
}
