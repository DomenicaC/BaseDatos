/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Domenica Cañizares
 */
public class Direccion {

    private int codigo;
    private String callePrin;
    private String calleSec;
    private int numero;
    private Persona persona;

    public Direccion() {
    }

    public Direccion(int codigo, String callePrin, String calleSec, int numero, Persona persona) {
        this.codigo = codigo;
        this.callePrin = callePrin;
        this.calleSec = calleSec;
        this.numero = numero;
        this.persona = persona;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCallePrin() {
        return callePrin;
    }

    public void setCallePrin(String callePrin) {
        this.callePrin = callePrin;
    }

    public String getCalleSec() {
        return calleSec;
    }

    public void setCalleSec(String calleSec) {
        this.calleSec = calleSec;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Direccion{" + "codigo=" + codigo + ", callePrin=" + callePrin + ", calleSec=" + calleSec + ", numero=" + numero + ", cedula=" + persona.getCedula() + '}';
    }

}
