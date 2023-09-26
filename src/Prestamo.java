/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author chequ
 */

// Esta clase simula un prestamo

import java.util.Date;
import java.util.List;

public class Prestamo {
    private int idPrestamo;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Usuario usuario;
    private List<Material> materialesPrestados;

    public Prestamo(int idPrestamo, Date fechaPrestamo, Date fechaDevolucion, Usuario usuario, List<Material> materialesPrestados) {
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.usuario = usuario;
        this.materialesPrestados = materialesPrestados;
    }

   

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Material> getMaterialesPrestados() {
        return materialesPrestados;
    }

    public void setMaterialesPrestados(List<Material> materialesPrestados) {
        this.materialesPrestados = materialesPrestados;
    }

    @Override
    public String toString() {
        return "ID del Préstamo: " + idPrestamo +
               "\nFecha de Préstamo: " + fechaPrestamo +
               "\nFecha de Devolución: " + fechaDevolucion +
               "\nUsuario: " + usuario.getNombre() +
               "\nMateriales Prestados: " + materialesPrestados.size() + " materiales";
    }
}
