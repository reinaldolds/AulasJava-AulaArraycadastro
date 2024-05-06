import java.util.ArrayList;
public class CadastroPessoas {
    //private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private ArrayList<PessoaFisica> pessoasfisicas = new ArrayList<>(2);
    private ArrayList<PessoaJuridica> pessoasjuridicas = new ArrayList<>();

    /*aprender como cadastrar mais de uma pessoa em um ArrayList*/



    public void cadastrarPessoa(PessoaFisica pf){
        pessoasfisicas.add(pf);
        System.out.println("Pessoa cadastrada com sucesso.");
    }
    public void listarpf(){
        for(PessoaFisica pf: pessoasfisicas){
            System.out.println("Nome: "+pf.getNome()+"\nIdade: "+pf.getIdade()+"\nCPF: "+pf.getCPF());
        }
    }
    public void cadastrarPessoa(PessoaJuridica pj){
        pessoasjuridicas.add(pj);
        System.out.println("Pessoa cadastrada com sucesso.");
    }
    public void listarpj(){
        for(PessoaJuridica pj: pessoasjuridicas){
            System.out.println("Nome: "+pj.getNome()+"\nIdade: "+pj.getIdade()+"CPF: "+pj.getCnpj());

        }
    }
}
