package classes;

public class Mercadoria {
    public int remetente;
    public String mercadoria;
    public String dimensao;
    public double peso;
    public boolean fragil;

    public void cadMercadoria(int remetente, String mercadoria, String dimensao, double peso, boolean fragil){
        this.remetente = remetente;
        this.mercadoria = mercadoria;
        this.dimensao = dimensao;
        this.peso = peso;
        this.fragil = fragil;
    }
    
    public void altRemetente(int remetente){
        this.remetente = remetente;
    }    
}
