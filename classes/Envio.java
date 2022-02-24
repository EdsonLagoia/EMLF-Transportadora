package classes;

public class Envio {
    public int remetente;
    public int mercadoria;
    public int destinatario;
    public String tipoEnvio;
    public double frete;
    
    public void addEnvio(int rem, int merc, int dest, String te, double frete){
        this.remetente = rem;
        this.mercadoria = merc;
        this.destinatario = dest;
        this.tipoEnvio = te;
        this.frete = frete;
    }
    
    public void delEnvio(){
        this.remetente = 0;
        this.mercadoria = 0;
        this.destinatario = 0;
        this.tipoEnvio = "";
        this.frete = 0.0;
    }
}
