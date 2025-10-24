package CapaLogica;

import CapaExcepcion.BDException;
import CapaExcepcion.PersonaExcepcion;
import CapaGrafica.Inicio;
import CapaPersistencia.guardarIna;
import java.sql.SQLException;

public class fachadaPersona {
    //Inicio ini=new Inicio();
    public void guardarIna (Inasistencias ina) throws Exception, SQLException{
        guardarIna per= new guardarIna();
        per.guardarIna(ina);
        //ini.idDocente=ina.getId();
        //return guardarIna(ina);
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
    
    public void eliminarPer (String ci) throws PersonaExcepcion, BDException, SQLException, Exception { 
        LogIn per= new LogIn();
        guardarIna pers=new guardarIna();
        
    }
}
