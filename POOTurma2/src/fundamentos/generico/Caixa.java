package fundamentos.generico;


public class Caixa<T> {
    private T objeto;
    
    public void guardar(T objeto){
        this.objeto = objeto;
    }
    public T abrir(){
        return objeto;
    }
}
