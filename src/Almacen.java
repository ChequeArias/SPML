/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author chequ
 */

// Esta clase simula al almacen de laboratorio
import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Material> materialesDisponibles;

    public Almacen() {
        this.materialesDisponibles = new ArrayList<>();
    }

    public void agregarMaterial(Material material) {
        materialesDisponibles.add(material);
    }

    public Material buscarMaterialPorNombre(String nombre) {
        for (Material material : materialesDisponibles) {
            if (material.getNombre().equalsIgnoreCase(nombre)) {
                return material;
            }
        }
        return null; 
    }

    public void realizarPrestamo(Prestamo prestamo) {
    for (Material material : prestamo.getMaterialesPrestados()) {
        Material materialEnAlmacen = buscarMaterialPorNombre(material.getNombre());
        if (materialEnAlmacen != null) {
            int cantidadDisponible = materialEnAlmacen.getCantidadDisponible();
            if (cantidadDisponible > 0) {
                materialEnAlmacen.setCantidadDisponible(cantidadDisponible - 1);
            } else {
                System.out.println("No hay suficiente cantidad de " + material.getNombre() + " en el almacen.");
            }
        } else {
            System.out.println("El material " + material.getNombre() + " no está en el almacen.");
        }
    }
}


    public void devolverMaterial(Prestamo prestamo) {
        for (Material material : prestamo.getMaterialesPrestados()) {
            Material materialEnAlmacen = buscarMaterialPorNombre(material.getNombre());
            if (materialEnAlmacen != null) {
                int cantidadDisponible = materialEnAlmacen.getCantidadDisponible();
                materialEnAlmacen.setCantidadDisponible(cantidadDisponible + 1);
            } else {
                System.out.println("El material " + material.getNombre() + " no está en el almacen.");
            }
        }
    }

    
}

