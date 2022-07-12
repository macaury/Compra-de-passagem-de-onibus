/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carvalhoticket;
import javax.swing.JOptionPane;

/**
 *
 * @author Macaury
 */
public class Verificacao extends BancoDeDados {
    private BancoDeDados Users[] = new BancoDeDados[20];
    
    public boolean Verify( String Usuario , String Senha){
        for (BancoDeDados Userr : this.Users) {
            if(user.equals(Usuario) && password.equals(Senha)){
                //JOptionPane.showMessageDialog(Users , "Passagem comprada com sucesso");
                //JOptionPane.showInputDialog("Login feito com sucesso");
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
    public boolean AdicionarUser(BancoDeDados Users){
           //nao fiz
        return false;
    }
    public boolean Senhas(String senha, String confirmacao){
        return senha == null ? confirmacao != null : !senha.equals(confirmacao);
    }
}
