public class TesteGerente {

    public static void main(String[] args) {

        Gerente g1 = new Gerente("edu", "teste", 4000, 12345);

        System.out.println(g1.getBonificacao());
        boolean autenticou = g1.autentica(12345);
        System.out.println(autenticou);

        Autenticavel gerente = new Gerente("edu", "teste", 4000, 4321);


    }


}
