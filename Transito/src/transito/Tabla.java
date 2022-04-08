package transito;


import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Tabla extends javax.swing.JFrame {
    
    public Tabla() {
        initComponents();
    }
    public Tabla(String sql){
        initComponents();
        mostrar(sql);
    }
    
    public ResultSet getTabla(String sql){
        conectar con = new conectar();
        Connection cn=con.conexion();
        Statement st;
        ResultSet datos =null;
        try{
            st=cn.createStatement();
            datos = st.executeQuery(sql);            
        }
        catch(Exception e){ 
            System.out.print(e.toString());
        }
        return datos;
    }
    // funcion para rellenar la tabla
    private void mostrar(String tt) {        
        DefaultTableModel modelo = new DefaultTableModel();               
        ResultSet rs = getTabla("SELECT * FROM "+tt);
        if(tt=="Infractor"){//valida si la tabla a mostrar es infractor
        modelo.setColumnIdentifiers(new Object[]{"Codigo_Infractor","Nombre_Infractor", "Apellido_Infractor", "Nacimiento_Infractor","Domicilio_Infractor","Placa_Matriculado","Codigo_Tipo"});
        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getString("Codigo_Infractor"),rs.getString("Nombre_Infractor"),rs.getString("Apellido_Infractor"),rs.getString("Nacimiento_Infractor"),rs.getString("Domicilio_Infractor"),rs.getString("Placa_Matriculado"),rs.getString("Codigo_Tipo")});
            }            
            // asigna el modelo a la tabla
            table.setModel(modelo);            
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        if(tt=="Infraccion"){ //valida si la tabla a mostrar es infraccion
            modelo.setColumnIdentifiers(new Object[]{"Codigo_Infraccion","Fecha_Infraccion", "Lugar_Infraccion", "Articulo_Multa","Importe_Infraccion","Codigo_Agente","Codigo_Infractor"});
            try {
                while (rs.next()) {
                    // añade los resultado a al modelo de tabla
                    modelo.addRow(new Object[]{rs.getString("Codigo_Infraccion"),rs.getString("Fecha_Infraccion"),rs.getString("Lugar_Infraccion"),rs.getString("Articulo_Multa"),rs.getString("Importe_Infraccion"),rs.getString("Codigo_Agente"),rs.getString("Codigo_Infractor")});
                }            
                // asigna el modelo a la tabla
                table.setModel(modelo);            
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        if(tt=="Agente"){ //valida si la tabla a mostrar es agente
            modelo.setColumnIdentifiers(new Object[]{"Codigo_Agente","Nombre_Agente", "Apellido_Agente"});
            try {
                while (rs.next()) {
                    // añade los resultado a al modelo de tabla
                    modelo.addRow(new Object[]{rs.getString("Codigo_Agente"),rs.getString("Nombre_Agente"),rs.getString("Apellido_Agente")});
                }            
                // asigna el modelo a la tabla
                table.setModel(modelo);            
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        if(tt=="Matricula"){ //valida si la tabla a mostrar es agente
            modelo.setColumnIdentifiers(new Object[]{"Placa_Matriculado","Fecha_Matricula", "Codigo_Vehiculo"});
            try {
                while (rs.next()) {
                    // añade los resultado a al modelo de tabla
                    modelo.addRow(new Object[]{rs.getString("Placa_Matriculado"),rs.getString("Fecha_Matricula"),rs.getString("Codigo_Vehiculo")});
                }            
                // asigna el modelo a la tabla
                table.setModel(modelo);            
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        if(tt=="Vehiculo"){ //valida si la tabla a mostrar es agente
            modelo.setColumnIdentifiers(new Object[]{"Codigo_Vehiculo","Codigo_Casa"});
            try {
                while (rs.next()) {
                    // añade los resultado a al modelo de tabla
                    modelo.addRow(new Object[]{rs.getString("Codigo_Vehiculo"),rs.getString("Codigo_Casa")});
                }            
                // asigna el modelo a la tabla
                table.setModel(modelo);            
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        if(tt=="Casa_Automotriz"){ //valida si la tabla a mostrar es agente
            modelo.setColumnIdentifiers(new Object[]{"Codigo_Casa","Nombre_Casa","Direccion_Casa","Codigo_Modelo"});
            try {
                while (rs.next()) {
                    // añade los resultado a al modelo de tabla
                    modelo.addRow(new Object[]{rs.getString("Codigo_Casa"),rs.getString("Nombre_Casa"),rs.getString("Direccion_Casa"),rs.getString("Codigo_Modelo")});
                }            
                // asigna el modelo a la tabla
                table.setModel(modelo);            
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        if(tt=="Tipo_Infractor"){ //valida si la tabla a mostrar es agente
            modelo.setColumnIdentifiers(new Object[]{"Codigo_Tipo","Nombre_Tipo"});
            try {
                while (rs.next()) {
                    // añade los resultado a al modelo de tabla
                    modelo.addRow(new Object[]{rs.getString("Codigo_Tipo"),rs.getString("Nombre_Tipo")});
                }            
                // asigna el modelo a la tabla
                table.setModel(modelo);            
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        if(tt=="Modelo"){ //valida si la tabla a mostrar es agente
            modelo.setColumnIdentifiers(new Object[]{"Codigo_Modelo","Nombre_Modelo","Potencia","Codigo_Marca"});
            try {
                while (rs.next()) {
                    // añade los resultado a al modelo de tabla
                    modelo.addRow(new Object[]{rs.getString("Codigo_Modelo"),rs.getString("Nombre_Modelo"),rs.getString("Potencia"),rs.getString("Codigo_Marca")});
                }            
                // asigna el modelo a la tabla
                table.setModel(modelo);            
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        if(tt=="Marca"){ //valida si la tabla a mostrar es agente
            modelo.setColumnIdentifiers(new Object[]{"Codigo_Marca","Nombre_Marca"});
            try {
                while (rs.next()) {
                    // añade los resultado a al modelo de tabla
                    modelo.addRow(new Object[]{rs.getString("Codigo_Marca"),rs.getString("Nombre_Marca")});
                }            
                // asigna el modelo a la tabla
                table.setModel(modelo);            
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jButton1.setText("VOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(406, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Menu in = new Menu();
        in.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
