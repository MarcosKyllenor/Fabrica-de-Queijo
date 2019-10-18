/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author herve
 */
public class Conexao {
    
    private static Conexao unique;
    
    private void Conexao(){
        
    }
    public static Conexao getInstance(){
        if (unique == null) {
            unique = new Conexao();
        }
        return unique; // retorna a instancia unique
    }
}
