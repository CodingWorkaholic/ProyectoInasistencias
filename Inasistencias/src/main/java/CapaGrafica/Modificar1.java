package CapaGrafica;

import CapaLogica.Docentes;
import CapaLogica.DocentesList;

public class Modificar1 extends javax.swing.JFrame {
    private String cedulaDocente;
    DocentesList lista = new DocentesList();
    Docentes doc= new Docentes();
    
    public Modificar1(String cedulaDoc) {
        initComponents();
        setLocationRelativeTo(null);
        this.cedulaDocente=cedulaDoc;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Inasistencia = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(22, 33, 88));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inasistencia.setBackground(new java.awt.Color(22, 33, 88));
        Inasistencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        Inasistencia.setForeground(new java.awt.Color(22, 33, 88));
        Inasistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Materia", "Inicio", "Fin", "Grupo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Inasistencia.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Inasistencia);
        if (Inasistencia.getColumnModel().getColumnCount() > 0) {
            Inasistencia.getColumnModel().getColumn(0).setResizable(false);
            Inasistencia.getColumnModel().getColumn(1).setResizable(false);
            Inasistencia.getColumnModel().getColumn(2).setResizable(false);
            Inasistencia.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        btnModificar.setBackground(new java.awt.Color(143, 227, 255));
        btnModificar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setAlignmentY(0.0F);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 160, 60));

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, -1, -1));

        btnMostrar.setBackground(new java.awt.Color(143, 227, 255));
        btnMostrar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnMostrar.setText("Mostrar");
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        dispose();
        setVisible(false);
        Modificar2 ingreso= new Modificar2();
        ingreso.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        System.out.println("La cedula que se guarda en la clase eliminar es "+cedulaDocente);
        dispose();
        setVisible(false);
        VistaDocente ingreso= new VistaDocente(cedulaDocente);
        ingreso.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Inasistencia;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
