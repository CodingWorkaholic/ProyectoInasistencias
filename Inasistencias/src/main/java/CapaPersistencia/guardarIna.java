package CapaPersistencia;

import CapaLogica.fachadaPersona;
import CapaExcepcion.BDException;
import CapaExcepcion.PersonaExcepcion;
import CapaGrafica.Inicio;
import CapaGrafica.Registrar;
import CapaLogica.Docentes;
import CapaLogica.DocentesList;
import CapaLogica.LogIn;
import CapaLogica.Inasistencias;
import CapaLogica.InasistenciasDocente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class guardarIna {
    public String idDocente;
    Inicio ini=new Inicio();
    
    //Registrar reg= new Registrar();
    fachadaPersona fachada=new fachadaPersona();
    
    
    private static final String SQLguardar=("INSERT INTO inasistencias.inasistencias(fechaInicio, fechaFin, materia, grupo, ci)Values (?,?,?,?,?)");
     private static final String ConsultaIna=("SELECT doc.nombre, doc.apellido, ina.materia, ina.fechaInicio, ina.fechaFin, ina.grupo FROM inasistencias ina, docentes doc where (ina.ci=doc.ci)");
    private static final String SQL_CONSULTA_PERSONA = ("SELECT * FROM inasistencias.usuarios where ci=?");
    private static final String EliminarInasistencia =("DELETE FROM inasistencias where id=?");
    private static final String BusquedaIna = ("SELECT * FROM inasistencias.usuarios where ci=?");
    public Conexion cone=new Conexion();
    public PreparedStatement ps; //prepara los datos
    public ResultSet rs; //muestra los datos
    private ResultSet resultado; 

    
    
    public void guardarIna(Inasistencias ina) throws Exception,BDException {
    
//    int generatedId = -1;
    try{
        int resultado=0; //variable que guarda la conexión
        Connection con= cone.getConnection(); //Me conecto
        ps=(PreparedStatement)con.prepareStatement(SQLguardar); //"con" es la variable en la cual se guarda la conexión
        
        
        ps.setString(1,ina.getFechaInicio());
        ps.setString(2,ina.getFechaFin());
        ps.setString(3,ina.getMateria());
        ps.setString(4,ina.getGrupo());
        ps.setString(5, ina.getCi());
        
        //idDocente=ina.getId();
        
        
//         ResultSet rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//                generatedId = rs.getInt(1); 
//                System.out.println("Id de la inasistencia es: " + generatedId);
//            }
        
        
        
        
//        System.out.println(ini.cedulaDocente);
//        ps=(PreparedStatement)con.prepareStatement(GuardarInaDocente);
//       ps.setString(1,ina.getId());
//        ps.setString(2,ini.cedulaDocente);
        
        
       resultado=ps.executeUpdate();
       
       System.out.println(resultado);
    }   catch (SQLException sqle) {
        throw new Exception("Error en base de datos");
            
        }
    //return generatedId;
    }
    
//    public Docentes busquedaIna() throws Exception, BDException, PersonaExcepcion{
//        Docentes doc= new Docentes();
//        
//        try{
//            Connection con;
//            con = cone.getConnection(); //permite conectarme a la basa de datos
//            ps=(PreparedStatement)con.prepareStatement(ConsultaIna); //"con" es la variable en la cual se guarda la conexión
//            rs = ps.executeQuery();// me trae todo el objeto entero (la persona entera)
//            
//            
//            
//            while (rs.next()){ //si me ecuentra la persona...
//                
//                
//                String nombre= rs.getString("nombre");
//                String apellido= rs.getString("apellido");
//                String inicio= rs.getString("fechaIncio");
//                String fin= rs.getString("fechaFin");
//                String grupo= rs.getString("grupo");
//                
//              
//                
//                doc.setNombre(nombre);
//                doc.setApellido(apellido);
//                doc.setInicio(inicio);
//                doc.setFin(fin);
//                doc.setGrupo(grupo);
//                
//                DocentesList.agregarInasistencia(doc);
//                
//               
//            }  
//            //else{ // error
//                //throw new PersonaExcepcion("La inasistencia no se encuentra en la base de datos");
//                con.close(); //cierro la consulta
//            }catch (SQLException e) {
//            
//        
//            
//        }catch (Exception e){
//            System.out.println(e);
//            throw new PersonaExcepcion("No se puede obtener la inasistencia");
//        }
//        return doc; // devuelve la persona
//    }
    
   
    public LogIn busquedaCI (String ci) throws Exception, BDException, PersonaExcepcion{
        LogIn pers= new LogIn();
        
        try{
            Connection con;
            con = cone.getConnection(); //permite conectarme a la basa de datos
            ps=(PreparedStatement)con.prepareStatement(SQL_CONSULTA_PERSONA); //"con" es la variable en la cual se guarda la conexión
            ps.setString(1, ci);
            rs = ps.executeQuery();// me trae todo el objeto entero (la persona entera)
            
            if (rs.next()){ //si me ecuentra la persona...
                
                String CI= rs.getString("ci");
                String pass= rs.getString("pass");
              
                
                pers.setCi(CI);
                pers.setPass(pass);
               
                
            }else{ // error
                throw new PersonaExcepcion("La persona no se encuentra en la base de datos");
            }
            con.close(); //cierro la consulta
        
            
        }catch (Exception e){
            System.out.println(e);
            throw new PersonaExcepcion("No se puede obtener la persona");
        }
        return pers; // devuelve la persona
    }
    
    public void eliminarIna (String id) throws Exception, BDException, PersonaExcepcion{
        String eliminacion = null;
        
       Inasistencias ina=new Inasistencias();
        
       try{
           Connection con;
           con= cone.getConnection();
           ps=(PreparedStatement)con.prepareStatement(EliminarInasistencia);
           ps.setString(1, id);
           int resultado = ps.executeUpdate();
           
           if(rs.next()) {
               eliminacion = "Persona Eliminada";
           } else {
               eliminacion = "La persona que desea eliminar no se encuentra";
           }
           con.close();
       }catch (Exception e){
            System.out.println(e);
            throw new Exception("");
    }
      
       
    }
}
