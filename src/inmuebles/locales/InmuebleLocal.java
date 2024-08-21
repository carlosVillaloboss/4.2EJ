package inmuebles.locales;

import inmuebles.Inmueble;

public abstract class InmuebleLocal extends Inmueble {
    protected String localizacion;

    public InmuebleLocal(int id, int area, String direccion, String localizacion) {
        super(id, area, direccion);
        this.localizacion = localizacion;
    }
}
