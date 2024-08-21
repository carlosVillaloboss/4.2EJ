package inmuebles.vivienda;

public class Apartaestudio extends Apartamento {
    public Apartaestudio(int id, int area, String direccion, double valorAdministracion) {
        super(id, area, direccion, 1, 1, valorAdministracion);
    }

    @Override
    protected double calcularValorCompra() {
        return area * 1500000; // Valor especifico para apartaestudios
    }
}
