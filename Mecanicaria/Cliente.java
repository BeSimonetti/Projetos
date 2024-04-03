public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private String contato;

    public void setNome(Strin nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setContato(Strin contato){
        this.contato = contato;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getContato(){
        return this.contato;
    }
}