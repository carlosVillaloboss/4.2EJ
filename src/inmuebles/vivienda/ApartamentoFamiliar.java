package inmuebles.vivienda;

public class ApartamentoFamiliar extends Apartamento {
    public ApartamentoFamiliar(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, double valorAdministracion) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos, valorAdministracion);
    }

    @Override
    protected double calcularValorCompra() {
        return area * 2000000; // Valor especifico para apartamentos familiares
    }
}
