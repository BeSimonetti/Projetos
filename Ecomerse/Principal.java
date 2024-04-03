/* 
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Principal{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    LocalDateTime data = LocalDateTime.now();
    DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    pedido.setData(date);

    Pedido pedido = new Pedido();
    Usuario usuario = new Usuario();
    String continuar;
    
    System.out.print("Login");
    System.out.print("Email: ");
    usuario.setEmail(sc.nextLine());
    System.out.print("Senha: ");
    usuario.setSenha(sc.nextLine());
    System.out.print("Nome: ");
    usuario.setNome(sc.nextLine());
    do{
        Produtos produtos = new Produtos();

        System.out.print("Produto: ");
        produtos.setNomeP(sc.nextLine());
        pedido.addProduto(produto);
        
        System.out.print("Preço: ");
        produtos.setPrecoP(sc.nextDouble());
        sc.nextLine();

        System.out.print("Descrição: ");
        produtos.setDescricao(sc.nextLine());

        System.out.println("Adicionar mais algum produto? Se não, digite 'não' para sair");
        continuar = sc.nextLine();
    } while (!continuar.equalsIgnoreCase("Não"));
    
    System.out.print("Informe seu endereço: ");
    pedido.setEndereco(sc.nextLine());
    System.out.print("Frete: ");
    pedido.setFrete(sc.nextDouble());
    sc.nextLine();
    sc.close();

    pedido.comprov();
    }
}*/

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Principal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Pedido pedido = new Pedido();

        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        pedido.setData(data.format(formatData));

        System.out.println("Login");

        System.out.print("Nome: ");
        usuario.setNome(input.nextLine());

        System.out.print("Email: ");
        usuario.setEmail(input.nextLine());

        System.out.print("Senha: ");
        usuario.setSenha(input.nextLine());
        System.out.println();

        pedido.setCliente(usuario);

        String continuar;
        boolean digitouErrado;
        do{
            Produto produto = new Produto();
            System.out.print("Produto: ");
            produto.setNomeP(input.nextLine());

            do{
                try{
                    System.out.print("Preço: ");
                    produto.setPreco(input.nextDouble());
                    digitouErrado = false;
                } catch (InputMismatchException e){
                    System.err.println("DIGITOU ERRADO");
                    digitouErrado = true;
                }
                input.nextLine();
            } while (digitouErrado);

            System.out.print("Descricao: ");
            produto.setDescricao(input.nextLine());

            pedido.setTotal(produto.getPreco());

            pedido.addProduto(produto);

            System.out.print("> continuar a comprar? ");
            continuar = input.nextLine();
            System.out.println();

        } while(!continuar.equalsIgnoreCase(""));

        System.out.print("Endereço: ");
        pedido.setEndereco(input.nextLine());


        do{
            try{
                System.out.print("Frete: ");
                pedido.setFrete(input.nextDouble());
                digitouErrado = false;
            } catch (InputMismatchException e){
                System.err.println("DIGITOU ERRADO");
                digitouErrado = true;
            }
            input.nextLine();
        }while (digitouErrado);

        pedido.setTotal(pedido.getFrete());
        
        System.out.print("Pagamento: ");
        pedido.setPagamento(input.nextLine());

        pedido.imprimir();
        input.close();
    }
}