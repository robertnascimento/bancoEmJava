package contadebanco;

import java.util.Scanner;

public class bank {

    public static void main(String[] args) {

        ContaDeBanco iver = new ContaDeBanco();

        Scanner sc = new Scanner(System.in);

        int laco = 1, i = 0, iDep = 0, iSaq = 0;
        int[] extSaq = new int[10];
        int[] extDep = new int[10];

        System.out.println("INFORME O SEU NOVO NOME:");
        String newname = sc.next();

        while (laco > 0) {
            iver.menssagemOperacao();
            int op = sc.nextInt();
            if (op == 1) {
                System.out.println("INFORME O VALOR Q DESEJA SACAR: ");
                int scr = sc.nextInt();
                iver.sacar(scr);
                if (iver.sacar == 1) {
                    iver.mensagemSacou(scr);
                    extSaq[iSaq] = scr;
                    iSaq++;
                } else {
                    iver.erroSaque();
                }
            } else if (op == 2) {
                System.out.println("INFORME O VALOR Q DESEJA DEPOSITAR: ");
                int deposito = sc.nextInt();
                extDep[iDep] = deposito;
                iDep++;
                iver.depositar(deposito);
                iver.mensagemDepositou(deposito);
            } else if (op == 3) {
                System.out.println("SALDO ATUAL: " + iver.verSaldo());
            } else if (op == 4) {
                System.out.println(" --- EXTRATO --- \n");
                if (extDep[i] > 0 || extSaq[i] > 0) {
                    for (i = 0; extDep.length > i; i++) {
                        if (extDep[i] > 0) {
                            System.out.println("DEPÓSITO , VALOR: +" + extDep[i]
                                    + "R$");
                        }
                    }
                    System.out.println(" ");
                    for (i = 0; extSaq.length > i; i++) {
                        if (extSaq[i] > 0) {
                            System.out.println("SAQUE: -" + extSaq[i] + "R$");
                        }
                    }
                    
                } else {
                    System.out.println("\n SEM MOVINTAÇÕES \n NA CONTA \n");
                }
                System.out.print("\nSALDO ATUAL: " + iver.verSaldo());
                System.out.println("\b --- BD DGTL ---");
            } else if (op == 5) {
                System.out.println("OPERACAO FINALIZADA");
                laco -= 1;
            }

        }
    }

}
