public class PessoaFisica extends Pessoa{
    private String CPF;

    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF=CPF;
    }

    @Override
    public String toString(){
        return "Nome: "+getNome()+"\nIdade: "+getIdade()+"\nTipo: pessoa fisíca "+"\nCPF: "+CPF;
    }
}
