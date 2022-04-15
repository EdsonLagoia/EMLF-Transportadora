package classes;

public class Envio {
    protected int id;
    protected int remetente;
    protected int mercadoria;
    protected int destinatario;
    protected String tipoEnvio;
    protected double frete;
    
    public void adicionar(){}
    public static void listar(){}
    public void atualizar(){}
    public void excluir(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRemetente() {
        return remetente;
    }

    public void setRemetente(int remetente) {
        this.remetente = remetente;
    }

    public int getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(int mercadoria) {
        this.mercadoria = mercadoria;
    }

    public int getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(int destinatario) {
        this.destinatario = destinatario;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
    
}
