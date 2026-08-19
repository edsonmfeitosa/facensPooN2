
package fundamentos;

public class AreaCirculo {
    private static final double pi = 3.14159;
    private double raio;
    public static int quantidade = 0;
    
    public AreaCirculo(){
        quantidade ++;
    }
    
    public AreaCirculo(double raio){
        quantidade ++;
        this.raio = raio;
    }
    
    public static double Calcular(double raio){
        return pi * Math.pow(raio, 2);
    }
    
    public double Calcular(){
        return pi * raio * raio;
    }
    public void setRaio(Double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return this.raio;
    }
}
