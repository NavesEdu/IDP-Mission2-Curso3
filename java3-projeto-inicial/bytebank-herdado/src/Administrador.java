public class Administrador extends Funcionario implements Autenticavel{

    private int senha;
    private AutenticacaoUtil autenticador;

    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 50;
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
