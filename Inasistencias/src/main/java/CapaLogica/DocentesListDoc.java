/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import CapaPersistencia.Conexion;
import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class DocentesListDoc {
    
        public Conexion cone=new Conexion();
    
    
    public  ArrayList<DocentesDoc> docentes = new ArrayList<>();
    
  public  void agregarInasistencia(DocentesDoc doc) {
        docentes.add(doc);
    }
  
    public  ArrayList<DocentesDoc> getInasistencias() {
        return docentes;
    }

    
}
