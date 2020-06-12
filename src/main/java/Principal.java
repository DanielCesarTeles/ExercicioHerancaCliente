import java.util.Scanner;
/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 18:58
 * @category View
 */
public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\f");

        System.out.println("Cadastro de pessoa fisica");
        System.out.println("\nDigite o nome do cliente");
        String nome = scanner.next();
        System.out.println("\nDigite a profissão do cliente");
        String profissao = scanner.next();
        System.out.println("Digite o codigo do cliente");
        int codigoCliente =  scanner.nextInt();
        System.out.println("\nDigite o estado civíl do cliente");
        String estadoCivil = scanner.next();
        System.out.println("Digite o CPF do cliente");
        int CPF =  scanner.nextInt();
        System.out.println("\nDigite a data de nascimento do cliente");
        String dataNascimento = scanner.next();

        PessoaFisica pessoaFisica = new PessoaFisica(codigoCliente, nome, profissao, estadoCivil, CPF, dataNascimento);

        System.out.println(pessoaFisica);

        System.out.println("Cadastro de pessoa juridica");
        System.out.println("\nDigite o nome do cliente");
        String nome1 = scanner.next();
        System.out.println("\nDigite a profissão do cliente");
        String profissao1 = scanner.next();
        System.out.println("Digite o codigo do cliente");
        int codigoCliente1 =  scanner.nextInt();
        System.out.println("Digite a razão social");
        String razaoSocial = scanner.next();
        System.out.println("Digite o CNPJ");
        int CNPJ =  scanner.nextInt();
        System.out.println("Digite a inscrição");
        int inscricao = scanner.nextInt();
        System.out.println("digite a estadual");
        String estadual = scanner.next();
        System.out.println("Digite o captal inicial");
        double captalInicial = scanner.nextDouble();

        PessoaJuridica pessoaJuridica = new PessoaJuridica(codigoCliente, nome, profissao, razaoSocial, CNPJ,
                                                           inscricao, estadual, captalInicial);

        System.out.println(pessoaJuridica);



    }
}