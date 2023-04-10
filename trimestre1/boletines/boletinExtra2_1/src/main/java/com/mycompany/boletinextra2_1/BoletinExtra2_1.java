

package com.mycompany.boletinextra2_1;

public class BoletinExtra2_1 {

    public static void main(String[] args) {
        
        Conta obx = new Conta("angel", "4343875", 1.5, 300.0);
        double saldo = obx.getSaldo();
        System.out.println("saldoAngel = " + saldo);
        saldo = obx.ingresoSaldo(15);
        System.out.println("saldoAngel = " + saldo);
        saldo = obx.reintegroSaldo(10);
        System.out.println("saldoAngel = " + saldo);
        saldo = obx.reintegroSaldo(-5);
        System.out.println("saldoAngel = " + saldo);
        
        // metodo transferencia
        obx.transferencia("alberto", "378578", 200.0);
        double saldoAlberto = obx.getSaldo();
        System.out.println("saldoAlberto = " + saldoAlberto);
        
        
    }
}
