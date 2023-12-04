/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;


public class Clientes {
    private String IdClientes;
    private String Nombres;
    private String Apellidos;
    private String Ciudad;
    private String Direccion;
    private String Telefono;

    public Clientes(String IdClientes, String Nombres, String Apellidos, String Ciudad, String Direccion, String Telefono) {
        this.IdClientes = IdClientes;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }
    
    public Clientes(){
        
    }

    public Clientes(String nombre, String apellido, String edad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     public String getIdClientes() {
        return IdClientes;
    }

    public void setIdClientes(String IdClientes) {
        this.IdClientes = IdClientes;
    }
    ///
    public String getNombres() {
        return Nombres;
    }

    public void setNombre(String Nombres) {
        this.Nombres = Nombres;
    }

    ///
    
    public String getApellidos() {
        return Apellidos;
    }

    public void setApellido(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    ///
    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    ///
    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    ///
     public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Direccion;
    }
    
    ///
    public Object[] toArray(){
        Object[] obj = new Object[6];
        
        obj[0] = IdClientes;
        obj[1] = Nombres;
        obj[2] = Apellidos;
        obj[3] = Ciudad;
        obj[4] = Direccion;
        obj[5] = Telefono;
        
        return obj;
    }
    
    
}
