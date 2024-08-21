package inmuebles.vivienda;

public class CasaRural extends Casa {
    private double distanciaCabecera;
    private double altitud;

    public CasaRural(int id, int area, String direccion, int numeroHabitaciones, int numeroBanos, int pisos, double distanciaCabecera, double altitud) {
        super(id, area, direccion, numeroHabitaciones, numeroBanos, pisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    @Override
    protected double calcularValorCompra() {
        return area * 1500000; // Valor especifico para casas rurales
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Distancia a la cabecera municipal: " + distanciaCabecera + " km");
        System.out.println("Altitud sobre el nivel del mar: " + altitud + " m");
    }
}
