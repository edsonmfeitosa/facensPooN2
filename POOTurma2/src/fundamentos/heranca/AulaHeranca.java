
package fundamentos.heranca;

import fundamentos.associacao.Automovel;
import fundamentos.associacao.Pessoa;

public class AulaHeranca {
    public static void main(String[] args) {
        Hb20 h = new Hb20();
        System.out.println(h.getMotor()
                .getFatorPotencia());
        System.out.println(h.getCor());
        h.acelerar();
        System.out.println(h.getMotor()
                .getFatorPotencia());
        Ferrari fer = new Ferrari("vermelha", 2026);
        fer.acelerar();
        System.out.println(fer.getMotor()
                    .getFatorPotencia());
        System.out.println(h.toString());
        Fusca f = new Fusca("branco", 1969);
        Pessoa p = new Pessoa("Lucas");
        p.setAutomovel(f);
        p.setAutomovel(h);
        System.out.println(fer.ligaTurbo());
        
        //mantém todo o comportamento da classe pai Super
        p.setAutomovel(fer);
        System.out.println(
                p.getAutomoveis().get(2).getMotor()
                .getAutomovel().getDono()
                .getAutomoveis().get(0).getCor()
        );
        for (Automovel auto : p.getAutomoveis()) {
            System.out.println(auto.getAno());
            if (auto instanceof Ferrari) {
                Ferrari o = (Ferrari) auto;
                System.out.println(o.desligaTurbo());
            }
        }
    }
}
