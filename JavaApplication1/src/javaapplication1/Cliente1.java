/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Aluno
 */
public class Cliente1 {
    public static void main(String[] args) {
        ContaBancaria Jose;
        Jose = new ContaBancaria();
        Jose.cliente = "Jose Da Silva" ;
        Jose.saldo = (1000);
        Jose.limite = (2000) ;
        Jose.senha = (23456);
        Jose.numero = (5678);       
        Jose.depositar(100);
        Jose.sacar (530);
        
    }
    
}
