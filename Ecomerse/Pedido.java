import java.util.Date;
import java.util.ArrayList;
public class Pedido{
        Date date = new Date();
        private ArrayList <String> nomeP = new ArrayList<>();
        private ArrayList <Double> precoP = new ArrayList<>();    
        private Produtos produtos;
        private Usuario usuario;
        private double txEntrega;
        private double total = 0;
        private String endereco;

        public void setEndereco(String endereco){
            this.endereco = endereco;
        }
        public String getEndereco(){
            return this.endereco;
        }
        public void adicionarPreco(Double preco){
            this.precoP.add(preco);
        }

        public void setPedido(String produto){
            resturno
        }
        public void adicionarProdutos(String nome){
            this.nomeP.add(nome);
        }
        }
        public void setTxEntrega(double txEntrega){
            this.txEntrega = txEntrega;
        }

        public void comprov(){
            System.out.println("----------------------------------------");
            System.out.println("                 Ecomerse               ");
            System.out.println("                Nota Fiscal             ");
            System.out.println("----------------------------------------");
            for(int i=0; i<produto.size(); i++){
                System.out.println("Produto"+this.getProduto(i),getNomeP());
                System.out.println("       "+this.getProduto(i),)getPrecoP();    
            }
            System.out.println("");
            System.out.println(this.produtos.getNomeP());
            System.out.println(this.usuario.getNome());
        }
    
}