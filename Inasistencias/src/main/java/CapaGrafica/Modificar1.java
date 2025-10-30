package CapaGrafica;

import CapaLogica.Docentes;
import CapaLogica.DocentesDoc;
import CapaLogica.DocentesList;
import CapaLogica.fachadaPersona;
import CapaPersistencia.guardarIna;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Modificar1 extends javax.swing.JFrame {
    private String cedulaDocente;
    fachadaPersona fachada=new fachadaPersona();
    
    
    DefaultTableModel modelo;
    
    public Modificar1(String cedulaDoc) {
        initComponents();
        setLocationRelativeTo(null);
        this.cedulaDocente=cedulaDoc;
        
        modelo=new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Materia");
        modelo.addColumn("Incio");
        modelo.addColumn("Fin");
        modelo.addColumn("Grupo");
        this.Tabla.setModel(modelo);
        
        Tabla.getColumnModel().getColumn(0).setMinWidth(0);
        Tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        Tabla.getColumnModel().getColumn(0).setWidth(0);
        Tabla.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        try {
  
        List<DocentesDoc> datos = fachada.cargarInasistenciasPorCedula(cedulaDocente);

        if (datos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay inasistencias registradas.");
            return;
        }

       
        modelo.setRowCount(0);
        for (DocentesDoc d : datos) {
            modelo.addRow(new Object[]{
                d.getId(),
                d.getMateria(),
                d.getInicio(),
                d.getFin(),
                d.getGrupo()
            });
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error consultando inasistencias: " + ex.getMessage());
        ex.printStackTrace();
    }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(22, 33, 88));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setBackground(new java.awt.Color(22, 33, 88));
        Tabla.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Materia", "Inicio", "Fin", "Grupo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(1).setResizable(false);
            Tabla.getColumnModel().getColumn(2).setResizable(false);
            Tabla.getColumnModel().getColumn(3).setResizable(false);
            Tabla.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 420));

        btnModificar.setBackground(new java.awt.Color(143, 227, 255));
        btnModificar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setAlignmentY(0.0F);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 160, 60));

        btnVolver.setBackground(new java.awt.Color(143, 227, 255));
        btnVolver.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setAlignmentY(0.0F);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 160, 60));

        jLabel1.setBackground(new java.awt.Color(233, 233, 233));
        jLabel1.setForeground(new java.awt.Color(233, 233, 233));
        jLabel1.setText("Antes selecciona una tupla");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, -1, -1));

        btnMostrar.setBackground(new java.awt.Color(143, 227, 255));
        btnMostrar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnMostrar.setText("Refrescar");
        btnMostrar.setAlignmentY(0.0F);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 160, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila=Tabla.getSelectedRow();
        if(fila>=0){
            
            Object objId=Tabla.getValueAt(fila, 0);
            String id = String.valueOf(objId);
            Object objMateria=Tabla.getValueAt(fila, 1);
            String materia = String.valueOf(objMateria);
            Object objInicio=Tabla.getValueAt(fila, 2);
            String inicio = String.valueOf(objInicio);
            Object objFin=Tabla.getValueAt(fila, 3);
            String fin = String.valueOf(objFin);
            Object objGrupo=Tabla.getValueAt(fila, 4);
            String grupo = String.valueOf(objGrupo);
        
        dispose();
        setVisible(false);
        Modificar2 ingreso= new Modificar2(cedulaDocente, id, materia, inicio, fin, grupo);
        ingreso.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Ninguna fila seleccionada");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        System.out.println("La cedula que se guarda en la clase eliminar es "+cedulaDocente);
        dispose();
        setVisible(false);
        VistaDocente ingreso= new VistaDocente(cedulaDocente);
        ingreso.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
       
        try {
  
        List<DocentesDoc> datos = fachada.cargarInasistenciasPorCedula(cedulaDocente);

        if (datos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay inasistencias registradas.");
            return;
        }

       
        modelo.setRowCount(0);
        for (DocentesDoc d : datos) {
            modelo.addRow(new Object[]{
                d.getId(),
                d.getMateria(),
                d.getInicio(),
                d.getFin(),
                d.getGrupo()
            });
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error consultando inasistencias: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_btnMostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
