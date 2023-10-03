public class TesteReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente("Edu", "teste", 5000, 1234);
        //Funcionario f1 = new Funcionario("Eduardo", "teste", 3500);
        EditorVideo e1 = new EditorVideo("Edu", "teste", 3500);
        Designer d1 = new Designer("Edu", "teste", 3000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.regisra(g1);
        //controle.regisra(f1);
        controle.regisra(e1);
        controle.regisra(d1);

        System.out.println(controle.getSoma());

    }
}
