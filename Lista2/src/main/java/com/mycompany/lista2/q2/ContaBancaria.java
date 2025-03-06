/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2.q2;

/**
 *
 * @author HP
 */
public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        if (valor < 0) {
            System.out.println("Nao eh permitido deposito de valor negativo");
        } else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Nao eh possivel sacar valor");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.sacar(valor);
            contaDestino.deposita(valor);
            //contaDestino.saldo += valor;

        } else {
            System.out.println("Nao eh possivel realizar saque");
        }
    }
}
