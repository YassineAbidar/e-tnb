/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbibliotequ;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author yassine
 */
public class Connection {
    public Connection(){
        
    }
            
    
   private static final String constring="jdbc:mysql://localhost:3306/bdbibioteue" ;
private static final String username="root " ;
private static final String password ="" ;
public static Connection getcox() throws SQLException {
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=(Connection) DriverManager.getConnection(constring,username,password);
JOptionPane.showMessageDialog(null,"good !");
return con;
}
catch(ClassNotFoundException e) {
JOptionPane.showMessageDialog(null,"error with connected of database : " + e.getMessage());
return null;
}
}

  

}

