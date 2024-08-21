package inmuebles.vivienda;

import inmuebles.Inmueble;

public abstract class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBanos;

    public InmuebleVivienda(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(id, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }

    @Override
    protected abstract double calcularValorCompra();
}
