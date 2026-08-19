
package fundamentos;


public class AreaCirculoTeste {
    public static void main(String[] args) {
        AreaCirculo a = new AreaCirculo(10.2);
        System.out.println("Quantidade: "+a.quantidade);
        AreaCirculo b = new AreaCirculo();
        b.setRaio(5.3);
        System.out.println("A área do círculo é: "+ a.Calcular());
        System.out.println("A área do círculo é: "+ b.Calcular());
        
        
        System.out.println("Quantidade: "+b.quantidade);
        //System.out.println("Área do círculo por método estático " + 
        //        a.Calcular(4.1));
        System.out.println("Área do círculo por método estático " + 
                AreaCirculo.Calcular(4.1));
    }
}
