/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/Biblioteca";
    public Conexion(){
        conn = null;
    }
    public static Connection Conectar(){
        
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Conexion Establecida");
                
            }
        }
        catch(ClassNotFoundException | SQLDataException e){
                    
            System.out.println("error al conectar" + e);    
                    
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
   
    public void desconectar(){
        conn = null;
        if(conn == null){
            System.out.println("Conexion terminada");
        }
    }
}

    
