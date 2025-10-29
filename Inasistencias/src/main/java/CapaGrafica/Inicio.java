package CapaGrafica;

import CapaExcepcion.PersonaExcepcion;
import CapaLogica.LogIn;
import CapaLogica.fachadaPersona;
import CapaPersistencia.guardarIna;
import java.awt.Image;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {
    fachadaPersona fachada=new fachadaPersona();
    public String cedulaDocente;

    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        cedulaDocente= txtCi.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        btnInvitado = new javax.swing.JButton();
        txtCi = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresar.setBackground(new java.awt.Color(143, 227, 255));
        btnIngresar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setAlignmentY(0.0F);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 160, 30));

        btnInvitado.setBackground(new java.awt.Color(143, 227, 255));
        btnInvitado.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnInvitado.setText("Invitado");
        btnInvitado.setAlignmentY(0.0F);
        btnInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvitadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnInvitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, 180, 60));

        txtCi.setBackground(new java.awt.Color(143, 227, 255));
        txtCi.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        txtCi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 140, -1));
        txtCi.getAccessibleContext().setAccessibleParent(txtCi);

        txtPass.setBackground(new java.awt.Color(143, 227, 255));
        txtPass.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        txtPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 140, -1));
        txtPass.getAccessibleContext().setAccessibleParent(txtPass);

        jLabel1.setBackground(new java.awt.Color(203, 203, 203));
        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(203, 203, 203));
        jLabel1.setText("Bienvenido a SPRIITI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 630, -1));

        btnSalir.setBackground(new java.awt.Color(143, 227, 255));
        btnSalir.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setAlignmentY(0.0F);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 160, 60));

        jLabel2.setBackground(new java.awt.Color(203, 203, 203));
        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(203, 203, 203));
        jLabel2.setText("Cédula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, 20));

        jLabel3.setBackground(new java.awt.Color(203, 203, 203));
        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(203, 203, 203));
        jLabel3.setText("Iniciar Sesión");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jLabel4.setBackground(new java.awt.Color(203, 203, 203));
        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(203, 203, 203));
        jLabel4.setText("Sistema Para el Registro de Inasistencias del ITI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jLabel5.setBackground(new java.awt.Color(203, 203, 203));
        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(203, 203, 203));
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Proyecto\\ProyectoInasistencias\\Inasistencias\\src\\main\\java\\Imagenes\\ITIBlur.jpeg")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 550));
        jLabel6.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvitadoActionPerformed
        dispose();
        setVisible(false);
        VistaInvitado ingreso= new VistaInvitado();
        ingreso.setVisible(true);
    }//GEN-LAST:event_btnInvitadoActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
      
        if (txtCi.getText().isEmpty() && txtPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Haz de insertar una cedula y una contraseña");
            } else {
            LogIn per= new LogIn();
            
            try{
                per=fachada.busquedaCI(txtCi.getText());
                
                if(per.getCi().equals(txtCi.getText()) && per.getPass().equals(txtPass.getText())){
                    
                      String cedulaDoc= txtCi.getText();
                      dispose();
                      setVisible(false);
                      VistaDocente ingreso= new VistaDocente(cedulaDoc);
                      ingreso.setVisible(true);
                      System.out.println(cedulaDocente);
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario no existente");
                }
 
            }catch (PersonaExcepcion ex){
                JOptionPane.showMessageDialog(this, "No se pudo encontrar la persona");
            }catch (SQLException ex){
                System.getLogger(Inicio.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }catch (Exception ex){
                System.getLogger(Inicio.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
     
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Inicio().setVisible(true));
    }
    private void SetImageLabel(JLabel iti, String root){
        ImageIcon imagen= new ImageIcon(root);
        Icon icon= new ImageIcon(imagen.getImage().getScaledInstance(iti.getWidth(), iti.getHeight(), Image.SCALE_DEFAULT));
        iti.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnInvitado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables
}
