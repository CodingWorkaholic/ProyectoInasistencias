package CapaGrafica;

public class VistaDocente extends javax.swing.JFrame {
    private String cedulaDocente;

    public VistaDocente(String cedulaDoc) {
        initComponents();
        setLocationRelativeTo(null);
        this.cedulaDocente=cedulaDoc;
        System.out.println("La cedula que se guarda en la clase eliminar es "+cedulaDocente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista docente");
        setBackground(new java.awt.Color(22, 33, 88));
        setPreferredSize(new java.awt.Dimension(1110, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(1127, 733));

        jPanel1.setBackground(new java.awt.Color(22, 33, 88));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(233, 233, 233));
        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 233, 233));
        jLabel1.setText("¿Cómo quieres gestionar tus inasistencias?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 830, -1));

        btnModificar.setBackground(new java.awt.Color(143, 227, 255));
        btnModificar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setAlignmentY(0.0F);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 160, 60));

        btnRegistrar.setBackground(new java.awt.Color(143, 227, 255));
        btnRegistrar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setAlignmentY(0.0F);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 160, 60));

        btnEliminar.setBackground(new java.awt.Color(143, 227, 255));
        btnEliminar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setAlignmentY(0.0F);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 160, 60));

        jPanel2.setBackground(new java.awt.Color(20, 20, 70));
        jPanel2.setForeground(new java.awt.Color(30, 30, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 780, 210));

        btnVolver.setBackground(new java.awt.Color(143, 227, 255));
        btnVolver.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setAlignmentY(0.0F);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 160, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        setVisible(false);
        Inicio ingreso= new Inicio();
        ingreso.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        dispose();
        setVisible(false);
        Registrar ingreso= new Registrar(cedulaDocente);
        ingreso.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        dispose();
        setVisible(false);
        Eliminar ingreso= new Eliminar(cedulaDocente);
        ingreso.setVisible(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        dispose();
        setVisible(false);
        Modificar1 ingreso= new Modificar1(cedulaDocente);
        ingreso.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
