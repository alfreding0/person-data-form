package main;

import javax.swing.JOptionPane;

/** @author alfred */
public class FormularioPerson extends javax.swing.JFrame {
    private final String [] datos;
    
    public FormularioPerson() {
        initComponents();
        
        this.datos = new String[4];
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtadatos = new javax.swing.JTextArea();
        guardar = new javax.swing.JButton();
        direccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        celular = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtlimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Person Data");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtadatos.setEditable(false);
        jtadatos.setColumns(20);
        jtadatos.setRows(5);
        jScrollPane1.setViewportView(jtadatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 320, 190));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 180, -1));

        jLabel2.setText("Dirección:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 23));

        jLabel5.setText("Celular/Teléfono:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, 23));
        jPanel1.add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 180, -1));
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 180, -1));

        jLabel4.setText("Cédula:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 23));

        jLabel3.setText("Nombre completo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 23));
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 180, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE DATOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 220, 37));

        jbtlimpiar.setText("Limpiar");
        jbtlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jButton1.setText("Hello!");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        this.guardar();
    }//GEN-LAST:event_guardarActionPerformed

    private void jbtlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtlimpiarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_jbtlimpiarActionPerformed

    //METODOS PROPIOS
    private void obtenerDatos(){
        datos[0] = nombre.getText();
        datos[1] = cedula.getText();
        datos[2] = celular.getText();
        datos[3] = direccion.getText();
    }
    
    private void guardar(){
        if(this.camposLLenos()){
            this.obtenerDatos();
            for (String dato : datos) {
                jtadatos.append(dato+"\n");
            }
            this.guardar.setEnabled(false);
            jbtlimpiar.requestFocus();
        }else
            JOptionPane.showMessageDialog(rootPane, "Complete todos los campos.");
    }
    
    private void limpiar(){
        nombre.setText("");
        cedula.setText("");
        celular.setText("");
        direccion.setText("");
        jtadatos.setText("");
        this.guardar.setEnabled(true);
        this.nombre.requestFocus();
    }
    
    private boolean camposLLenos(){
        return !(nombre.getText().equals("") || cedula.getText().equals("") || celular.getText().equals("") || direccion.getText().equals(""));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField celular;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtlimpiar;
    private javax.swing.JTextArea jtadatos;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
