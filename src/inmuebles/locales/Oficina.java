package inmuebles.locales;

public class Oficina extends InmuebleLocal {
    private boolean esGobierno;

    public Oficina(int id, int area, String direccion, String localizacion, boolean esGobierno) {
        super(id, area, direccion, localizacion);
        this.esGobierno = esGobierno;
    }

    @Override
    protected double calcularValorCompra() {
        return area * 3500000; // Valor especifico para oficinas
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Es del gobierno: " + (esGobierno ? "Si" : "No"));
    }
}
