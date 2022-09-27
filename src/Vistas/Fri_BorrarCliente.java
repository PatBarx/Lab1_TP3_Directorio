/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JOptionPane;
import lab1_tp3_directorio.Cliente;
import lab1_tp3_directorio.Telefono;

/**
 *
 * @author Pat
 */
public class Fri_BorrarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Fri_Cliente
     */
    public Fri_BorrarCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtf_telefono = new javax.swing.JTextField();
        jtf_apellido = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        jtf_ciudad = new javax.swing.JTextField();
        jtf_dni = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_ciudad = new javax.swing.JLabel();
        lbl_dni = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 153));
        setBorder(null);
        setClosable(true);
        setTitle("FORMULARIO BORRAR CLIENTE");

        jPanel1.setBackground(new java.awt.Color(52, 58, 70));

        jtf_telefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtf_telefono.setForeground(new java.awt.Color(153, 0, 102));

        jtf_apellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtf_apellido.setForeground(new java.awt.Color(102, 0, 51));

        jtf_nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtf_nombre.setForeground(new java.awt.Color(102, 0, 51));

        jtf_ciudad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtf_ciudad.setForeground(new java.awt.Color(102, 0, 51));

        jtf_dni.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtf_dni.setForeground(new java.awt.Color(102, 0, 51));

        lbl_telefono.setText("TELEFONO:");

        lbl_apellido.setText("APELLIDO:");

        lbl_nombre.setText("NOMBRE:");

        lbl_ciudad.setText("CIUDAD:");

        lbl_dni.setText("DNI:");

        btn_buscar.setBackground(new java.awt.Color(102, 0, 102));
        btn_buscar.setForeground(new java.awt.Color(153, 255, 255));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/lupa48x48.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_salir.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        btn_salir.setForeground(new java.awt.Color(153, 204, 255));
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_borrar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        btn_borrar.setForeground(new java.awt.Color(255, 102, 102));
        btn_borrar.setText("¡ B O R R A R !");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(241, 241, 241))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                .addGap(61, 61, 61))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btn_buscar)
                        .addGap(186, 186, 186))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtf_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                    .addComponent(jtf_ciudad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_apellido, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_telefono)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(lbl_apellido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_nombre)
                                        .addGap(9, 9, 9)
                                        .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_ciudad)
                                        .addGap(9, 9, 9)
                                        .addComponent(jtf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15)
                                .addComponent(lbl_dni)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        Telefono tel = new Telefono(Long.parseLong(jtf_telefono.getText()));
        Cliente cli = Frm_TP3_NewJframeMain.guiaTel.buscarCliente(tel);
        if (cli != null) {
            jtf_apellido.setText(cli.getApellido());
            jtf_nombre.setText(cli.getNombre());
            jtf_ciudad.setText(cli.getDireccion().getNombreCiudad());
            jtf_dni.setText(String.valueOf(cli.getDni()));
        } else {
            JOptionPane.showMessageDialog(null, "Linea no registrada");
        }
    
        /* Telefono tel = new Telefono(Long.parseLong(jtf_tel.getText()));        
        if (Frm_TP3_NewJframeMain.guiaTel.borrarCliente(tel)) {
                        System.out.println("Cliente Borrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo realizar la operacion");
                    }
        */
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        Telefono tel = new Telefono(Long.parseLong(jtf_telefono.getText()));
        if (Frm_TP3_NewJframeMain.guiaTel.borrarCliente(tel)) {
            JOptionPane.showMessageDialog(null,"Cliente Borrado");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la operacion");
        }
    }//GEN-LAST:event_btn_borrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtf_apellido;
    private javax.swing.JTextField jtf_ciudad;
    private javax.swing.JTextField jtf_dni;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_telefono;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_ciudad;
    private javax.swing.JLabel lbl_dni;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    // End of variables declaration//GEN-END:variables
}
