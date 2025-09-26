package CapaPersistencia;

import CapaExcepcion.BDException;
import CapaExcepcion.PersonaExcepcion;
import CapaLogica.LogIn;
import CapaLogica.Inasistencias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class guardarIna {
    private static final String SQLguardar=("INSERT INTO inasistencias.inasistencias(id, fechaInicio, fechaFin, materia)Values (?,?,?,?)");
    private static final String SQL_CONSULTA_PERSONA = ("SELECT * FROM inasistencias.usuarios where ci=?");
    private static final String EliminarInasistencia =("DELETE FROM inasistencias where id=?");
    public Conexion cone=new Conexion();
    public PreparedStatement ps; //prepara los datos
    public ResultSet rs; //muestra los datos
    private ResultSet resultado; 
    
    public void guardarIna(Inasistencias ina) throws Exception,BDException {
    try{
        int resultado=0; //variable que guarda la conexión
        Connection con= cone.getConnection(); //Me conecto
        ps=(PreparedStatement)con.prepareStatement(SQLguardar); //"con" es la variable en la cual se guarda la conexión
        
        ps.setString(1,ina.getId());
        ps.setString(2,ina.getFechaInicio());
        ps.setString(3,ina.getFechaFin());
        ps.setString(4,ina.getMateria());


        
       resultado=ps.executeUpdate();
       System.out.println(resultado);
    }   catch (SQLException sqle) {
        throw new Exception("Error en base de datos");
            
        }
    }
    /**
     *
     * @param ci
     * @return
     * @throws Exception
     * @throws BDException
     */
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
