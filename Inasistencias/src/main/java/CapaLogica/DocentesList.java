package CapaLogica;

import CapaExcepcion.BDException;
import CapaPersistencia.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DocentesList {


    public Conexion cone=new Conexion();
    
    
    public  ArrayList<Docentes> docentes = new ArrayList<>();
    
  public  void agregarInasistencia(Docentes doc) {
        docentes.add(doc);
    }
  
    public  ArrayList<Docentes> getInasistencias() {
        return docentes;
    }

    
    
    
//    private ArrayList<Docentes> listaDocentes = new ArrayList<>();
//    
//    public void cargarInasistencias() throws SQLException, BDException {
//        try(Connection con = cone.getConnection()){
//        Statement stmt = con.createStatement();
//        
//        ResultSet rs = stmt.executeQuery("SELECT doc.nombre, doc.apellido, ina.materia, ina.fechaInicio, ina.fechaFin, ina.grupo FROM inasistencias ina, docentes doc where (ina.ci=doc.ci)");
//        while (rs.next()) {
//            Docentes doc = new Docentes();
//            
//            doc.setNombre(rs.getString("nombre"));
//            doc.setApellido(rs.getString("apellido"));
//            doc.setInicio(rs.getString("fechaInicio"));
//            doc.setFin(rs.getString("fechaFin"));
//            doc.setGrupo(rs.getString("grupo"));
//            listaDocentes.add(doc);
//        }
//        rs.close();
//        stmt.close();
//    }
//    }
//
//    public ArrayList<Docentes> getListaInasistencias() {
//        return listaDocentes;
//    }
//    
}
