import java.util.Scanner;


public class Principal{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        Serviços servicos = new Serviços();
        OrdemServiço ordemServiço = new OrdemServiço();
        Veiculo veiculo = new Veiculo();
        
        System.out.println("Nome    : ");
        cliente.setNome(sc.nextLine());
        System.out.println("Endereço: ");
        cliente.setEndereco(sc.nextLine());
        System.out.println("CPF     : ");
        cliente.setCpf(sc.nextLine());
        System.out.println("Contato : ");
        cliente.setContato(sc.nextLine());

    }
}