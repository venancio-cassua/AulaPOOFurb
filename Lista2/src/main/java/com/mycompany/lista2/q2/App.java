/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2.q2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class App {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setNumero("349");
        conta.setTitular("Vanio");

        ContaBancaria novaConta = new ContaBancaria();
        novaConta.setNumero("123");
        novaConta.setTitular("Vale");

        // e R$ 1.000,00 e R$ 700,00. 
        //Depositar na primeira conta
        conta.deposita(1000);
        conta.deposita(700);

        // Depositar na segunda conta
        novaConta.deposita(5000);
        novaConta.sacar(3000);

        // Exiba o titular de cada uma conta com o respectivo saldo da conta.
        // Antes da transferencia
        System.out.println("Antes da Transferencia\n");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("");
        System.out.println("Titular: " + novaConta.getTitular());
        System.out.println("Saldo: " + novaConta.getSaldo());

        novaConta.transferir(conta, 1800);

        System.out.println("------------------------------");
        System.out.println("Depois da Transferencia\n");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());

        System.out.println("");
        System.out.println("Titular: " + novaConta.getTitular());
        System.out.println("Saldo: " + novaConta.getSaldo());

    }
}
