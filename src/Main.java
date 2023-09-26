/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author chequ
 */
// Clase main para hacer pruebas
public class Main {
    public static void main(String[] args) {
       
        Usuario usuarioEjemplo = new Usuario(1162711, "Jose Arias", "Contraseña123", "Estudiante");
        Material material1 = new Material(1, "Multimetro", 5,"Multimetro");
        Material material2 = new Material(2, "Protoboard", 3,"Protoboard");
        Material material3 = new Material(3,"Resistencia",100,"Resistencia");
        Prestamo prestamoEjemplo = new Prestamo(1, new Date(), new Date(), usuarioEjemplo, Arrays.asList(material1, material2));
        
        Almacen almacen = new Almacen();
        almacen.agregarMaterial(material1);
        almacen.agregarMaterial(material2);
        almacen.agregarMaterial(material3);
        
        // Realizar un préstamo
        almacen.realizarPrestamo(prestamoEjemplo);
        System.out.println("Material solicitado en el prestamo: ");
        for (Material materialPrestado : prestamoEjemplo.getMaterialesPrestados()) 
        {
            System.out.println("- " + materialPrestado.getNombre());
        }
        
        // Mostrar el estado del material después del préstamo
        System.out.println("Se realizo el prestamo y se actualizaron las cantidades del material");
        System.out.println("Cantidad de Multimetros disponibles: " + material1.getCantidadDisponible());
        System.out.println("Cantidad de Protoboards disponibles: " + material2.getCantidadDisponible());
        System.out.println("Cantidad de Resistencias disponibles: " + material3.getCantidadDisponible());
        // Devolver el material prestado
        almacen.devolverMaterial(prestamoEjemplo);
        
        // Mostrar el estado del material después de la devolución
        System.out.println("Se realizo la devolucion y se actualizaron las cantidades del material");
        System.out.println("Cantidad de Multimetros disponibles: " + material1.getCantidadDisponible());
        System.out.println("Cantidad de Protoboards disponibles: " + material2.getCantidadDisponible());
        System.out.println("Cantidad de Resistencias disponibles: " + material3.getCantidadDisponible());
    }
}

