/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author chequ
 */

//Esta clase simula al material de laboratorio
public class Material {
    private int id;
    private String nombre;
    private int cantidadDisponible;
    private int cantidadPrestada;
    private String descripcion;

    public Material(int id, String nombre, int cantidad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadDisponible = cantidad;
        this.descripcion = descripcion;
    }

    public Material(int id, String nombre, int cantidad, int cantidadPrestada, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadDisponible = cantidad;
        this.cantidadPrestada = cantidadPrestada;
        this.descripcion = descripcion;
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

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidad) {
        this.cantidadDisponible = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public int getCantidadPrestada() {
        return cantidadPrestada;
    }

    public void setCantidadPrestada(int cantidadPrestada) {
        this.cantidadPrestada = cantidadPrestada;
    }
    
        
    
    
}

