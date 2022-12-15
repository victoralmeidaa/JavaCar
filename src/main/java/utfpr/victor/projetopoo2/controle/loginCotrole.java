/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.victor.projetopoo2.controle;

import utfpr.victor.projetopoo2.visao.login;

/**
 *
 * @author Victor Almeida
 */
public class loginCotrole {
    private login view;
    
    public loginCotrole(login view){
        this.view = view;
        
    }
    
    public void autenticar(){
        String cliente = view.gettLogin().getText();
        
    }
}
