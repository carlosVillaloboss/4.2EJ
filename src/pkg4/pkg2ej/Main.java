/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg2ej;

import inmuebles.vivienda.*;
import inmuebles.locales.*;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de diferentes tipos de inmuebles
        CasaRural casaRural = new CasaRural(1, 150, "Avenida Rural 123", 3, 2, 2, 15.0, 500);
        CasaUrbana casaUrbana = new CasaUrbana(2, 200, "Calle Urbana 456", 4, 3, 3, true, 5000);
        Apartaestudio apartaestudio = new Apartaestudio(3, 50, "Carrera 789", 1000);
        ApartamentoFamiliar apartamentoFamiliar = new ApartamentoFamiliar(4, 100, "Avenida Familiar 101", 3, 2, 2000);
        LocalComercial localComercial = new LocalComercial(5, 80, "Centro Comercial 202", "Calle", "Centro Comercial Plaza");
        Oficina oficina = new Oficina(6, 120, "Oficina 303", "Calle", true);

        // Imprimir los detalles de cada inmueble
        System.out.println("--- Detalles de Inmuebles ---");
        
        System.out.println("\nCasa Rural:");
        casaRural.imprimirDetalles();

        System.out.println("\nCasa Urbana:");
        casaUrbana.imprimirDetalles();

        System.out.println("\nApartaestudio:");
        apartaestudio.imprimirDetalles();

        System.out.println("\nApartamento Familiar:");
        apartamentoFamiliar.imprimirDetalles();

        System.out.println("\nLocal Comercial:");
        localComercial.imprimirDetalles();

        System.out.println("\nOficina:");
        oficina.imprimirDetalles();
    }
}
