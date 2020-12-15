public class TestaAlgunsMetodos {
    public static void main(String[] args) {
        //criando a conta
        Conta minhaConta;
        minhaConta = new Conta();

        //alterando os valores de minhaConta
        minhaConta.titular = "Duke";
        minhaConta.saldo = 1000;

        //saca 200 reais

        if (minhaConta.saca(200)){
            System.out.println("Consegui sacar");
        }else {
            System.out.println("Não consegui sacar");
        }

        //deposita 500 reais
        minhaConta.deposita(500);
        System.out.println("Seu saldo atual é: " + minhaConta.saldo);
    }
}
