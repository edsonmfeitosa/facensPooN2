
package fundamentos;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.RecebeONome("Pedro");
        p.corDosOlhos = "castanhos";
        Pessoa p2 = new Pessoa();
        p2.RecebeONome("Edson");
        p2.corDosOlhos = "castanhos";
        System.out.println(p2.PerguntaONome(p));
        
    }
}
