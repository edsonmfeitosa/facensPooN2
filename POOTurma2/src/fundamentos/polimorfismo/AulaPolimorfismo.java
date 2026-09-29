
package fundamentos.polimorfismo;


public class AulaPolimorfismo {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(63.0);
        //refeição
        Arroz a = new Arroz();
        a.setPeso(0.120);
        Feijao f = new Feijao();
        f.setPeso(0.70);
        Carne c = new Carne();
        c.setPeso(0.110);
        System.out.println("Peso atual: "+ p.getPeso());
        p.comer(a);
        p.comer(f);
        p.comer(c);
        System.out.println("Peso depois de comer: "+ p.getPeso());
   
    }
}
