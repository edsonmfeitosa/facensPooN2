
package fundamentos.heranca;

import fundamentos.associacao.Automovel;


public class Ferrari extends Automovel implements Esportivo, Luxo{
    
    public Ferrari(String cor, int ano) {
        super(cor, ano);
    }

    @Override
    public void acelerar() {
        super.acelerar();
        super.acelerar(); 
        super.acelerar(); 
        super.acelerar(); 
        super.acelerar(); 
        super.acelerar(); 
        super.acelerar(); 
        super.acelerar(); 
        super.acelerar(); 
    }

    @Override
    public String ligaTurbo() {
        return "turbo ligado!";
    }

    @Override
    public String desligaTurbo() {
        return "turbo desligado!";
    }

    @Override
    public String ligarArCondicionado() {
        return "Ar condicionado ligado";
    }

    @Override
    public String desligarArCondicionado() {
        return "Ar condicionado desligado";
    }
    
    
    
}
