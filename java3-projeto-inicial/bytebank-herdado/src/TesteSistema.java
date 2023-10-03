public class TesteSistema {

    public static void main(String[] args) {

        Gerente g = new Gerente("edu", "teste", 4000, 2222);
        Administrador adm = new Administrador("adm", "teste", 3000);
        SistemaInterno si = new SistemaInterno();
        Cliente cl = new Cliente();
        cl.setSenha(2222);

        si.autentica(g);
        adm.setSenha(2222);
        si.autentica(adm);
        si.autentica(cl);


    }

}
