package com.mycompany.atividade3.po;
import java.util.Scanner;

public class Atividade3PO {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        Scanner recebe = new Scanner(System.in);
        System.out.println("Saldo a ser depositado: ");
        double n;
        n = recebe.nextDouble();
        saver1.depositoConta(n);
        
        int juros;
        System.out.println("Informe a taxa de juros: ");
        juros = recebe.nextInt();
        saver1.modificaJuros(juros);
        saver1.calculaSaldo();
        saver1.extrato();
    }
}
