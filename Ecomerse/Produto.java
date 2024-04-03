/*import java.util.ArrayList;

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

}*/
public class Produto{
    private String nomeP;
    private double preco;
    private String descricao;

    public void setNomeP(String nome){
        this.nomeP = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getNomeP(){
        return this.nomeP;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getDescricao(){
        return this.descricao;
    }

}