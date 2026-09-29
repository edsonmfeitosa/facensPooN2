
package fundamentos.abstrato;

public class Cachorro extends Mamifero{

    @Override
    public String falar() {
        return "Au au";
    }

    @Override
    public String mover() {
        return "com quatro patas";
    }
    
}
