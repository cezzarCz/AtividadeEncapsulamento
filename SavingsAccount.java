
package com.mycompany.atividade3.po;


public class SavingsAccount {
    public double taxaJuros;
    private double saldoConta;
    public double jurosMensal;
    
    //Metodos
    double jurosMensais(){
        jurosMensal = (saldoConta * taxaJuros) / 12;
        return jurosMensal;
    }
    
    double modificaJuros(int juros){
        taxaJuros = juros;
        return taxaJuros;
    }
    
    double depositoConta(double valor){
        saldoConta = saldoConta + valor;
        return saldoConta;
    }
    double calculaSaldo(){
        saldoConta = saldoConta + jurosMensal;
        return saldoConta;
    }
    
    void extrato(){
        System.out.println("Saldo da conta: " + saldoConta);
        System.out.println("Valor do juros mensal: " + jurosMensal);
    }
}
