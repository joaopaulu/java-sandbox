package gastosMensais;

public class BalancoTrimetral {
  public static void main(String[] args) {
    int gastosJaneiro = 1500;
    int gastosFevereiro = 23000;
    int gastosMarco = 17000;
    int gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);

    System.out.println("O gasto total do 1° Trimestre foi: " + gastosTrimestre);
  }
}
