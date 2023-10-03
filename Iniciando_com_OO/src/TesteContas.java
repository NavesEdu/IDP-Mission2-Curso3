public class TesteContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200);
        try{
            cc.transfere(10,cp);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }


        System.out.println(cc.getsaldo());

    }



}
