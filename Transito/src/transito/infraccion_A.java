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
public class infraccion_A extends javax.swing.JFrame {

   
    @SuppressWarnings("unchecked")
    public infraccion_A() {
        initComponents();
        limpiar();
        bloquear();        
    }
    
    public void limpiar(){
        codigo.setText("");
        fecha.setText("");
        lugar.setText("");
        articulo.setText("");
        importe.setText("");
        agente.setText("");
        infractor.setText("");
    }
    
    public void bloquear(){
        fecha.setEnabled(false);
        lugar.setEnabled(false);
        articulo.setEnabled(false);
        importe.setEnabled(false);
        agente.setEnabled(false);
        infractor.setEnabled(false);
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
        fecheck = new javax.swing.JCheckBox();
        lugcheck = new javax.swing.JCheckBox();
        artcheck = new javax.swing.JCheckBox();
        impcheck = new javax.swing.JCheckBox();
        codagcheck = new javax.swing.JCheckBox();
        codincheck = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        lugar = new javax.swing.JTextField();
        importe = new javax.swing.JTextField();
        agente = new javax.swing.JTextField();
        infractor = new javax.swing.JTextField();
        articulo = new javax.swing.JTextField();
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
        jLabel6.setText("Codigo Del Registro Infraccion a Actualizar");

        jButton5.setText("VOLVER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        fecheck.setText("Fecha");
        fecheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecheckActionPerformed(evt);
            }
        });

        lugcheck.setText("Lugar");
        lugcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugcheckActionPerformed(evt);
            }
        });

        artcheck.setText("Articulo multa");
        artcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artcheckActionPerformed(evt);
            }
        });

        impcheck.setText("Importe infraccion");
        impcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impcheckActionPerformed(evt);
            }
        });

        codagcheck.setText("Codigo Agente");
        codagcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codagcheckActionPerformed(evt);
            }
        });

        codincheck.setText("Codigo Infractor");
        codincheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codincheckActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione los Campos a Actualizar e ingrese su Valor");

        fecha.setText("Fecha");
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        lugar.setText("Lugar");
        lugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugarActionPerformed(evt);
            }
        });

        importe.setText("Importe");

        agente.setText("Agente");

        infractor.setText("Infractor");

        articulo.setText("Articulo");
        articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articuloActionPerformed(evt);
            }
        });

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
                        .addGap(61, 61, 61)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecheck)
                            .addComponent(lugcheck)
                            .addComponent(artcheck)
                            .addComponent(impcheck)
                            .addComponent(codagcheck)
                            .addComponent(codincheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(importe)
                            .addComponent(articulo, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(agente)
                            .addComponent(infractor)
                            .addComponent(lugar)
                            .addComponent(fecha))
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
                    .addComponent(fecheck)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lugcheck)
                    .addComponent(lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artcheck)
                    .addComponent(articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(impcheck)
                    .addComponent(importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codagcheck)
                    .addComponent(agente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(codincheck)
                    .addComponent(infractor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        String codigoo,fechaa,lugarr,articuloo,importee,agentee,infractorr;
        String sql;//se crean variables para almacenar los datos y la sentencia sql
        codigoo = codigo.getText();
        //obtengo los valores guardados en los jcheck y alcualizo en la base de datos el nombre
        if("".equals(fecha.getText())){
        }
        else{
            fechaa=fecha.getText();
            sql = "UPDATE Infraccion SET Fecha_Infraccion = ? WHERE Codigo_Infraccion = ?";
            try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,fechaa);
            pst.setString(2,codigoo);
            int n;
            n = pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                bloquear();
            }

        } catch (SQLException ex) {
            Logger.getLogger(infraccion_A.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        //obtengo los valores guardados en los jcheck y alcualizo en la base de datos el apellido
        if("".equals(lugar.getText())){
        }
        else{
            lugarr=lugar.getText();
            sql = "UPDATE Infraccion SET Lugar_Infraccion = ? WHERE Codigo_Infraccion = ?";
            try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,lugarr);
            pst.setString(2,codigoo);
            int n;
            n = pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                bloquear();
            }

        } catch (SQLException ex) {
            Logger.getLogger(infraccion_A.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        ////obtengo los valores guardados en los jcheck y alcualizo en la base de datos el nacimiento
        if("".equals(articulo.getText())){
        }
        else{
            articuloo=articulo.getText();
            sql = "UPDATE Infraccion SET Articulo_Multa = ? WHERE Codigo_Infraccion = ?";
            try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,articuloo);
            pst.setString(2,codigoo);
            int n;
            n = pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                bloquear();
            }

        } catch (SQLException ex) {
            Logger.getLogger(infraccion_A.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        //obtengo los valores del jcheck y actualizo en la base de datos el campo domicilio
        if("".equals(importe.getText())){
        }
        else{
            importee=importe.getText();
            sql = "UPDATE Infraccion SET Importe_Infraccion = ? WHERE Codigo_Infraccion = ?";
            try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,importee);
            pst.setString(2,codigoo);
            int n;
            n = pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                bloquear();
            }

        } catch (SQLException ex) {
            Logger.getLogger(infraccion_A.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        //obtengo los datos del jcheck y actualizo en la base de datos el campo placa
        if("".equals(agente.getText())){
        }
        else{
            agentee=agente.getText();
            sql = "UPDATE Infractor SET Codigo_Agente = ? WHERE Codigo_Infractor = ?";
            try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,agentee);
            pst.setString(2,codigoo);
            int n;
            n = pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                bloquear();
            }

        } catch (SQLException ex) {
            Logger.getLogger(infraccion_A.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        //obtengo los datos del jcheck y actualizo el campo codigo tipo infractor en la BD
        if("".equals(infractor.getText())){
        }
        else{
            infractorr=infractor.getText();
            sql = "UPDATE Infraccion SET Fecha_Infraccion = ? WHERE Codigo_Infraccion = ?";
            try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,infractorr);
            pst.setString(2,codigoo);
            int n;
            n = pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro guardado con exito");
                bloquear();
            }

        } catch (SQLException ex) {
            Logger.getLogger(infraccion_A.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void codagcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codagcheckActionPerformed
        if(codagcheck.isSelected()==true){
            agente.setEnabled(true);
        }
        else{
            agente.setEnabled(false);
        }
        agente.requestFocus();
    }//GEN-LAST:event_codagcheckActionPerformed

    private void fecheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecheckActionPerformed
        if(fecheck.isSelected()==true){
            fecha.setEnabled(true);
        }
        else{
            fecha.setEnabled(false);
        }
        fecha.requestFocus();
    }//GEN-LAST:event_fecheckActionPerformed

    private void lugcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugcheckActionPerformed
        if(lugcheck.isSelected()==true){
            lugar.setEnabled(true);
        }
        else{
            lugar.setEnabled(false);
        }
        lugar.requestFocus();
    }//GEN-LAST:event_lugcheckActionPerformed

    private void artcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artcheckActionPerformed
        if(artcheck.isSelected()==true){
            articulo.setEnabled(true);
        }
        else{
            articulo.setEnabled(false);
        }
        articulo.requestFocus();
    }//GEN-LAST:event_artcheckActionPerformed

    private void impcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impcheckActionPerformed
        if(impcheck.isSelected()==true){
            importe.setEnabled(true);
        }
        else{
            importe.setEnabled(false);
        }
        importe.requestFocus();
    }//GEN-LAST:event_impcheckActionPerformed

    private void codincheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codincheckActionPerformed
        if(codincheck.isSelected()==true){
            infractor.setEnabled(true);
        }
        else{
            infractor.setEnabled(false);
        }
        infractor.requestFocus();
    }//GEN-LAST:event_codincheckActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void lugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugarActionPerformed

    private void articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_articuloActionPerformed

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
            java.util.logging.Logger.getLogger(infraccion_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(infraccion_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(infraccion_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(infraccion_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new infraccion_A().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agente;
    private javax.swing.JCheckBox artcheck;
    private javax.swing.JTextField articulo;
    private javax.swing.JCheckBox codagcheck;
    private javax.swing.JTextField codigo;
    private javax.swing.JCheckBox codincheck;
    private javax.swing.JTextField fecha;
    private javax.swing.JCheckBox fecheck;
    private javax.swing.JCheckBox impcheck;
    private javax.swing.JTextField importe;
    private javax.swing.JTextField infractor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lugar;
    private javax.swing.JCheckBox lugcheck;
    // End of variables declaration//GEN-END:variables
}
