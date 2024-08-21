package inmuebles.locales;

public class LocalComercial extends InmuebleLocal {
    private String centroComercial;

    public LocalComercial(int id, int area, String direccion, String localizacion, String centroComercial) {
        super(id, area, direccion, localizacion);
        this.centroComercial = centroComercial;
    }

    @Override
    protected double calcularValorCompra() {
        return area * 3000000; // Valor especifico para locales comerciales
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Centro comercial: " + centroComercial);
    }
}
