/*import java.util.ArrayList;
public class Pedido{

        private ArrayList <Produtos> produto = new ArrayList<>();
        private String date;
        private Usuario usuario;
        private double txEntrega;
        private double total = 0;
        private String endereco;
        private String tipoPag;
        private double frete;

        public void addProduto(Produtos produto){
            this.produto.add(produto);
        }
        public void setEndereco(String endereco){
            this.endereco = endereco;
        }
        public void setData(String date){
            this.date = date;
        }
        public void setTotal(String total){
            this.total += total;
        }
        public void setFrete(double frete){
            this.frete = frete;
        }
        public double getFrete(){
            return this.frete;
        }

        public void setPagamento(String tipoPag){
            this.tipoPag = tipoPag;
        }
        
        public void setCliente(double usuario){
            this.usuario = usuario;
        }

        
    public void comprov(){
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("                 E-Shop                 ");
        System.out.println("----------------------------------------");
        System.out.println("Cliente", this.usuario.getNome());
        System.out.println("E-mail", this.usuario.getEmail());
        System.out.println("Endereço", this.endereco);
        System.out.println("----------------------------------------");
        for(int i = 0; i < this.produto.size(); i++){
            System.out.println(this.produto.get(i).getNomeP());
            System.out.println(String.valueOf(this.produto.get(i).getPrecoP()));
        }
        System.out.println("----------------------------------------");
        System.out.println("Frete", String.valueOf(this.frete));
        System.out.println("Total", String.valueOf(this.total));
        System.out.println("----------------------------------------");
        System.out.println("Pagamento", this.pagamento);
        System.out.println("----------------------------------------");
        System.out.println("Data", this.date);
        /*public void comprov(){
            System.out.println("----------------------------------------");
            System.out.println("                 Ecomerse               ");
            System.out.println("                Nota Fiscal             ");
            System.out.println("----------------------------------------");
            for(int i=0; i<produto.size(); i++){
                System.out.println("Produto"+this.getProduto(i),getNomeP());
                System.out.println("       "+this.getProduto(i),getPrecoP());    
            }
            System.out.println("");
            System.out.println(this.produtos.getNomeP());
            System.out.println(this.usuario.getNome());
        }
*/
import java.util.ArrayList;
public class Pedido{
    private ArrayList<Produto> produtos = new ArrayList<>();
    private String data;
    private String endereco;
    private double total = 0;
    private double frete;
    private String pagamento;
    private Usuario cliente;


    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void setData(String data){
        this.data = data;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setTotal(double total){
        this.total += total;
    }

    public void setFrete(double frete){
        this.frete = frete;
    }

    public double getFrete(){
        return this.frete;
    }

    public void setPagamento(String pagamento){
        this.pagamento = pagamento;
    }

    public void setCliente(Usuario cliente){
        this.cliente = cliente;
    }


    public void imprimir(){
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("                 E-Shop                 ");
        System.out.println("----------------------------------------");
        System.out.println(this.formatar("Cliente", this.cliente.getNome()));
        System.out.println(this.formatar("E-mail", this.cliente.getEmail()));
        System.out.println(this.formatar("Endereço", this.endereco));
        System.out.println("----------------------------------------");
        for(int i = 0; i < this.produtos.size(); i++){
            System.out.println(this.formatar(this.produtos.get(i).getNomeP(), String.valueOf(this.produtos.get(i).getPreco())));
        }
        System.out.println("----------------------------------------");
        System.out.println(this.formatar("Frete", String.valueOf(this.frete)));
        System.out.println(this.formatar("Total", String.valueOf(this.total)));
        System.out.println("----------------------------------------");
        System.out.println(this.formatar("Pagamento", this.pagamento));
        System.out.println("----------------------------------------");
        System.out.println(this.formatar("Data", this.data));
    }

    private String formatar(String titulo, String item){
        String div = "----------------------------------------";
        int finalDiv = div.length() -1;
        int finalItem = titulo.length() + item.length() -1;

        while(finalDiv != finalItem && item.length() < div.length()){
            item = " " + item;
            finalItem = titulo.length() + item.length() -1;

        }
        return titulo + item;
    }

}