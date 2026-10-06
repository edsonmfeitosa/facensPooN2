package fundamentos.generico;

public class AulaGenerica {
    public static void main(String[] args) {
        CaixaDeObjeto cx1 = new CaixaDeObjeto();
        cx1.guardar("Edson");
        System.out.println("Meu nome é "+cx1.abrir());
        
        CaixaDeObjeto cx2 = new CaixaDeObjeto();
        cx2.guardar(10);
        
        CaixaDeObjeto cx3 = new CaixaDeObjeto();
        cx3.guardar(10.2);
        Double resultado = (Integer)cx2.abrir() + (Double) cx3.abrir();
        System.out.println("Soma: "+ resultado);
        
        //Tipos Genéricos
        Caixa cx4 = new Caixa();
        cx4.guardar(44f);
        System.out.println(cx4.abrir());
        
        Caixa<Integer> caixaDeInteiro = new Caixa<>();
        caixaDeInteiro.guardar(123);
        System.out.println(caixaDeInteiro.abrir());
       
        //Tipos Genérico com Herança
        CaixaDeDouble cx5 = new CaixaDeDouble();
        
        CaixaDeNumeros<Float> cxN = new CaixaDeNumeros<>();
        cxN.guardar(17.8f);
        System.out.println("Número float: "+cxN.abrir());
        
        CaixaDeNumeros cxN2 = new CaixaDeNumeros();
        cxN2.guardar("teste");
        System.out.println(cxN2.abrir());
        
    }
}
