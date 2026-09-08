
package fundamentos.associacao;


public class AulaAssociacao {
    public static void main(String[] args) {
        //Motor m1 = new Motor();
        Automovel a1 = new Automovel("fusca", "branco",
        1969);
        System.out.println(a1.toString());
        a1.acelerar();
        a1.acelerar();
        a1.acelerar();
        System.out.println(a1.getMotor().getFatorPotencia());
        a1.frear();
        Automovel a2 = new Automovel(
        "Stepway", "preto", 2025);
       
        System.out.println(
        a1.getMotor().getAutomovel()
                .getMotor().getAutomovel().getMotor()
                .getFatorPotencia()
        );
        Pessoa p = new Pessoa("Matheus");
        p.setAutomovel(a1);
        System.out.println(
         p.getAutomoveis().get(0)
                .getMotor()
                .getAutomovel()
                .getDono().getNome()
        );
        System.out.println(p.toString());
    }
}
