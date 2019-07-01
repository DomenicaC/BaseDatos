/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorBaseDireccion;
import ec.edu.ups.modelo.direccion.Direccion;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Domenica Cañizares
 */
public class BuscarDireccionCedula extends javax.swing.JInternalFrame {

    /**
     * Creates new form BuscarDireccionCedula
     */
    ControladorBaseDireccion contDir;

    public BuscarDireccionCedula(ControladorBaseDireccion contDir) {
        initComponents();

        this.contDir = contDir;

        llenarDatos();
    }

    public void llenarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) tblBuscar.getModel();
        Set<Direccion> lista = contDir.printDirCedPer(txtCed.getText());
        for (Direccion dir : lista) {

            Object[] datos = {dir.getCodigo(),
                dir.getCallePrin(),
                dir.getCalleSec(),
                dir.getNumero()
            };
            modelo.addRow(datos);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCed = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        tblBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Calle Principal", "Calle Secundaria", "Numero"
            }
        ));
        jScrollPane1.setViewportView(tblBuscar);

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setText("Cedula");

        txtCed.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton1.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTextField txtCed;
    // End of variables declaration//GEN-END:variables
}