/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.persona.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ContorladorBasePersona {

    private BaseDatos miBaseDeDatos;
    SimpleDateFormat formato;

    public ContorladorBasePersona() {

        miBaseDeDatos = new BaseDatos();
        formato = new SimpleDateFormat("yyyy-MM-dd");

    }

    public void crearePer(Persona persona) throws SQLException {

        String fechaBD = formato.format(persona.getFechaNac());
        String sql = "INSERT INTO \"PERSONA\" VALUES('" + persona.getCedula() + "','"
                + persona.getNombre() + "','"
                + persona.getApellido() + "',"
                + persona.getEdad() + ",'"
                + fechaBD + "','"
                + persona.getCelular() + "',"
                + persona.getSueldo() + ");";

        System.out.println("Base de datos " + sql);
        miBaseDeDatos.conectar();

        try {

            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDeDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }

    }

    public Persona readPer(String cedula) {

        Persona per = new Persona();
        try {

            String sql = "SELECT * FROM \"PERSONA\"WHERE\"PER_CEDULA\"='" + cedula + "';";
            System.out.println("Base " + sql);

            miBaseDeDatos.conectar();
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                per.setCedula(res.getString("PER_CEDULA"));
                per.setNombre(res.getString("PER_NOMBRE"));
                per.setApellido(res.getString("PER_APELLIDO"));
                per.setEdad(res.getInt("PER_EDAD"));
                per.setFechaNac(res.getDate("PER_FECHA"));
                per.setCelular(res.getString("PER_CELULAR"));
                per.setSueldo(res.getDouble("PER_SUELDO"));

            }
            res.close();
            sta.close();
            miBaseDeDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
        return per;
    }

    public void updatePer(Persona persona) throws SQLException {

        String fechaBD = formato.format(persona.getFechaNac());
        String sql = "UPDATE \"PERSONA\" SET \"PER_NOMBRE\" = '" + persona.getNombre() + "',\"PER_APELLIDO\" = '"
                + persona.getApellido() + "',\"PER_EDAD\" = "
                + persona.getEdad() + ",\"PER_FECHA\" = '"
                + fechaBD + "',\"PER_CELULAR\" = '"
                + persona.getCelular() + "',\"PER_SUELDO\" = "
                + persona.getSueldo() + " WHERE \"PER_CEDULA\" = '" + persona.getCedula() + "';";
        System.out.println("Base de datos " + sql);

        miBaseDeDatos.conectar();
        try {

            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDeDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }

    }

    public void deletePer(String cedula) throws SQLException {

        String sql = "DELETE FROM \"PERSONA\"WHERE\"PER_CEDULA\"='" + cedula + "';";
        System.out.println("Base eliminada " + sql);

        miBaseDeDatos.conectar();
        try {

            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDeDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }

    }

    public Set printPer() {

        Set<Persona> lista = new HashSet<>();
        try {

            String sql = "SELECT * FROM \"PERSONA\";";
            System.out.println("Base \n" + sql);

            miBaseDeDatos.conectar();
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                Persona per = new Persona();
                per.setCedula(res.getString("PER_CEDULA"));
                per.setNombre(res.getString("PER_NOMBRE"));
                per.setApellido(res.getString("PER_APELLIDO"));
                per.setEdad(res.getInt("PER_EDAD"));
                per.setFechaNac(res.getDate("PER_FECHA"));
                per.setCelular(res.getString("PER_CELULAR"));
                per.setSueldo(res.getDouble("PER_SUELDO"));
                lista.add(per);

            }
            res.close();
            sta.close();
            miBaseDeDatos.desconectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
        return lista;
    }
}
