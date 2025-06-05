import java.util.ArrayList;

public class Coche {

    private String marca;
    private int año;
    private ArrayList<String> pasajeros;

    public Coche(String marca, int año) {
        this.marca = marca;
        this.año = año;
        this.pasajeros = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void arrancar() {
        System.out.println("El coche está arrancando.");
    }

    public void detener() {
        System.out.println("El coche se ha detenido.");
    }

    public boolean añadirPasajero(String nombre) {
        if (pasajeros.size() < 5) {
            pasajeros.add(nombre);
            return true;
        } else {
            return false;
        }
    }

    public double calcularAntiguedad() {
        int añoActual = java.time.Year.now().getValue();
        return añoActual - this.año;
    }
}
