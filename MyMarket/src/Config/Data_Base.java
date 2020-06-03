/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;
import java.sql.DriverManager;
import java.sql.Connection;


/**
 *
 * @author German
 */
public class Data_Base {
    
    Connection conn;
    
    public Data_Base(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://Localost:3306/mymarket",
                    "root",
                    ""
            );
            
        }catch(Exception e ) {
            System.out.println("");
        }
        
    
}
    
}
