/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author Domenica Cañizares
 */
public class ContorladorBasePersona {

    private BaseDatos miBaseDeDatos;

    public ContorladorBasePersona() {

        miBaseDeDatos = new BaseDatos();

    }

    public void crearePer(Persona persona) {

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
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

                per.setCedula(cedula);
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

    public void updatePer(String cedula) {
        Persona persona = null;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaBD = formato.format(persona.getFechaNac());
        String sql = "UPDATE \"PERSONA \" SET('" + persona.getCedula() + "','"
                + persona.getNombre() + "','"
                + persona.getApellido() + "',"
                + persona.getEdad() + ",'"
                + fechaBD + "','"
                + persona.getCelular() + "',"
                + persona.getSueldo() + ")\"WHERE \"PER_CEDULA\"='" + cedula + "';";
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

    public void deletePer(String cedula) {

        String sql = "DELETE FROM \"PERSONA \"WHERE \"PER_CEDULA \"='" + cedula + "';";
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
    
    public Persona printPer(){
        
        Persona per = new Persona();
        try {

            String sql = "SELECT * FROM \"PERSONA\"';";
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
}
