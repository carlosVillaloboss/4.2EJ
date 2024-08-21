package inmuebles.vivienda;

public abstract class Casa extends InmuebleVivienda {
    protected int pisos;

    public Casa(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int pisos) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos);
        this.pisos = pisos;
    }
}
