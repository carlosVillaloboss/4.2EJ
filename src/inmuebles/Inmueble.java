/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmuebles;

public abstract class Inmueble {
    protected int id;
    protected int area;
    protected String direccion;
    protected double valorCompra;

    public Inmueble(int id, int area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion = direccion;
        this.valorCompra = calcularValorCompra();
    }

    protected abstract double calcularValorCompra();

    public void imprimirDetalles() {
        System.out.println("ID: " + id);
        System.out.println("Area: " + area + " m²");
        System.out.println("Direccion: " + direccion);
        System.out.println("Valor de Compra: $" + valorCompra);
    }
}


