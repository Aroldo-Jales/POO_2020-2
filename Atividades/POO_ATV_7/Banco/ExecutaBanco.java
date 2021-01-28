package ATV_07;
import java.util.Scanner;

public class ExecutaBanco {
	
    public static void main(String[] args) {
            Banco b = new Banco();
            Scanner scan = new Scanner(System.in);
            int opcao = 0;
		do {
                    try {
			Conta c = null;
			System.out.println("\n1- Cadastrar 2- Excluir 3- Consultar 4- Creditar 5- Debitar 6- Transferir  \n9- Sair");
			System.out.println("Digite uma opção:");
			opcao = scan.nextInt();

			switch (opcao) {
                            case 1:
                                inserir(b, scan);
                                break;
                            case 2:
                                excluir(b, scan);
                                break;
                            case 3:
                                consultar(b, scan);
                                break;
                            case 4:
                                creditar(b, scan);
                                break;
                            case 5:
                                debitar(b, scan);
                                break;
                            case 6:
                                transferir(b, scan);
                                break;
				}
			} catch (AplicacaoException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("Erro ao realizar operação.");
                        }
                } while (opcao != 9);
}
    
    private static void inserir(Banco b, Scanner scan) {
        Conta c;
        System.out.println("CADASTRAR");
	System.out.println("Digite o número:");
	String numero = scan.next();
	System.out.println("Digite o saldo inicial:");
	c = new Conta(numero, scan.nextDouble());
	b.inserir(c);
	System.out.println("Conta cadastrada com sucesso:");
    }
    
    private static void excluir(Banco b, Scanner scan) {
	String numero;
        System.out.println("EXCLUIR");
	System.out.println("Digite o número:");
	numero = scan.next();
	b.excluir(numero);
    }
    
    private static void consultar(Banco b, Scanner scan) {
	String numero;
	Conta c;
        System.out.println("CONSULTAR");
	System.out.println("Digite o número: ");
	numero = scan.next();
	c = b.consultar(numero);
	System.out.println("Número Conta: " + c.getNumero());
        System.out.println("Saldo: " + c.getSaldo());
    }
    
    private static void creditar(Banco b, Scanner scan) {
	String numero;
	Conta c;
        System.out.println("CREDITAR");
	System.out.println("Digite o número da conta:");
	numero = scan.next();
	c = b.consultar(numero);
	System.out.println("Digite o valor: ");
	c.depositar(scan.nextDouble());
	System.out.println("Saldo: " + c.getSaldo());
    }
    
    private static void debitar(Banco b, Scanner scan) {
	String numero;
        Conta c;
        System.out.println("DEBITAR");
        System.out.println("Digite o número da conta:");
        numero = scan.next();
        c = b.consultar(numero);
	System.out.println("Digite o valor:");
	b.debitar(numero, scan.nextDouble());
        System.out.println("Saldo: " + c.getSaldo());
    }
    
    private static void transferir(Banco b, Scanner scan){
	String num1;
        String num2;
        System.out.println("TRANSFERIR");
	System.out.println("Digite o número da conta de origem:");
	num1 = scan.next();
	System.out.println("Digite o número da conta de destino:");
	num2 = scan.next();
	System.out.println("Digite o valor:");
	b.transferir(num1, num2, scan.nextDouble());
        System.out.println("Saldo conta de origem: " + b.consultar(num1).getSaldo());
        System.out.println("Saldo conta de destino: " + b.consultar(num2).getSaldo());
		
    }
    
}
