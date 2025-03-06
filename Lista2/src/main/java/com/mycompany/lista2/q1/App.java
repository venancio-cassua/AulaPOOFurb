/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2.q1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa[] pessoa = new Pessoa[3];

        Pessoa p;

        for (int i = 0; i < pessoa.length; i++) {
            //Instanciando a Classe Pessoa
            p = new Pessoa();

            System.out.println("Digite o nome: ");
            p.setNome(teclado.nextLine());

            System.out.println("Digite a altura: ");
            p.setAltura(teclado.nextDouble());

            System.out.println("Digite o peso: ");
            p.setPeso(teclado.nextDouble());

            teclado.nextLine();

            pessoa[i] = p;
        }
        
        for (int i = 0; i < pessoa.length; i++) {
            p = pessoa[i];
            System.out.println("------------------------------");
            System.out.println("Nome: " + p.getNome());
            System.out.println("Altura: " + p.getAltura());
            System.out.println("Peso: " + p.getPeso());
            System.out.println("Imc: " + p.calcularImc());
            System.out.println("------------------------------");
        }
    }
}
