package CapaLogica;

import CapaExcepcion.BDException;
import CapaExcepcion.PersonaExcepcion;
import CapaPersistencia.guardarIna;
import java.sql.SQLException;

public class fachadaPersona {
    public void guardarPersona (Login pers) throws Exception, SQLException{
        guardarIna per= new guardarIna();
        per.guardarPersona(pers);
    }
    
    public Login busquedaCI (String ci) throws PersonaExcepcion, BDException, SQLException, Exception { 
        Login per= new Login();
        guardarIna pers=new guardarIna();
        per=pers.busquedaCI(ci);
        return per;
    }
    
    public void eliminarPer (String ci) throws PersonaExcepcion, BDException, SQLException, Exception { 
        Login per= new Login();
        guardarIna pers=new guardarIna();
        
    }
}
