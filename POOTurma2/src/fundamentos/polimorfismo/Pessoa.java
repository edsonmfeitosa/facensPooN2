
package fundamentos.polimorfismo;


public class Pessoa {
    private Double peso;

    public Pessoa(Double peso) {
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    /*
    public void comer(Arroz arroz){
        this.peso += arroz.getPeso();
    }
    public void comer(Feijao feijao){
        this.peso += feijao.getPeso();
    }
    public void comer(Carne carne){
        this.peso += carne.getPeso();
    }
    */
    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }
}
