import java.util.ArrayList;

/**
 * Classe que representa un cotxe
 * @author joapuiiba
 */
public class Coche {

    /**
     * Marca del cotxe
     */
    private String marca;
    /**
     * Any de fabricació
     */
    private int año;
    /**
     * Llista de passatjers del cotxe
     */
    private ArrayList<String> pasajeros;

    
    /**
     * Crea un cotxe especificant la marca i l'any de fabricació
     * @param marca Marca del cotxe
     * @param año Any de fabricació del cotxe
     */
    public Coche(String marca, int año) {
        this.marca = marca;
        this.año = año;
        this.pasajeros = new ArrayList<>();
    }

    /**
     * Obté la marca del cotxe
     * @return Marca del cotxe
     */
    public String getMarca() {
        return marca;
    }

    
    /**
     * Estableix la marca del cotxe
     * @param marca Nova marca del cotxe
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obté l'any de fabricació del cotxe
     * @return Any de fabricació del cotxe
     */
    public int getAño() {
        return año;
    }

    /**
     * Estableix l'any de fabricació del cotxe
     * @param año Nou any de frabricació
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Arranca el cotxe
     */
    public void arrancar() {
        System.out.println("El coche está arrancando.");
    }

    /**
     * Deté el cotxe
     */
    public void detener() {
        System.out.println("El coche se ha detenido.");
    }

    /**
     * Afegeix un nou passatjer al cotxe si cap. Com a màxim es permeten 5 passatjers.
     * @param nombre Nom del nou passatjer
     * @return true si s'ha pogut afegir el passatjer al cotxe; false en cas contrari
     */
    public boolean añadirPasajero(String nombre) {
        if (pasajeros.size() < 5) {
            pasajeros.add(nombre);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calcula l'antiguetat del cotxe en anys
     * @return Anys d'antiguetat del cotxe
     */
    public double calcularAntiguedad() {
        int añoActual = java.time.Year.now().getValue();
        return añoActual - this.año;
    }
}
