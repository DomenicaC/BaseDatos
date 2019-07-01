/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ContorladorBasePersona;
import ec.edu.ups.controlador.ControladorBaseDireccion;
import ec.edu.ups.modelo.direccion.BuscarDir;
import ec.edu.ups.modelo.direccion.CrearDir;
import ec.edu.ups.modelo.direccion.ModificarDir;
import ec.edu.ups.modelo.persona.Buscar;
import ec.edu.ups.modelo.persona.Crear;
import ec.edu.ups.modelo.persona.Eliminar;
import ec.edu.ups.modelo.persona.Listar;
import ec.edu.ups.modelo.persona.Modificar;
import ec.edu.ups.modelo.persona.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author Domenica Cañizares
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    private ContorladorBasePersona contPer;
    private ControladorBaseDireccion contDir;

    //persona
    private Crear crearP;
    private Buscar buscarP;
    private Modificar modP;
    private Eliminar eliP;
    private Listar listarP;

    //direccion
    private CrearDir crearD;
    private BuscarDir buscarD;
    private ModificarDir modDir;

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        contDir = new ControladorBaseDireccion();
        contPer = new ContorladorBasePersona();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuPersona = new javax.swing.JMenu();
        itemCrear = new javax.swing.JMenuItem();
        itemBuscar = new javax.swing.JMenuItem();
        itemMod = new javax.swing.JMenuItem();
        itemEli = new javax.swing.JMenuItem();
        itemListar = new javax.swing.JMenuItem();
        itemDir = new javax.swing.JMenu();
        itemCrear1 = new javax.swing.JMenuItem();
        itemBuscar1 = new javax.swing.JMenuItem();
        itemMod1 = new javax.swing.JMenuItem();
        itemEli1 = new javax.swing.JMenuItem();
        itemListar1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPersona.setMnemonic('f');
        menuPersona.setText("Persona");

        itemCrear.setMnemonic('o');
        itemCrear.setText("Crear");
        itemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearActionPerformed(evt);
            }
        });
        menuPersona.add(itemCrear);

        itemBuscar.setMnemonic('s');
        itemBuscar.setText("Buscar");
        itemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarActionPerformed(evt);
            }
        });
        menuPersona.add(itemBuscar);

        itemMod.setMnemonic('a');
        itemMod.setText("Modificar");
        itemMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModActionPerformed(evt);
            }
        });
        menuPersona.add(itemMod);

        itemEli.setMnemonic('x');
        itemEli.setText("Eliminar");
        itemEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliActionPerformed(evt);
            }
        });
        menuPersona.add(itemEli);

        itemListar.setMnemonic('x');
        itemListar.setText("Listar");
        itemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListarActionPerformed(evt);
            }
        });
        menuPersona.add(itemListar);

        menuBar.add(menuPersona);

        itemDir.setMnemonic('e');
        itemDir.setText("Direccion");

        itemCrear1.setMnemonic('o');
        itemCrear1.setText("Crear");
        itemCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrear1ActionPerformed(evt);
            }
        });
        itemDir.add(itemCrear1);

        itemBuscar1.setMnemonic('s');
        itemBuscar1.setText("Buscar");
        itemBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscar1ActionPerformed(evt);
            }
        });
        itemDir.add(itemBuscar1);

        itemMod1.setMnemonic('a');
        itemMod1.setText("Modificar");
        itemMod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMod1ActionPerformed(evt);
            }
        });
        itemDir.add(itemMod1);

        itemEli1.setMnemonic('x');
        itemEli1.setText("Eliminar");
        itemEli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEli1ActionPerformed(evt);
            }
        });
        itemDir.add(itemEli1);

        itemListar1.setMnemonic('x');
        itemListar1.setText("Listar");
        itemListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListar1ActionPerformed(evt);
            }
        });
        itemDir.add(itemListar1);

        menuBar.add(itemDir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliActionPerformed

        String x = Eliminar.x;
        try {
            if (x == null) {
                if (eliP == null || eliP.isVisible() == false) {
                    eliP = new Eliminar(contPer, contDir);
                    desktopPane.add(eliP);
                    desktopPane.moveToFront(eliP);

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_itemEliActionPerformed

    private void itemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListarActionPerformed

        String x = Listar.x;
        try {
            if (x == null) {
                if (listarP == null || listarP.isVisible() == false) {
                    listarP = new Listar(contPer);
                    desktopPane.add(listarP);
                    desktopPane.moveToFront(listarP);

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_itemListarActionPerformed

    private void itemEli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEli1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEli1ActionPerformed

    private void itemListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemListar1ActionPerformed

    private void itemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearActionPerformed

        String x = Crear.x;
        try {
            if (x == null) {
                if (crearP == null || crearP.isVisible() == false) {
                    crearP = new Crear(contPer);
                    desktopPane.add(crearP);
                    desktopPane.moveToFront(crearP);

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_itemCrearActionPerformed

    private void itemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarActionPerformed

        String x = Buscar.x;
        try {
            if (x == null) {
                if (buscarP == null || buscarP.isVisible() == false) {
                    buscarP = new Buscar(contPer);
                    desktopPane.add(buscarP);
                    desktopPane.moveToFront(buscarP);

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_itemBuscarActionPerformed

    private void itemModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemModActionPerformed

        String x = Modificar.x;
        try {
            if (x == null) {
                if (modP == null || modP.isVisible() == false) {
                    modP = new Modificar(contPer);
                    desktopPane.add(modP);
                    desktopPane.moveToFront(modP);

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_itemModActionPerformed

    private void itemCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrear1ActionPerformed

        String x = CrearDir.x;
        try {
            if (x == null) {

                if (crearD == null || crearD.isVisible() == false) {
                    crearD = new CrearDir(contDir, contPer);
                    desktopPane.add(crearD);
                    desktopPane.moveToFront(crearD);

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_itemCrear1ActionPerformed

    private void itemBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscar1ActionPerformed
        
        String x = BuscarDir.x;
        try {
            if (x == null) {

                if (buscarD == null || buscarD.isVisible() == false) {
                    buscarD = new BuscarDir(contDir, contPer);
                    desktopPane.add(buscarD);
                    desktopPane.moveToFront(buscarD);

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_itemBuscar1ActionPerformed

    private void itemMod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMod1ActionPerformed
        
        String x = ModificarDir.x;
        try {
            if (x == null) {

                if (modDir == null || modDir.isVisible() == false) {
                    modDir = new ModificarDir(contDir, contPer);
                    desktopPane.add(modDir);
                    desktopPane.moveToFront(modDir);

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "La ventana ya esta abierta");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_itemMod1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem itemBuscar;
    private javax.swing.JMenuItem itemBuscar1;
    private javax.swing.JMenuItem itemCrear;
    private javax.swing.JMenuItem itemCrear1;
    private javax.swing.JMenu itemDir;
    private javax.swing.JMenuItem itemEli;
    private javax.swing.JMenuItem itemEli1;
    private javax.swing.JMenuItem itemListar;
    private javax.swing.JMenuItem itemListar1;
    private javax.swing.JMenuItem itemMod;
    private javax.swing.JMenuItem itemMod1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuPersona;
    // End of variables declaration//GEN-END:variables

}
