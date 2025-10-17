/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import CapaExcepcion.BDException;
import CapaPersistencia.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class DocentesList {
    public Conexion cone=new Conexion();
//    public static ArrayList<Docentes> docentes = new ArrayList<>();
//    
//  public static void agregarInasistencia(Docentes doc) {
//        docentes.add(doc);
//    }
//  
//
//    public  ArrayList<Docentes> getInasistencias() {
//        return docentes;
//    }
//
//    public  void setInasistencias(ArrayList<Docentes> doc) {
//        this.docentes = doc;
//    }
    Connection con= cone.getConnection();
    
    public static ArrayList<Docentes> listaDocentes = new ArrayList<>();
    
    public void cargarInasistencias(Connection con) throws SQLException, BDException {
        
        Statement stmt = con.createStatement();
        
        
        ResultSet rs = stmt.executeQuery("SELECT doc.nombre, doc.apellido, ina.materia, ina.fechaInicio, ina.fechaFin, ina.grupo FROM inasistencias ina, docentes doc where (ina.ci=doc.ci)");
        while (rs.next()) {
            Docentes doc = new Docentes();
            
            doc.setNombre(rs.getString("nombre"));
            doc.setApellido(rs.getString("apellido"));
            doc.setInicio(rs.getString("fechaInicio"));
            doc.setFin(rs.getString("fechaFin"));
            doc.setGrupo(rs.getString("grupo"));
            listaDocentes.add(doc);
        }
        rs.close();
        stmt.close();
    }

    public ArrayList<Docentes> getListaInasistencias() {
        return listaDocentes;
    }
    
}
