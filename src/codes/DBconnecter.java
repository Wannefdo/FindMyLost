/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ishu & Neth
 */
public class DBconnecter {
    public static Connection connect(){
        Connection con = null;
        try{
           Class.forName("com.mysql.jdbc.Driver");
           con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/findmylostdata","root","");
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        return con;
        
    }
    
}
