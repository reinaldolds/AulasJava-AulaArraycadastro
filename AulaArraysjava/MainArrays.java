import java.util.Scanner;
public class MainArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p = new Pessoa();
        CadastroPessoas cp = new CadastroPessoas();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        int op;
        int repetir;

        System.out.println("Menu Conta");
        System.out.println("1 - Pessoa Fisíca\n2 - Pessoa Jurídica");
        op = input.nextInt();

        switch (op){
            case 1:
                do {
                    System.out.println("Cadastro Conta Pessoa Fisíca");
                    System.out.println("Digite o Nome:");
                    input.nextLine();
                    pf.setNome(input.nextLine());
                    System.out.println("Digite a Idade:");
                    pf.setIdade(input.nextInt());
                    System.out.println("Digite o CPF:");
                    pf.setCPF(input.next());
                    input.nextLine();

                    cp.cadastrarPessoa(pf);


                    System.out.println("Deseja repetir?\n1 - Sim\n2 - Não");
                    repetir = input.nextInt();
                }while (repetir == 1);
                break;
            case 2:
                do {
                    System.out.println("Cadastro Conta Pessoa Jurídica");
                    System.out.println("Digite Nome:");
                    pj.setNome(input.nextLine());
                    System.out.println("Digite Idade:");
                    pj.setIdade(input.nextInt());
                    System.out.println("Digite CNPJ:");
                    pj.setCnpj(input.next());

                    cp.cadastrarPessoa(pj);
                    //System.out.println(pj.toString());

                    System.out.println("Deseja repetir?\n1 - Sim\n2 - Não");
                    repetir = input.nextInt();
                }while (repetir == 1);
                break;
            default:
                System.out.println("Opção inválida, Tente novamente.");

        }

        cp.listarpf();
        System.out.println("-------------------");
        //System.out.println(pf.toString());

        cp.listarpj();
        System.out.println("-------------------");
       // System.out.println(pj.toString());

    }
}
