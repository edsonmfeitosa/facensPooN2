
package fundamentos;

public class Pessoa {
    public String nome;
    public String corDosOlhos;
    
    public void RecebeONome(String nome){
        this.nome = nome;
    }
    public String PerguntaONome(Pessoa pessoa){
        String resposta = "Qual é o seu nome?\n";
        resposta += pessoa.ResponderONome();
        return resposta;
    }
    public String ResponderONome(){
        return "Meu nome é "+ this.nome;
    }
}
