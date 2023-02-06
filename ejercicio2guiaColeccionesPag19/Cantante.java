package ejercicio2guiaColeccionesPag19;

public class Cantante{
    protected String nombre;
    protected String discoConMasVentas;

    public Cantante(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }
    @Override
    public String toString() {
        return "Cantante{" +
                "nombre='" + nombre + '\'' +
                ", discoConMasVentas='" + discoConMasVentas + '\'' +
                '}';
    }

}
