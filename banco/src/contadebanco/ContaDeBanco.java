package contadebanco;

public class ContaDeBanco {

    double saldo = 0;
    double depositar;
    double verSaldo;
    String verNome;
    String name;
    int sacar;

    public double depositar(double dep) {
        this.saldo += dep;
        return this.saldo;
    }

    public double verSaldo() {
        return this.saldo;
    }

    public double sacar(double saque) {
        if (saldo >= saque) {
            this.saldo -= saque;
            sacar = 1;
            return this.saldo;
        } else {
            return sacar = 2;
        }
    }

    public String verNome(String nomeatual) {
        this.name = nomeatual;
        return this.name;
    }

    public String name(String novonome) {
        this.name = novonome;
        return name;
    }

    public void menssagemOperacao() {
        System.out.print("\n DIGITE 1 - SACAR" + 
                "\n DIGITE 2 - DEPOSITAR" + 
                "\n DIGITE 3 - CONSULTAR SALDO " +
                "\n DIGITE 4 - PARA CONSULTAR O EXTRATO" +
                "\n DIGITE 5 - FINALIZAR A OPERAÇÃO  \n");
    }

    public void erroSaque() {
        System.out.println("NÃO FOI POSSÍVEL REALIZAR O SAQUE,"
                + "DEVIDO AO VALOR SOLICITADO SER MAIOR DO QUE "
                + "SEU SALDO!" + "\nSALDO ATUAL: "
                + verSaldo());
    }

    public void mensagemDepositou(double dep) {
        System.out.println("VOCÊ DEPOSITOU " + dep +
                "\n  SALDO ATUAL: " + verSaldo());
    }

    public void mensagemSacou(double scr) {
        System.out.println("VOCÊ SACOU " + scr + "\n SALDO "
                + "ATUAL: " + verSaldo());
    }

}
