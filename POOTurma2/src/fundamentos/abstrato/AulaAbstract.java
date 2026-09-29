
package fundamentos.abstrato;

public class AulaAbstract {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro();
        System.out.println(cao.falar());
        System.out.println(cao.mamar());
        System.out.println(cao.respirar());
        Gato gato = new Gato();
        System.out.println(gato.falar());
        System.out.println(gato.mamar());
        System.out.println(gato.respirar());
    }
}
