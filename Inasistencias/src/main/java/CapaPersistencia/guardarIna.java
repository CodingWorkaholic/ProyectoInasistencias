package CapaPersistencia;

import CapaLogica.fachadaPersona;
import CapaExcepcion.BDException;
import CapaExcepcion.PersonaExcepcion;
import CapaGrafica.Inicio;
import CapaGrafica.Registrar;
import CapaLogica.Docentes;
import CapaLogica.DocentesDoc;
import CapaLogica.DocentesList;
import CapaLogica.LogIn;
import CapaLogica.Inasistencias;
import CapaLogica.InasistenciasDocente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class guardarIna {
   
    
 
    private static final String SQL_GUARDAR =
        "INSERT INTO inasistencias.inasistencias(fechaInicio, fechaFin, materia, grupo, ci) VALUES (?,?,?,?,?)";

    private static final String SQL_CONSULTA_INA =
        "SELECT doc.nombre, doc.apellido, ina.materia, ina.fechaInicio, ina.fechaFin, ina.grupo " +
        "FROM inasistencias.inasistencias ina " +
        "JOIN inasistencias.docentes doc ON ina.ci = doc.ci";
    
    private static final String SQL_CONSULTA_INA_DOCENTE =
        "SELECT ina.materia, ina.fechaInicio, ina.fechaFin, ina.grupo " +
        "FROM inasistencias.inasistencias ina " +
        "WHERE ina.ci = ?";

    private static final String SQL_CONSULTA_PERSONA =
        "SELECT * FROM inasistencias.usuarios WHERE ci=?";

    private static final String SQL_ELIMINAR_INA =
        "DELETE FROM inasistencias.inasistencias WHERE id=?";

    private final Conexion cone = new Conexion();

    public void guardarIna(Inasistencias ina) throws Exception {
        try (Connection con = cone.getConnection();
             PreparedStatement ps = con.prepareStatement(SQL_GUARDAR)) {

            ps.setString(1, ina.getFechaInicio());
            ps.setString(2, ina.getFechaFin());
            ps.setString(3, ina.getMateria());
            ps.setString(4, ina.getGrupo());
            ps.setString(5, ina.getCi());
            ps.executeUpdate();
        } catch (SQLException sqle) {
            throw new Exception("Error en base de datos", sqle);
        }
    }

    // Devolvé una lista (no uses el ArrayList static)
    public List<Docentes> consultaIna() throws Exception {
        List<Docentes> lista = new ArrayList<>();
        try (Connection con = cone.getConnection();
             PreparedStatement ps = con.prepareStatement(SQL_CONSULTA_INA);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Docentes d = new Docentes();
                d.setNombre(rs.getString("nombre"));
                d.setApellido(rs.getString("apellido"));
                d.setMateria(rs.getString("materia"));                 // <- faltaba
                d.setInicio(rs.getString("fechaInicio"));               // <- typo corregido
                d.setFin(rs.getString("fechaFin"));
                d.setGrupo(rs.getString("grupo"));
                lista.add(d);
            }
        } catch (SQLException e) {
            throw new Exception("No se puede obtener la inasistencia", e);
        }
        return lista;
    }

    public LogIn busquedaCI(String ci) throws Exception {
        try (Connection con = cone.getConnection();
             PreparedStatement ps = con.prepareStatement(SQL_CONSULTA_PERSONA)) {

            ps.setString(1, ci);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    LogIn pers = new LogIn();
                    pers.setCi(rs.getString("ci"));
                    pers.setPass(rs.getString("pass"));
                    return pers;
                }
            }
            throw new Exception("La persona no se encuentra en la base de datos");
        } catch (SQLException e) {
            throw new Exception("No se puede obtener la persona", e);
        }
    }
    
    public List<DocentesDoc> consultaInaDoc(String ci) throws Exception {
    List<DocentesDoc> lista = new ArrayList<>();
    try (Connection con = cone.getConnection();
         PreparedStatement ps = con.prepareStatement(SQL_CONSULTA_INA_DOCENTE)) {

        ps.setString(1, ci); 

        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                DocentesDoc d = new DocentesDoc();
                d.setMateria(rs.getString("materia"));
                d.setInicio(rs.getString("fechaInicio"));
                d.setFin(rs.getString("fechaFin"));
                d.setGrupo(rs.getString("grupo"));
                lista.add(d);
            }
        }
    } catch (SQLException e) {
        throw new Exception("No se puede obtener la inasistencia", e);
    }
    return lista;
}

    public String eliminarIna(String id) throws Exception {
        try (Connection con = cone.getConnection();
             PreparedStatement ps = con.prepareStatement(SQL_ELIMINAR_INA)) {

            ps.setString(1, id);
            int filas = ps.executeUpdate();
            return (filas > 0) ? "Inasistencia eliminada" : "No se encontró la inasistencia";
        } catch (SQLException e) {
            throw new Exception("Error eliminando inasistencia", e);
        }
    }


}
