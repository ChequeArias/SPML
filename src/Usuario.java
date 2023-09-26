/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author chequ
 */

// Esta clase simula al usuario, puede ser estudiante o encargado
public class Usuario {
 
    private int id;
    private String nombre;
    private String contrasena;
    private String rol;
    
    public Usuario(int idUsuario, String nombre, String contraseña, String rol) {
        this.id = idUsuario;
        this.nombre = nombre;
        this.contrasena = contraseña;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", contrasena=" + contrasena + ", rol=" + rol + '}';
    }
    
    
    
    
}
