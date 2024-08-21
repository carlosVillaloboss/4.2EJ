package inmuebles.vivienda;

public abstract class Apartamento extends InmuebleVivienda {
    protected double valorAdministracion;

    public Apartamento(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, double valorAdministracion) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos);
        this.valorAdministracion = valorAdministracion;
    }
}
