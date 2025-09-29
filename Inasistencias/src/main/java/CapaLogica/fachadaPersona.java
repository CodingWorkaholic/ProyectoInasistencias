package CapaLogica;

import CapaExcepcion.BDException;
import CapaExcepcion.PersonaExcepcion;
import CapaPersistencia.guardarIna;
import java.sql.SQLException;

public class fachadaPersona {
    public void guardarIna (Inasistencias ina) throws Exception, SQLException{
        guardarIna per= new guardarIna();
        per.guardarIna(ina);
    }
    
    public void guardarInaDocente (InasistenciasDocente inaDoc) throws Exception, SQLException{
        guardarIna per= new guardarIna();
        per.guardarInaDocente(inaDoc);
    }
    
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
