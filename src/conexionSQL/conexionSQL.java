/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dainer
 */
public class conexionSQL {
    
    Connection conectar = null;
    
    public Connection conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/escuela","root","");
            
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e){  
            
            JOptionPane.showMessageDialog(null, "Error de conexión " + e.getMessage());
            
        }
        
        return conectar;
    }
    
}
