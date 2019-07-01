/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Domenica Cañizares
 */
public class BaseDatos {
    
    //ejecuta los sql de la base de datos
    private Connection conexionBD;

    public Connection getConexionBD() {
        return conexionBD;
    }

    public void setConexionBD(Connection conexionBD) {
        this.conexionBD = conexionBD;
    }

    public BaseDatos() {
    }

    public void conectar() {

        String url = "jdbc:postgresql://localhost:5432/BaseDatos";
        String user = "postgres";
        String password = "johysydanny15";

        try {
            conexionBD = DriverManager.getConnection(url, user, password);
            if (conexionBD.isValid(5000)) {
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException error) {
            System.err.println("Error de conexion" + error.toString());
        }
    }

    public void desconectar() {
        try {
            if (!conexionBD.isClosed()) {

                conexionBD.close();
                System.out.println("Conexion cerrada");
            }
        } catch (SQLException error) {

            error.printStackTrace();

        }
    }

    
}
