/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.direccion.Direccion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorBaseDireccion {

    private int codigo;
    private BaseDatos miBaseDeDatos;

    public ControladorBaseDireccion() {

        miBaseDeDatos = new BaseDatos();
        codigo = 0;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void crearDir(Direccion direccion) throws SQLException {

        String sql = "INSERT INTO\"DIRECCION\" VALUES(" + direccion.getCodigo() + ",'"
                + direccion.getCallePrin() + "','"
                + direccion.getCalleSec() + "', "
                + direccion.getNumero() + ",'"
                + direccion.getPerCedula() + "')";

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

    public Direccion readDir(int codigo) {

        Direccion direccion = new Direccion();
        try {

            String sql = "SELECT * FROM \"DIRECCION\" WHERE \"DIR_CODIGO\" = '" + codigo + "';";
            System.out.println("Base buscada " + sql);

            miBaseDeDatos.conectar();
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                direccion.setCodigo(codigo);
                direccion.setCallePrin(res.getString("DIR_CALLEPRIN"));
                direccion.setCalleSec(res.getString("DIR_CALLESEC"));
                direccion.setNumero(res.getInt("DIR_NUMERO"));
                direccion.setPerCedula(res.getString("DIR_PER_CEDULA"));

            }

            miBaseDeDatos.desconectar();
            /*res.close();
             sta.close();*/

        } catch (SQLException error) {

            error.printStackTrace();

        }
        return direccion;
    }

    public void updateDir(Direccion direccion) throws SQLException {

        String sql = "UPDATE \"DIRECCION\" SET \"DIR_CALLEPRIN\" = '" + direccion.getCallePrin() + "',\"DIR_CALLESEC\" = '"
                + direccion.getCalleSec() + "',\"DIR_NUMERO\" = "
                + direccion.getNumero() + ",\"DIR_PER_CEDULA\" = '"
                + direccion.getPerCedula() + "' WHERE \"DIR_CODIGO\" = '" + direccion.getCodigo() + "';";
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

    public void deleteDir(int codigo) throws SQLException {

        String sql = "DELETE FROM \"DIRECCION\" WHERE \"DIR_CODIGO\" = '" + codigo + "';";
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

    public void deleteDirPerCed(String cedula) throws SQLException {

        String sql = "DELETE FROM \"DIRECCION\" WHERE \"DIR_PER_CED\" = '" + cedula + "';";
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

    public Set printDir() {

        Set<Direccion> lista = new HashSet<>();
        try {

            String sql = "SELECT * FROM \"DIRECCION\";";
            System.out.println("Base listar " + sql);

            miBaseDeDatos.conectar();
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                Direccion direccion = new Direccion();
                direccion.setCodigo(res.getInt("DIR_CODIGO"));
                direccion.setCallePrin(res.getString("DIR_CALLEPRIN"));
                direccion.setCalleSec(res.getString("DIR_CALLESEC"));
                direccion.setNumero(res.getInt("DIR_NUMERO"));
                direccion.setPerCedula(res.getString("DIR_PER_CEDULA"));
                lista.add(direccion);

            }

            /*res.close();
             sta.close();*/
            miBaseDeDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
        return lista;
    }

    public Set printDirCedPer(String cedula) {

        Set<Direccion> lista = new HashSet<>();
        try {

            String sql = "SELECT * FROM \"DIRECCION\" WHERE \"DIR_PER_CEDULA\"='" + cedula + "';";
            System.out.println("Base listar " + sql);

            miBaseDeDatos.conectar();
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                Direccion direccion = new Direccion();
                direccion.setCodigo(res.getInt("DIR_CODIGO"));
                direccion.setCallePrin(res.getString("DIR_CALLEPRIN"));
                direccion.setCalleSec(res.getString("DIR_CALLESEC"));
                direccion.setNumero(res.getInt("DIR_NUMERO"));
                direccion.setPerCedula(res.getString("DIR_PER_CEDULA"));
                lista.add(direccion);

            }

            /*res.close();
             sta.close();*/
            miBaseDeDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
        return lista;
    }

    public int codigoMax() {
        int cod = 0;
        try {

            String sql = "SELECT MAX (\"DIR_CODIGO\") FROM \"DIRECCION\";";
            System.out.println("Base de datos codigo max" + sql);

            miBaseDeDatos.conectar();
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);
            while (res.next()) {

                cod = res.getInt("max");

            }
            miBaseDeDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
        return cod;
    }
}
