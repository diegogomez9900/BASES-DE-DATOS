/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transito;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Gomez
 */
public class Infractor_A extends javax.swing.JFrame {

   
    @SuppressWarnings("unchecked")
    public Infractor_A() {
        initComponents();
        limpiar();
        bloquear();        
    }
    
    public void limpiar(){
        codigo.setText("");
        nombre.setText("");
        apellido.setText("");
        nacimiento.setText("");
        domicilio.setText("");
        placa.setText("");
        tipo.setText("");
    }
    
    public void bloquear(){
        nombre.setEnabled(false);
        apellido.setEnabled(false);
        nacimiento.setEnabled(false);
        domicilio.setEnabled(false);
        placa.setEnabled(false);
        tipo.setEnabled(false);
        //bloquea los campos
        jButton2.setEnabled(true);
        jButton3.setEnabled(false);
    }
    
    public void desbloquear(){
        codigo.setEnabled(true);
        
       //bloquea los campos
    
        
        jButton2.setEnabled(false);
        jButton3.setEnabled(true);
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        nomcheck = new javax.swing.JCheckBox();
        apecheck = new javax.swing.JCheckBox();
        nacicheck = new javax.swing.JCheckBox();
        domicheck = new javax.swing.JCheckBox();
        placheck = new javax.swing.JCheckBox();
        tipocheck = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        domicilio = new javax.swing.JTextField();
        placa = new javax.swing.JTextField();
        tipo = new javax.swing.JTextField();
        nacimiento = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("GUARDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CANCELAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("SALIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel5.setText("ACTUALIZAR REGISTRO");

        codigo.setText("Cod");
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Codigo Del Registro Infractor a Actualizar");

        jButton5.setText("VOLVER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        nomcheck.setText("Nombre");
        nomcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomcheckActionPerformed(evt);
            }
        });

        apecheck.setText("Apellido");
        apecheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apecheckActionPerformed(evt);
            }
        });

        nacicheck.setText("Nacimiento");
        nacicheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacicheckActionPerformed(evt);
            }
        });

        domicheck.setText("Domicilio");
        domicheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domicheckActionPerformed(evt);
            }
        });

        placheck.setText("Placa");
        placheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placheckActionPerformed(evt);
            }
        });

        tipocheck.setText("Tipo Infractor");
        tipocheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipocheckActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione los Campos a Actualizar e ingrese su Valor");

        nombre.setText("Nombre");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        apellido.setText("Apellido");
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        domicilio.setText("Domicilio");

        placa.setText("Placa");

        tipo.setText("Tipo");

        nacimiento.setText("Nacimiento");

        jButton1.setText("MOSTRAR TABLAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton2)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))))
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomcheck)
                            .addComponent(apecheck)
                            .addComponent(nacicheck)
                            .addComponent(domicheck)
                            .addComponent(placheck)
                            .addComponent(tipocheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(domicilio)
                            .addComponent(nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(placa)
                            .addComponent(tipo)
                            .addComponent(apellido)
                            .addComponent(nombre))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomcheck)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apecheck)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nacicheck)
                    .addComponent(nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(domicheck)
                    .addComponent(domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placheck)
                    .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(tipocheck)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        actualizar in = new actualizar();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        bloquear();
        this.setVisible(false);
        Menu m= new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        conectar cc=new conectar();//nos conectamos a la base de datos
        Connection cn = cc.conexion();
        String codigoo,nombree,apellidoo,nacimientoo,domicilioo,placaa,tipoo;
        String sql;//se crean variables para almacenar los datos y la sentencia sql
        codigoo = codigo.getText();
        //obtengo los valores guardados en los jcheck y alcualizo en la base de datos el nombre
        if("".equals(nombre.getText())){
        }
        else{
            nombree=nombre.getText();
            sql = "UPDATE Infractor SET Nombre_Infractor = ? WHERE Codigo_Infractor = ?";
            try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,nombree);
            pst.setString(2,codigoo);
            int n;
            n = pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                bloquear();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Infractor_A.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        //obtengo los valores guardados en los jcheck y alcualizo en la base de datos el apellido
        if("".equals(apellido.getText())){
        }
        else{
            apellidoo=apellido.getText();
            sql = "UPDATE Infractor SET Apellido_Infractor = ? WHERE Codigo_Infractor = ?";
            try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,apellidoo);
            pst.setString(2,codigoo);
            int n;
            n = pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                bloquear();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Infractor_A.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        ////obtengo los valores guardados en los jcheck y alcualizo en la base de datos el nacimiento
        if("".equals(nacimiento.getText())){
        }
        else{
            nacimientoo=nacimiento.getText();
            sql = "UPDATE Infractor SET Nacimiento_Infractor = ? WHERE Codigo_Infractor = ?";
            try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,nacimientoo);
            pst.setString(2,codigoo);
            int n;
            n = pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                bloquear();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Infractor_A.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        //obtengo los valores del jcheck y actualizo en la base de datos el campo domicilio
        if("".equals(domicilio.getText())){
        }
        else{
            domicilioo=domicilio.getText();
            sql = "UPDATE Infractor SET Domicilio_Infractor = ? WHERE Codigo_Infractor = ?";
            try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,domicilioo);
            pst.setString(2,codigoo);
            int n;
            n = pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                bloquear();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Infractor_A.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        //obtengo los datos del jcheck y actualizo en la base de datos el campo placa
        if("".equals(placa.getText())){
        }
        else{
            placaa=placa.getText();
            sql = "UPDATE Infractor SET Placa_Matriculado = ? WHERE Codigo_Infractor = ?";
            try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,placaa);
            pst.setString(2,codigoo);
            int n;
            n = pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                bloquear();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Infractor_A.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        //obtengo los datos del jcheck y actualizo el campo codigo tipo infractor en la BD
        if("".equals(tipo.getText())){
        }
        else{
            tipoo=tipo.getText();
            sql = "UPDATE Infractor SET Codigo_Tipo = ? WHERE Codigo_Infractor = ?";
            try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,tipoo);
            pst.setString(2,codigoo);
            int n;
            n = pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                bloquear();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Infractor_A.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void placheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placheckActionPerformed
        if(placheck.isSelected()==true){
            placa.setEnabled(true);
        }
        else{
            placa.setEnabled(false);
        }
        placa.requestFocus();
    }//GEN-LAST:event_placheckActionPerformed

    private void nomcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomcheckActionPerformed
        if(nomcheck.isSelected()==true){
            nombre.setEnabled(true);
        }
        else{
            nombre.setEnabled(false);
        }
        nombre.requestFocus();
    }//GEN-LAST:event_nomcheckActionPerformed

    private void apecheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apecheckActionPerformed
        if(apecheck.isSelected()==true){
            apellido.setEnabled(true);
        }
        else{
            apellido.setEnabled(false);
        }
        apellido.requestFocus();
    }//GEN-LAST:event_apecheckActionPerformed

    private void nacicheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacicheckActionPerformed
        if(nacicheck.isSelected()==true){
            nacimiento.setEnabled(true);
        }
        else{
            nacimiento.setEnabled(false);
        }
        nacimiento.requestFocus();
    }//GEN-LAST:event_nacicheckActionPerformed

    private void domicheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domicheckActionPerformed
        if(domicheck.isSelected()==true){
            domicilio.setEnabled(true);
        }
        else{
            domicilio.setEnabled(false);
        }
        domicilio.requestFocus();
    }//GEN-LAST:event_domicheckActionPerformed

    private void tipocheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipocheckActionPerformed
        if(tipocheck.isSelected()==true){
            tipo.setEnabled(true);
        }
        else{
            tipo.setEnabled(false);
        }
        tipo.requestFocus();
    }//GEN-LAST:event_tipocheckActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tablas_E in = new Tablas_E();
        in.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Infractor_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Infractor_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Infractor_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Infractor_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Infractor_A().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox apecheck;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField codigo;
    private javax.swing.JCheckBox domicheck;
    private javax.swing.JTextField domicilio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox nacicheck;
    private javax.swing.JTextField nacimiento;
    private javax.swing.JTextField nombre;
    private javax.swing.JCheckBox nomcheck;
    private javax.swing.JTextField placa;
    private javax.swing.JCheckBox placheck;
    private javax.swing.JTextField tipo;
    private javax.swing.JCheckBox tipocheck;
    // End of variables declaration//GEN-END:variables
}
