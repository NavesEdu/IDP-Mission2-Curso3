public class ControleBonificacao {

    private double soma;
    public void regisra(Funcionario funcionario){

        double boni = funcionario.getBonificacao();
        this.soma += boni;

    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }
}
