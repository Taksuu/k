/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main6;

/**
 *
 * @author Admin
 */
public class Main6 {

  
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Julia");
        aluno.setNota1(1.5);
        aluno.setNota2(4.0);
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Aprovado: " + aluno.estaAprovado());
    }
}