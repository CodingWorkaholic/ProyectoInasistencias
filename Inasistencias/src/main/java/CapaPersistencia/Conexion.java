/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaPersistencia;

import capaExcepcion.BDException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alex
 */
public class Conexion {
    public static Connection getConnection() throws BDException { //el throws es para traer varios errores a la vez
        Connection con= null;
        try{ 
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/persona?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", ""); //root es nombre de usuario y lo otro la contraseña
        }catch(SQLException sqle){
          throw new BDException ("Error de conexion a la base de datos", sqle);
        }
        return con;
    }
    
}
