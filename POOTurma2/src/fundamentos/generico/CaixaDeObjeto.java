package fundamentos.generico;


public class CaixaDeObjeto {
    private Object objeto;
    
    public void guardar(Object objeto){
        this.objeto = objeto;
    }
    public Object abrir(){
        return objeto;
    }
}
