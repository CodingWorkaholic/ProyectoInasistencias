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

    
}
