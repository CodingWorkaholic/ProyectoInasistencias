package CapaLogica;

import CapaExcepcion.BDException;
import CapaExcepcion.PersonaExcepcion;
import CapaGrafica.Inicio;
import CapaPersistencia.guardarIna;
import java.sql.SQLException;
import java.util.List;


public class fachadaPersona {
    DocentesList lista = new DocentesList();
    //Inicio ini=new Inicio();
    public void guardarIna (Inasistencias ina) throws Exception, SQLException{
        guardarIna per= new guardarIna();
        per.guardarIna(ina);
        //ini.idDocente=ina.getId();
        //return guardarIna(ina);
    }
    
    public void guardarInaModificar2 (Inasistencias ina) throws Exception, SQLException{
        guardarIna per= new guardarIna();
        per.guardarInaModificar2(ina);
        //ini.idDocente=ina.getId();
        //return guardarIna(ina);
    }
    
    public List<DocentesDoc> cargarInasistenciasPorCedula(String ci) throws Exception {
    guardarIna docs = new guardarIna();
    return docs.consultaInaDoc(ci);
}
    
//    public Docentes busquedaIna (String ci) throws Exception, SQLException{
//        Docentes doc= new Docentes();
//        guardarIna pers=new guardarIna();
//        doc=pers.busquedaIna();
//        return doc;
//    }
    
    public LogIn busquedaCI (String ci) throws PersonaExcepcion, BDException, SQLException, Exception { 
        LogIn per= new LogIn();
        guardarIna pers=new guardarIna();
        per=pers.busquedaCI(ci);
        return per;
    }
    
    public String eliminarIna (String id) throws PersonaExcepcion, BDException, SQLException, Exception { 
        
        guardarIna ina=new guardarIna();
        return ina.eliminarIna(id);
        
    }
}
