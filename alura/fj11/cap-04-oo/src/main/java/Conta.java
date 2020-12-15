public class Conta {
    double salario;
    int numero;
    String titular;
    double saldo;

    boolean saca(double valor){
        if (this.saldo < valor){
            return false;
        }else{
            this.saldo -= valor;
            return true;
        }
    }

    void deposita(double quantidade){
        this.saldo += quantidade;
    }
}
