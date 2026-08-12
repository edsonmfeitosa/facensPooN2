package revisao;


public class Tipos {
    public static void main(String[] args) {
        /*
        Numéricos
        Inteiros
            byte – 1 byte
            short – 2 bytes
            int – 4 bytes
            long – 8 bytes
        Reais
            float – 4 bytes
            double – 8 bytes
        Caracter
            char
        Booleano
            boolean
        */
        byte x = 1;
        short y = 2;
        x = (byte)y;
        System.out.println(y);
        
        //padrão de valor
        double num1 = 2.3;
        float num2 = 2.3f;
        
        //Inferência de tipos
        var nome = "Edson";
        System.out.println(nome);
        
        int numero = 36;
        Integer numero2 = 36;
        System.out.println(numero);
        System.out.println(numero2.toString());
        
        
    }
}
