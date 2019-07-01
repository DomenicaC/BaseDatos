/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Direccion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorBaseDireccion {

    private BaseDatos miBaseDeDatos;

    public ControladorBaseDireccion() {

        miBaseDeDatos = new BaseDatos();

    }

    public void crearDir(Direccion direccion) {

        String sql = "INSERT INTO \"DIRECCION\"VALUES(" + direccion.getCodigo() + ",'"
                + direccion.getCallePrin() + "','"
                + direccion.getCalleSec() + "',"
                + direccion.getNumero() + ",'"
                + direccion.getPersona() + ");";
        System.out.println("Base creada " + sql);
        miBaseDeDatos.conectar();

        try {

            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDeDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }

    }

    public Direccion readDir(String codigo) {

        Direccion direccion = new Direccion();
        try {

            String sql = "SELECT * FROM \"DIRECCION \"WHERE \"DIR_CODIGO \"=" + codigo + ";";
            System.out.println("Base buscada " + sql);

            miBaseDeDatos.conectar();
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                direccion.setCodigo(res.getInt(codigo));
                direccion.setCallePrin(res.getString("DIR_CALLEPRIN"));
                direccion.setCalleSec(res.getString("DIR_CALLESEC"));
                direccion.setNumero(res.getInt("DIR_NUMERO"));
                //direccion.setPersona("DIR_CEDULA");

            }

            res.close();
            sta.close();
            miBaseDeDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
        return direccion;
    }

    public void updateDir(int codigo) {

        Direccion direccion = null;
        String sql = "UPDATE \"DIRECCION \"SET(" + direccion.getCodigo() + ",'"
                + direccion.getCallePrin() + "','"
                + direccion.getCalleSec() + "',"
                + direccion.getNumero() + ","
                + direccion.getPersona() + ") \"WHERE \"DIR_CODIGO \"=" + codigo + ";";
        System.out.println("Base modificada " + sql);

        miBaseDeDatos.conectar();
        try {

            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDeDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
    }

    public void deleteDir(int codigo) {

        String sql = "DELETE FROM \"DIRECCION \"WHERE \"DIR_CODIGO \"=" + codigo + ";";
        System.out.println("Base Eliminada " + sql);

        miBaseDeDatos.conectar();
        try {

            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDeDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
    }

    public Direccion printDir() {

        Direccion direccion = new Direccion();
        try {

            String sql = "SELECT * FROM \"DIRECCION \"';";
            System.out.println("Base listar "+sql);

            miBaseDeDatos.conectar();
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);
            
            while(res.next()){
                
                direccion.setCodigo(res.getInt("DIR_CODIGO"));
                direccion.setCallePrin(res.getString("DIR_CALLEPRIN"));
                direccion.setCalleSec(res.getString("DIR_CALLESEC"));
                //direccion.setPersona(res.getString("DIR_CEDULA"));
                
            }
            
            res.close();
            sta.close();
            miBaseDeDatos.desconectar();
            
        }catch(SQLException error){
            
            error.printStackTrace();
            
        }
        return direccion;
    }
}
