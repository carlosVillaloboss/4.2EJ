package inmuebles.vivienda;

public class CasaUrbana extends Casa {
    private boolean enConjuntoCerrado;
    private double valorAdministracion;

    public CasaUrbana(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int pisos, boolean enConjuntoCerrado, double valorAdministracion) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos, pisos);
        this.enConjuntoCerrado = enConjuntoCerrado;
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    protected double calcularValorCompra() {
        if (enConjuntoCerrado) {
            return area * 2500000; // Valor especifico para casas en conjunto cerrado
        } else {
            return area * 3000000; // Valor especifico para casas independientes
        }
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("En conjunto cerrado: " + (enConjuntoCerrado ? "Si" : "No"));
        System.out.println("Valor de administracion: $" + valorAdministracion);
    }
}
