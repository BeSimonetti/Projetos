import java.util.ArrayList;

public class OrdemServico {
    private ArrayList <Servicos> servicos = new ArrayList<>();
    Cliente cliente;
    Veiculo veiculo;
    private double total = 0;

    public void setTotal(double total){
        this.total += total;
    }
    private double getTotal(){
        return this.total;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    public Veiculo getVeiculo(){
        return this.veiculo;
    }
    public void addServico(Servicos servicos){
        this.servicos.add(servicos);
    }

    public void imprimir(){
        
    
        System.out.println("CLiente: "+this.cliente.getNome());
        System.out.println("Endereço: "+ this.cliente.getEndereco());
        System.out.println("CPF: "+this.cliente.getCpf());
        System.out.println("Contato: "+this.cliente.getContato());
        
        System.out.println("Descrição:"+ this.veiculo.getDescricaoV());
        System.out.println("Placa:"+ this.veiculo.getPlaca());
        System.out.println("Ano:"+this.veiculo.getAno());
        for(int i=0; i<this.servicos.size(); i++){
            System.out.println("Descrição:" + this.servicos.get(i).getDescricao() + String.valueOf(this.servicos.get(i).getValor()));
        }
    }
}
