
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Pedido pedido = new Pedido();
    Usuario usuario = new Usuario();
    String continuar;
    
    System.out.print("Email: ");
    usuario.setEmail(sc.nextLine());

    System.out.print("Senha: ");
    usuario.setSenha(sc.nextLine());
    do{
        Produtos produtos = new Produtos();

        System.out.print("Produto: ");
        produtos.setNomeP(sc.nextLine());
        pedido.setProduto(produto);
        
        System.out.print("Preço: ");
        produtos.setPrecoP(sc.nextDouble());
        sc.nextLine();

        System.out.print("Descrição: ");
        produtos.setDescricao(sc.nextLine());

        System.out.println("Adicionar mais algum produto? Se não, digite 'não' para sair");
        continuar = sc.nextLine();
    } while (!continuar.equalsIgnoreCase("Não"));
    
    System.out.print("Nome: ");
    usuario.setNome(sc.nextLine());
    System.out.print("Informe seu endereço: ");
    pedido.setEndereco(sc.nextLine());
    System.out.print("Taxa de entrega: ");
    pedido.setTxEntrega(sc.nextDouble());
    sc.nextLine();
    sc.close();

    pedido.comprov();
    }
}