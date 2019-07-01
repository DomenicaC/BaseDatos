/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo.direccion;


/**
 *
 * @author Domenica Cañizares
 */
public class Direccion {

    private int codigo;
    private String callePrin;
    private String calleSec;
    private int numero;
    private String perCedula;

    public Direccion() {
    }

    public Direccion(int codigo, String callePrin, String calleSec, int numero, String perCedula) {
        this.codigo = codigo;
        this.callePrin = callePrin;
        this.calleSec = calleSec;
        this.numero = numero;
        this.perCedula = perCedula;
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

    public String getperCedula() {
        return perCedula;
    }

    public void setperCedula(String perCedula) {
        this.perCedula = perCedula;
    }

    @Override
    public String toString() {
        return "Direccion{" + "codigo=" + codigo + ", callePrin=" + callePrin + ", calleSec=" + calleSec + ", numero=" + numero + ", cedula=" + perCedula + '}';
    }

}
