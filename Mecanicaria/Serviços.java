import java.time.LocalDateTime;

public class Serviços {
    private double valor;
    private LocalDateTime date = LocalDateTime.now();
    private String descricao;
    private double tempo;

    public void setValor(double valor){
        this.valor = valor;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setTempo(double tempo){
        this.tempo = tempo;
    }
    public double getValor(){
        return this.valor;
    }
    public String getDescricao(){
        return this.descricao;     
    }
    public double getTempo(){
        return this.tempo;
    }
}