public class Gerente extends Funcionario implements Autenticavel{

    private int senha;
    private AutenticacaoUtil autenticador;

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.autenticador = new AutenticacaoUtil();
    }


    public double getBonificacao(){
        System.out.println("Bonificação gerente");
        return super.getSalario();
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public int getSenha() {
        return 0;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
}
