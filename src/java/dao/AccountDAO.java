/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author lucas
 */

import classes.Account;

public class AccountDAO {
    
    public static Integer register(String name, String username, String password){
        
        Account new_acc = new Account();
        
        new_acc.setName(name);
        new_acc.setUsername(username);
        new_acc.setPassword(password);
        
        // working
        
        Integer id = 0;        
        return id;
    }
    
}
