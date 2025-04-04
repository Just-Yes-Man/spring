package com.spring.spring.models;

public class User {
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String direccion;

    public User(String nombre, String apellidos, String correo, String telefono, String direccion) {
        this.apellidos = apellidos;
        this.correo = correo;
        this.direccion = direccion;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    


       
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public String getApellidos() {
        return apellidos;
    }
  
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
