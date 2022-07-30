/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPuskesmas;


/**
 *
 * @author mufli
 */

    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author mufli
 */
public class Konfig {
    
    private static Connection MySQLConfig;
    
    public static  Connection configDB()throws SQLException{
       
        try{

            String url = "jdbc:mysql://localhost:3306/projek_puskesmas";
            String user = "root";
            String password = "";

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected");
        }catch(SQLException e){
            System.out.println("Failed to Connect");
        }
    return MySQLConfig;
    }
}
    

