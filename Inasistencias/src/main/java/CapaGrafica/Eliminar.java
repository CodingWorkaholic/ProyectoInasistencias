package CapaGrafica;

public class Eliminar extends javax.swing.JFrame {
    private String cedulaDocente;

    public Eliminar(String cedulaDoc) {
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
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificación de inasistencias");

        jPanel1.setBackground(new java.awt.Color(22, 33, 88));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inasistencia.setBackground(new java.awt.Color(22, 33, 88));
        Inasistencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        Inasistencia.setForeground(new java.awt.Color(22, 33, 88));
        Inasistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Materia", "Inicio", "Fin", "Grupo", "Turno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            Inasistencia.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1010, -1));

        btnEliminar.setBackground(new java.awt.Color(143, 227, 255));
        btnEliminar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setAlignmentY(0.0F);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 160, 60));

        btnVolver.setBackground(new java.awt.Color(143, 227, 255));
        btnVolver.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setAlignmentY(0.0F);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 160, 60));

        jLabel1.setBackground(new java.awt.Color(233, 233, 233));
        jLabel1.setForeground(new java.awt.Color(233, 233, 233));
        jLabel1.setText("Elimina tupla seleccionada");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, -1, -1));

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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        System.out.println("La cedula que se guarda en la clase eliminar es "+cedulaDocente);
        dispose();
        setVisible(false);
        VistaDocente ingreso= new VistaDocente(cedulaDocente);
        ingreso.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Inasistencia;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
