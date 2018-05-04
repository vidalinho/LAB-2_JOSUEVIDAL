/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2_josuevidal;

/**
 *
 * @author josue
 */
public class modCuenta {

    private int nCuenta;
    private String fNacimiento;
    private int edad;
    private String ciudad;
    private String nac;
    private int id;
    private String usuario;
    private String contra;
    private int notas;

    modCuenta(int ncuenta, String nacimiento, int edad, String ciudad, String nacionalidad, int ID, String user, String password, int notas) {
        this.nCuenta = ncuenta;
        this.fNacimiento = nacimiento;
        this.edad = edad;
        this.ciudad = ciudad;
        this.nac = nacionalidad;
        this.id = ID;
        this.usuario = user;
        this.contra = password;
        this.notas = notas;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNac() {
        return nac;
    }

    public void setNac(String nac) {
        this.nac = nac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }
}
