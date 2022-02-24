package classes;

public class Entrega {
    public int envio;
    public String statusEnvio;
    public String formaEntrega;
    public String entregador;
    public String tempo;

    public void addEnvio(int envio, String stEnvio, String frEntrega, String entregador, String tempo){
        this.envio = envio;
        this.statusEnvio = stEnvio;
        this.formaEntrega = frEntrega;
        this.entregador = entregador;
        this.tempo = tempo;
    }

    public void alterarStatus(String stEnvio){
        this.statusEnvio = stEnvio;
    }
}
