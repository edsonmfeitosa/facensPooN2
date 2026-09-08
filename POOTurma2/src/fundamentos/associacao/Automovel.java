
package fundamentos.associacao;

public class Automovel {
    private String modelo;
    private String cor;
    private int ano;
    private Motor motor;
    private Pessoa dono;

    public Automovel(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = new Motor(this);
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void acelerar(){
        this.motor.setFatorPotencia(
            this.motor.getFatorPotencia() + 1);
    }
    public void frear(){
        if (this.motor.getFatorPotencia() > 1) {
            this.motor.setFatorPotencia(
                this.motor.getFatorPotencia() - 1);
        }
    }
    
    @Override
    public String toString() {
        return "Automovel{" + "modelo=" + modelo + ", cor=" + cor + 
                ", ano=" + ano + ", motor(fator de potência)=" + motor.getFatorPotencia() + '}';
    }
    
    
}
