import java.util.ArrayList;

public class Produtos{
    private String descricao;
    private String nome;
    private double preco;

    public void setNomeP(String nome){
        this.nome = nome;
        
    }
    public String getNomeP(){
        return this.nome;
    }

    public void setPrecoP(double preco){
        this.preco = preco;
    }
    public double getPrecoP(){
        return this.preco;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

}