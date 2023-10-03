public class EditorVideo extends Funcionario{

    public EditorVideo(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }


    public double getBonificacao() {
        System.out.println("Bonificação editor");
        return 100;
    }
}
