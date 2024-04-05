import java.util.Scanner;


public class Principal{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        OrdemServico ordemServico = new OrdemServico();
        Veiculo veiculo = new Veiculo();
        String continuar;

        System.out.println("----------------------Mecanicamentaria-----------------------");
        System.out.println("");

        System.out.print("Nome: ");
        cliente.setNome(sc.nextLine());
        
        System.out.print("Endereço: ");
        cliente.setEndereco(sc.nextLine());
       
        System.out.print("CPF: ");
        cliente.setCpf(sc.nextLine());
        
        System.out.print("Contato: ");
        cliente.setContato(sc.nextLine());

        System.out.println("");
        System.out.println("--------Descrição do veículo e suas características:-------- ");
        System.out.println("");

        System.out.print("Descrição: ");
        veiculo.setDescricaoV(sc.nextLine());

        System.out.print("Placa: ");
        veiculo.setPlaca(sc.nextLine());

        System.out.print("Ano: ");
        veiculo.setAno(sc.nextLine());

        do{            
            System.out.println("");
            System.out.println("---------------Serviços necessários neste carro------------- ");
            System.out.println("");
            
            Servicos servicos = new Servicos();
            System.out.print("Descrição: ");
            servicos.setDescricao(sc.nextLine());

            System.out.print("Valor: ");
            servicos.setValor(sc.nextDouble());
            sc.nextLine();
            ordemServico.setTotal(servicos.getValor());
            System.out.print("Tempo: ");
            servicos.setTempo(sc.nextDouble());
            sc.nextLine();
            System.out.println("Tem mais algum serviço a se fazer? Se não digite de um ENTER.");
            continuar = sc.nextLine().trim();
        } while (!continuar.equalsIgnoreCase(""));
        ordemServico.imprimir();
        sc.close();
    }
}